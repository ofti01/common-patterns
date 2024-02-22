package com.lotfi.departmentservice.service;

import com.lotfi.departmentservice.dto.DepartmentDto;
import com.lotfi.departmentservice.model.Department;
import com.lotfi.departmentservice.repository.DepartmentRepository;
import com.lotfi.departmentservice.service.impl.DepartmentServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTests {


    @Mock
    private DepartmentRepository departmentRepository;

    @InjectMocks
    private DepartmentServiceImpl departmentService;

    @Test
    public void DepartmentService_findByName_ReturnDocumentDto(){
        //Arrange
        Department department = Department.builder()
                .name("physique")
                .build();

        List<Department> departments = new ArrayList<>();
        departments.add(department);

        //Act
        when(departmentRepository.findDepartmentByNameContainingIgnoreCase("ysi")).thenReturn(departments);

        List<DepartmentDto> departmentDtoList = departmentService.findByName("ysi");

        //Asset


        Assertions.assertThat(departmentDtoList).isNotNull();
    }

    @Test
    public void findAllDepartmemtServiceReturnResponseDto(){
        //Arrange
        List<Department> departments = Mockito.mock(List.class);

        //Act
        when(departmentRepository.findAll()).thenReturn(departments);

        //Assert
        List<DepartmentDto> departmentDtoList = departmentService.findAll();
        Assertions.assertThat(departmentDtoList).isNotNull();
    }


}
