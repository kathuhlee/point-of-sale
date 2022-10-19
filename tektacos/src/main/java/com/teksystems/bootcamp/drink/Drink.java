package com.teksystems.bootcamp.drink;

public enum Drink {

    SODA("soda", 4.99),
    TEA("tea", 3.99),
    WATER("water", 1.99);

    final public String name;
    final public double price;

    Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
