package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
    // You can add custom query methods here if needed
}
