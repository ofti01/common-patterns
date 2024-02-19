package com.lotfi.departmentservice.repository;

import com.lotfi.departmentservice.model.Department;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class DepartmentRepositoryTests {
    private DepartmentRepository departmentRepository;

    @Test
    public void departmentRepository_findDepartmentByName_ReturnOneDepartment(){
        //Arrange
        Department department = Department.builder()
                .name("filo")
                .build();

        //Act
        departmentRepository.save(department);
        List<Department> departmentList = departmentRepository.findDepartmentByNameContainingIgnoreCase("ilo");

        //Assert
        Assertions.assertThat(departmentList.size()).isEqualTo(1);

    }
}
