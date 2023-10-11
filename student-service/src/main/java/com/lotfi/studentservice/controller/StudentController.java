package com.lotfi.studentservice.controller;

import com.lotfi.studentservice.entities.Student;
import com.lotfi.studentservice.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    private final StudentRepository studentRepository;

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping()
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
}
