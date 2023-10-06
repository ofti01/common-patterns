package com.lotfi.studentservice.repositories;

import com.lotfi.studentservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
