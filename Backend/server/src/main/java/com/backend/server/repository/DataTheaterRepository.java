package com.backend.server.repository;

import com.backend.server.Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataTheaterRepository extends MongoRepository<DataTheater,Integer> {
    List<Movies> findByStatus(String status);
}