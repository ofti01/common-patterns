package com.lotfi.levelservice.repository;

import com.lotfi.levelservice.model.Level;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface LevelRepository extends MongoRepository<Level, String> {
    @Query("{'name_level':?0}")
    Optional<Level> findByNameLevel(String s);
}
