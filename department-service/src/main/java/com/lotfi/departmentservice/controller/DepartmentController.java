package com.lotfi.departmentservice.controller;


import com.lotfi.departmentservice.dto.DepartmentDto;
import com.lotfi.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/departments")
public class DepartmentController {

    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> findAll(){
        return new ResponseEntity<>(departmentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<DepartmentDto>> findSearching(@RequestParam String search){
        return new ResponseEntity<>(departmentService.findByName(search),HttpStatus.OK);

    }
}
