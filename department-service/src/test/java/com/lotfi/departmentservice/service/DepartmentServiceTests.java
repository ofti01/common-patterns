package com.lotfi.departmentservice.service;

import com.lotfi.departmentservice.dto.DepartmentDto;
import com.lotfi.departmentservice.model.Department;
import com.lotfi.departmentservice.repository.DepartmentRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTests {


    @Mock
    private DepartmentRepository departmentRepository;

    @InjectMocks
    private DepartmentService departmentService;

    @Test
    public void DepartmentService_findByName_ReturnDocumentDto(){
        //Arrange
        Department department = Department.builder()
                .name("physique")
                .build();

        List<Department> departments = new ArrayList<>();
        departments.add(department);
        //Act
        Object pokemon;
        when(departmentRepository.findDepartmentByNameContainingIgnoreCase("ysi")).thenReturn(departments);

        List<DepartmentDto> departmentDtoList = departmentService.findByName("ysi");

        //Asset


        Assertions.assertThat(departmentDtoList).isNotNull();
    }


}
