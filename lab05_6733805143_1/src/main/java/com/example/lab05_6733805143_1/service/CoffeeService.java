package com.example.lab05_6733805143_1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lab05_6733805143_1.model.Coffee;

@Service
public class CoffeeService {

    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeService() {
        coffeeList.add(new Coffee(1L, "Espresso", 45));
        coffeeList.add(new Coffee(2L, "Latte", 55));
    }

    public List<Coffee> getAllCoffee() {
        return coffeeList;
    }

    public Coffee getCoffeeById(Long id) {

        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getId().equals(id)) {
                return coffeeList.get(i);
            }
        }

        return null;
    }

    public Coffee addCoffee(Coffee coffee) {
        Long maxId = 0L;
        for (Coffee c : coffeeList) {
            if (c.getId() > maxId) {
                maxId = c.getId();
            }
        }
        coffee.setId(maxId + 1);
        coffeeList.add(coffee);
        return coffee;
    }

    public Coffee updateCoffee(Long id, Coffee coffee) {

        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getId().equals(id)) {
                coffeeList.get(i).setName(coffee.getName());
                coffeeList.get(i).setPrice(coffee.getPrice());
                return coffeeList.get(i);
            }
        }

        return null;
    }

    public void deleteCoffee(Long id) {

        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getId().equals(id)) {
                coffeeList.remove(i);
                return;
            }
        }
    }
}
