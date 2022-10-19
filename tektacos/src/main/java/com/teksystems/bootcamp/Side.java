package com.teksystems.bootcamp;

public enum Side {

    CHIPS_AND_SALSA("Chips and Salsa", 8.99),
    CHIPS_AND_QUESO("Chips and Queso", 13.99),
    FRIES("Fries", 5.99);

    final public String name;
    final public double price;

    Side(String name, double price) {
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
