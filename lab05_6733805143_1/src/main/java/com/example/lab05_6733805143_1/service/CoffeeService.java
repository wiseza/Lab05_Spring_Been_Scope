package com.example.lab05_6733805143_1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lab05_6733805143_1.model.Coffee;

@Service
public class CoffeeService {

    private List<Coffee> coffeeList = new ArrayList<>();
    private int nextId = 3;

    public CoffeeService() {
        new Coffee(1, "Espresso", 45);
        new Coffee(2, "Latte", 55);
    }

    public List<Coffee> getAllCoffee() {
        return coffeeList;
    }

    public Coffee getCoffeeById(int id) {

        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getId() == id) {
                return coffeeList.get(i);
            }
        }
        return null;
    }

    public Coffee addCoffee(Coffee coffee) {
        coffee.setId(nextId);
        nextId++;
        coffeeList.add(coffee);
        return coffee;
    }

    public Coffee updateCoffee(int id, Coffee coffee) {
        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getId() == id) {
                coffeeList.get(i).setName(coffee.getName());
                coffeeList.get(i).setPrice(coffee.getPrice());
                return coffeeList.get(i);
            }
        }
        return null;
    }

    public void deleteCoffee(int id) {
        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getId() == id) {
                coffeeList.remove(i);
                return;
            }
        }
    }
}
