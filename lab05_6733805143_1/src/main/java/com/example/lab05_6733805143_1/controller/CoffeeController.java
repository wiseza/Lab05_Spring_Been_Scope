package com.example.lab05_6733805143_1.controller;

import com.example.coffeeshop.model.Coffee;
import com.example.coffeeshop.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    @Autowired
    CoffeeService service;

    @Getmapping
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