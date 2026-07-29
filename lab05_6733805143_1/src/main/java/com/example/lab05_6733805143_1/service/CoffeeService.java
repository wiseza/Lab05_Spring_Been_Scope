package com.example.lab05_6733805143_1.service;

import com.example.coffeeshop.model.Coffee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {

    private List<Coffee> coffeeList = new ArrayList<>();
    private int nextId = 3L;

    public CoffeeService() {
        coffeeList.add(new Coffee(1L, "Espresso", 45));
        coffeeList.add(new Coffee(2L, "Latte", 55));
    }

    public List<Coffee> getAllCoffee() {
        return coffeeList;
    }

    public Coffee getCoffeeById(int id) {

        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getId().equals(id)) {
                return coffeeList.get(i);
            }
        }
        return "ไม่พบข้อมูล";
    }

    public Coffee addCoffee(Coffee coffee) {
        coffee.setId(nextId);
        nextId++;
        coffeeList.add(coffee);
        return coffee;
    }

    public Coffee updateCoffee(int id, Coffee coffee) {
        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getId().equals(id)) {
                coffeeList.get(i).setName(coffee.getName());
                coffeeList.get(i).setPrice(coffee.getPrice());
                return coffeeList.get(i);
            }
        }
        return null;
    }

    public void deleteCoffee(int id) {
        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getId().equals(id)) {
                coffeeList.remove(i);
                return;
            }
        }
    }
}
