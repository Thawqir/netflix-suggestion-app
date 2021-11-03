package com.example.netflixsuggestionapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetflixRepo extends CrudRepository<Title, Long> {
}
