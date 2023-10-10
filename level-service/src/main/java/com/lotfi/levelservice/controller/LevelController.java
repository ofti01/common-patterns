package com.lotfi.levelservice.controller;

import com.lotfi.levelservice.model.Level;
import com.lotfi.levelservice.repository.LevelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/level")
@RequiredArgsConstructor
public class LevelController {

    private final LevelRepository levelRepository;

    @PostMapping
    public Level save(@RequestBody Level level){
        return levelRepository.save(level);
    }

    @GetMapping
    public List<Level> getAll(){
        return levelRepository.findAll();
    }
}
