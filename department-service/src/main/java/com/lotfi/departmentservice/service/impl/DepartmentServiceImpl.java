package com.lotfi.departmentservice.service.impl;

import com.lotfi.departmentservice.dto.DepartmentDto;
import com.lotfi.departmentservice.exception.ResourceNotFoundException;
import com.lotfi.departmentservice.model.Department;
import com.lotfi.departmentservice.repository.DepartmentRepository;
import com.lotfi.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        Department department= departmentRepository.save(DepartmentService.mapFromDto(departmentDto));
        return DepartmentService.mapToDto(department);
    }

    @Override
    public List<DepartmentDto> findAll() {
        return departmentRepository.findAll()
                .stream()
                .map(DepartmentService::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void update(Long id, DepartmentDto departmentDto) {
        if(departmentRepository.findById(id).orElse(null) == null) {
            throw  new ResourceNotFoundException("Resource not found");
        }
        else {
            Department department = Department.builder()
                    .id(id)
                    .name(departmentDto.getName())
                    .build();
            departmentRepository.save(department);
        }
    }

    @Override
    public void delete(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        departmentRepository.deleteAll();
    }

    @Override
    public List<DepartmentDto> findByName(String search) {
        return departmentRepository.findDepartmentByNameContainingIgnoreCase(search)
                .stream()
                .map(DepartmentService::mapToDto)
                .collect(Collectors.toList());
    }
}
