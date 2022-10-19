package com.teksystems.bootcamp;

import com.teksystems.bootcamp.drink.Drink;

public class Combo {

    private final double price;
    BasicTaco taco;
    Side side;
    Drink drink;

    public Combo(BasicTaco taco, Side side, Drink drink, double price) {
        this.taco = taco;
        this.side = side;
        this.drink = drink;
        this.price = price;
    }

    public BasicTaco getTaco() {
        return taco;
    }

    public void setTaco(BasicTaco taco) {
        this.taco = taco;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Combo ordered: \n" +
                "Taco: " + taco.getName() +
                "\n Side: " + side +
                "\n Drink: " + drink +
                "\n for a total of " + price;
    }

    public double getPrice() {
        return price;
    }
}
