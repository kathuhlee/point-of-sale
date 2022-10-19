package com.teksystems.bootcamp;

import com.teksystems.bootcamp.EntreeOptions.OrderEntree;
import com.teksystems.bootcamp.drink.Drink;
import com.teksystems.bootcamp.drink.Drinks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        OrderTaker myTest = new OrderTaker();
        String order;

        // TODO: When user decides to checkout (done with ordering), print all of these lists as receipt for checkout; use toString
        double totalPrice = 0.00;
        List<Drink> orderedDrinks = new ArrayList<>();
        List<BasicTaco> orderedTacos = new ArrayList<>();
        List<Side> orderedSides = new ArrayList<>();
        List<Combo> orderedCombos = new ArrayList<>();



        boolean runMenu = true; //if this is false then the code won't run
        while (runMenu) {
            System.out.println("Welcome to Kathleen's TekTacos Shop!");
            System.out.println("What can I get you? 1. Entree 2. Sides 3. Drinks 4. Combos 5. Check out");

            Scanner sc = new Scanner(System.in);

            TekTacos customerTaco = new TekTacos();

            if (sc.hasNextInt()) {
                int userInput = sc.nextInt();

                switch (userInput) {
                    case 1:
                        orderedTacos.add(OrderEntree.startOrder());
                        break;
                    case 2:
                        orderedSides.add(Sides.sidesSelection());
                        System.out.println("Sides");
                        break;
                    case 3:
                        System.out.println("Drinks");
                        orderedDrinks.add(Drinks.drinkSelections());
                        break;
                    case 4:
                        orderedCombos.add(Combos.combosSelections());
                        break;
                    case 5:
                        System.out.println("Receipt:");
                        if(orderedTacos.isEmpty()) {
                            System.out.println("No taco ordered");
                        } else {
                            totalPrice += orderedTacos.get(0).getPrice();

                        }
                        if(orderedSides.isEmpty()) {
                            System.out.println("No side ordered");
                        } else {
                            totalPrice += orderedSides.get(0).getPrice();

                        }

                        if(orderedDrinks.isEmpty()) {
                            System.out.println("No drink ordered");
                        } else {
                            totalPrice += orderedDrinks.get(0).getPrice();

                        }

                        if(orderedCombos.isEmpty()) {
                            System.out.println("No combos ordered");
                        } else {
                            totalPrice += orderedCombos.get(0).getPrice();

                        }
                        System.out.println(totalPrice);

                        break;
                    case 6:
                        System.out.println("Quit");
                        runMenu = false;
                        break;
                    default:
                        System.out.println("Incorrect input! Please try again.");
                        break;
                }
            } else {
                System.out.println("nope");
            }
        }
    }
}
