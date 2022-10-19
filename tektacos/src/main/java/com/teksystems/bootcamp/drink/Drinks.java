package com.teksystems.bootcamp.drink;

import com.teksystems.bootcamp.drink.Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Drinks {
    public static Drink drinkSelections() {
        Drink drink = null;
        while (true) {
            System.out.println("Please select a drink from what we have!");
            System.out.println("1. " + Drink.SODA.name + " $" + Drink.SODA.price);
            System.out.println("2. " + Drink.TEA.name + " $" + Drink.TEA.price);
            System.out.println("3. " + Drink.WATER.name + " $" + Drink.WATER.price);

            Scanner sc = new Scanner(System.in);
            int userInputDrink = sc.nextInt();

            switch (userInputDrink) {
                case 1:
                    drink = Drink.SODA;
                    break;
                case 2:
                    drink = Drink.TEA;
                    break;
                case 3:
                    drink = Drink.WATER;
                    break;
            }
            try {
                if (drink == null) {
                    System.out.println("Invalid selection, please try again!");
                } else {
                    System.out.println("Adding drink: " + drink.name.toLowerCase());
                    return drink;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("We do not have that drink. Please select from the drink selection again");
            }
        }
    }
};

