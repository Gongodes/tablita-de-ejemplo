package com.example.demo.model.repository;

import com.example.demo.model.Personas;
import org.springframework.data.repository.CrudRepository;

public interface PersonasDao extends CrudRepository<Personas, Integer> {
}
