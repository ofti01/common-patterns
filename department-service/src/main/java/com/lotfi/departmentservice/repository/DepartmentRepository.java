package com.lotfi.departmentservice.repository;

import com.lotfi.departmentservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    List<Department> findDepartmentByNameContainingIgnoreCase(String name);
}
