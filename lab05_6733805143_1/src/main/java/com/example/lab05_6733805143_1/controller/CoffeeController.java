package com.example.lab05_6733805143_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab05_6733805143_1.model.Coffee;
import com.example.lab05_6733805143_1.service.CoffeeService;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    @Autowired
    CoffeeService service;

    @GetMapping
    public List<Coffee> getAllCoffees() {
        return service.getAllCoffee();
    }

    @GetMapping("/{id}")
    public Coffee getCoffee(@PathVariable int id) {
        return service.getCoffeeById(id);
    }

    @PostMapping
    public Coffee addCoffee(@RequestBody Coffee coffee) {
        return service.addCoffee(coffee);
    }

    @PutMapping("/{id}")
    public Coffee updateCoffee(@PathVariable int id, @RequestBody Coffee coffee) {

        return service.updateCoffee(id, coffee);
    }

    @DeleteMapping("/{id}")
    public void deleteCoffee(@PathVariable int id) {
        service.deleteCoffee(id);
    }

}