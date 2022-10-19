package com.teksystems.bootcamp;

import com.teksystems.bootcamp.EntreeOptions.TacoCustomization;
import com.teksystems.bootcamp.drink.Drink;
import com.teksystems.bootcamp.drink.Drinks;


import java.util.Scanner;
public class Combos {

    public static Combo combosSelections() {
        Combo combo = null;

        System.out.println("Please select a combo from what we have!");
        System.out.println("1. Combo - Taco, Side and Drink $ 25.99");
        // make combo an object
        Scanner sc = new Scanner(System.in);
        int userInputCombos = sc.nextInt();

        if (userInputCombos == 1) {
            BasicTaco taco = TacoCustomization.addEntree(getTacoEntree());
            Side side = Sides.sidesSelection();
            Drink drink = Drinks.drinkSelections();
            double price = 25.99;
            combo = new Combo(
                    taco, side, drink, price
            );
        }
        System.out.println(combo.getTaco().getName() + " " + combo.getSide().getName() + " " + combo.getDrink().getName());
        return combo;
    }
    public static BasicTaco getTacoEntree() {
        System.out.println(
                "1. Basic Taco \n" + 
                        "2. Deluxe Taco \n" + 
                        "3. Veggie Taco"
        );
        System.out.println("Which type of taco would you like?");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                return new BasicTaco();

            case 2:
                return new DeluxeTaco();

            case 3:
                return new VeggieTaco();

        }
        return null;
    }
}
