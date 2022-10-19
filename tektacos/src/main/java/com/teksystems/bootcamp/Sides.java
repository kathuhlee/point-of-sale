package com.teksystems.bootcamp;



import java.util.Scanner;

public class Sides {

    public static Side sidesSelection() {
        Side side = null;

        System.out.println("Please select a side from what we have!");
        System.out.println("1. " + Side.CHIPS_AND_SALSA.name + " $" + Side.CHIPS_AND_SALSA.price);
        System.out.println("2. " + Side.CHIPS_AND_QUESO.name + " $" + Side.CHIPS_AND_QUESO.price);
        System.out.println("3. " + Side.FRIES.name + " $" + Side.FRIES.price);

        Scanner sc = new Scanner(System.in);
        int userInputSides = sc.nextInt();

        switch(userInputSides) {
            case 1:
                side = Side.CHIPS_AND_SALSA;
                break;
            case 2:
                side = Side.CHIPS_AND_QUESO;
                break;
            case 3:
                side = Side.FRIES;
                break;
            case 4:
                break;

        }
        try {
            if (side == null) {
                System.out.println("Invalid selection, please try again!");
            } else {
                System.out.println("Adding side: " + side.name.toLowerCase());

            }
        } catch (IllegalArgumentException e) {
            System.out.println("We do not have that side. Please select from the sides selection again");
        }
        return side;
    }
}