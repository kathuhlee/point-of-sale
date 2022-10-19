package com.teksystems.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class BasicTaco {
    String name;
    String protein;
    String tortilla;
    double price;
    int maxNumberOfToppings;
    List<String> toppings;

    public BasicTaco(String name, String protein, String tortilla, double price, int maxNumberOfToppings, List<String> toppings) {
        this.name = name;
        this.protein = protein;
        this.tortilla = tortilla;
        this.price = price;
        this.maxNumberOfToppings = maxNumberOfToppings;
        this.toppings = toppings;
    }

    public BasicTaco() {
        this.name = "Basic Taco";
        this.protein = "Ground beef";
        this.tortilla = "Flour";
        this.price = 9.99;
        this.maxNumberOfToppings = 4;
        this.toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getTortilla() {
        return tortilla;
    }

    public void setTortilla(String tortilla) {
        this.tortilla = tortilla;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxNumberOfToppings() {
        return maxNumberOfToppings;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return name + " " + price + " " + protein + " " + toppings + " " + tortilla;
    }
}
