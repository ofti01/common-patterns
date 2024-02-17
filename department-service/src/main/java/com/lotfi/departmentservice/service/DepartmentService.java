package com.lotfi.departmentservice.service;

import com.lotfi.departmentservice.dto.DepartmentDto;
import com.lotfi.departmentservice.model.Department;

import java.util.List;


public interface DepartmentService {

    DepartmentDto save(DepartmentDto departmentDto);

    List<DepartmentDto> findAll();

    void update(Long id,DepartmentDto departmentDto);

    void delete(Long id);

    void deleteAll();

    List<DepartmentDto> findByName(String search);

    static Department mapFromDto(DepartmentDto departmentDto){
        if(departmentDto == null) {
            return null;
        }
        else {
            return Department.builder()
                    .id(departmentDto.getId())
                    .name(departmentDto.getName())
                    .build();
        }
    }

    static DepartmentDto mapToDto(Department department){
        if(department == null) {
            return null;
        }
        else {
            return DepartmentDto.builder()
                    .id(department.getId())
                    .name(department.getName())
                    .build();
        }
    }



}
