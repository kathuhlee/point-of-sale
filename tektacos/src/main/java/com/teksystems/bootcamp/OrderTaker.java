package com.teksystems.bootcamp;

import java.util.List;
import java.util.Scanner;

public class OrderTaker {
    public String newline = System.getProperty("line.separator");
    public String option = "";
    public String takeOrder(List<String> options) {

        System.out.println("What would you like from the following?" + newline +
                options.toString() + newline +
                "Please type in what you would like.");

        Scanner scanner = new Scanner(System.in);
        option = scanner.nextLine();
        return option;
    }

    // Returns true when the user enters Y. Returns false when user enters N.
    public boolean promptAgain() {
        while (true) {
            System.out.println("Do you want to order more? y/N");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextLine().toUpperCase();

            if (option.equals("Y")) {
                return true;
            } else if (option.equals("N")) {
                return false;
            } else {
                System.out.println("Invalid option, please try again!");
            }
        }
    }

}
