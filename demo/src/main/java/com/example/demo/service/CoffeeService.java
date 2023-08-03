package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Coffee;
import com.example.demo.repository.CoffeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeService {
    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public Iterable<Coffee> getAllCoffees() {
        return coffeeRepository.findAll();
    }

    public Optional<Coffee> getCoffeeById(String id) {
        return coffeeRepository.findById(id);
    }

    public Coffee createCoffee(Coffee coffee) {
        return coffeeRepository.save(coffee);
    }

    public Coffee updateCoffee(String id, Coffee coffee) {
        return coffeeRepository.existsById(id)
                ? coffeeRepository.save(coffee)
                : null;
    }

    public void deleteCoffee(String id) {
        coffeeRepository.deleteById(id);
    }
}
