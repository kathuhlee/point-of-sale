package com.teksystems.bootcamp.EntreeOptions;

import com.teksystems.bootcamp.BasicTaco;
import com.teksystems.bootcamp.DeluxeTaco;
import com.teksystems.bootcamp.TekTacos;
import com.teksystems.bootcamp.VeggieTaco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TacoCustomization<userSelectToppings> {
    public static ArrayList<TekTacos> orderedEntree = new ArrayList<TekTacos>();

    static String newline = System.getProperty("line.separator");

    static Scanner scanner = new Scanner(System.in);

    public static BasicTaco showEntreeMenu() {

        System.out.println(
                "1. Basic Taco" + newline +
                        "2. Deluxe Taco" + newline +
                        "3. Veggie Taco"
        );
        System.out.println("Which type of taco would you like?");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                return addEntree(new BasicTaco());

            case 2:
                return addEntree(new DeluxeTaco());

            case 3:
                return addEntree(new VeggieTaco());

            default:
                System.out.println("Not a valid option");
                return showEntreeMenu();
        }

    }

    static ArrayList<String> selectToppings(List<String> defaultToppings, int maxNumberOfToppings, String name) {
        // give the user options to select toppings
        ArrayList<String> userSelectToppings = new ArrayList<>();

        System.out.println("What type of toppings would you like?" + newline +
                "You can pick " + maxNumberOfToppings + " magnificent toppings!" + newline +
                "1. Shredded Lettuce" + newline +
                "2. Tomatoes" + newline +
                "3. Onions" + newline +
                "4. Cheese" + newline +
                "5. Salsa" + newline +
                "6. Cilantro" + newline +
                "7. Jalapeno" + newline +
                "8. No toppings for me today!");

//        int maxNumberOfToppings = maxNumberOfToppings;
        int currentNumberOfToppings = 0;

        do {
            int userInput = scanner.nextInt();
//            System.out.println("Please choose up to " + defaultToppings + " magnificent toppings:");
            switch (userInput) {
                case 1:
                    userSelectToppings.add("Shredded Lettuce");
                    currentNumberOfToppings++;
                    break;
                case 2:
                    userSelectToppings.add("Tomatoes");
                    currentNumberOfToppings++;
                    break;
                case 3:
                    userSelectToppings.add("Onion");
                    currentNumberOfToppings++;
                    break;
                case 4:
                    userSelectToppings.add("Cheese");
                    currentNumberOfToppings++;
                    break;
                case 5:
                    userSelectToppings.add("Salsa");
                    currentNumberOfToppings++;
                    break;
                case 6:
                    userSelectToppings.add("Cilantro");
                    currentNumberOfToppings++;
                    break;
                case 7:
                    userSelectToppings.add("Jalapeno");
                    currentNumberOfToppings++;
                    break;
                case 8:
                    currentNumberOfToppings = maxNumberOfToppings;
                    break;

            }
        } while (userSelectToppings.size() < maxNumberOfToppings);
        // make line 99 make more sense and best practice, in line 102 add an || operator so it exits if the size is less than maxNumOfToppings and exits if case 8 is selected
        return userSelectToppings;
    }

    private static String proteinSelections(String defaultProtein) {

        String protein = defaultProtein;

        System.out.println("Please select a protein from the finest sources available in the world." + newline +
                "Your default protein is " + defaultProtein + newline +
                "1. Ground Beef" + newline +
                "2. Steak" + newline +
                "3. Chicken" + newline +
                "4. Shredded Pork" + newline +
                "5. Black Beans" + newline +
                "6. Default is great!");


        int userInputProtein = scanner.nextInt();

        switch (userInputProtein) {
            case 1:
                protein = "Ground Beef";
                break;
            case 2:
                protein = "Steak";
                break;
            case 3:
                protein = "Chicken";
                break;
            case 4:
                protein = "Shredded Pork";
                break;
            case 5:
                protein = "Black Beans";
                break;
            case 6:
                break;
        }
        return protein;
    }

    private static String tortillaSelections(String defaultTortilla) {

        String tortilla = null;

        System.out.println("Please select a tortilla from what we have!");
        System.out.println("1. Flour");
        System.out.println("2. Corn");


        int userInputTortilla = scanner.nextInt();

        switch (userInputTortilla) {
            case 1:
                tortilla = "Flour";
                break;
            case 2:
                tortilla = "Corn";
                break;

        }
        return tortilla;
    }


    public static BasicTaco addEntree(BasicTaco taco) {

        String selectedTaco = taco.getName();
        String defaultProtein = taco.getProtein();
        List<String> defaultToppings = taco.getToppings();
        String defaultTortilla = taco.getTortilla();
        int maxNumberOfToppings = taco.getMaxNumberOfToppings();
        double price = taco.getPrice();

        String protein = defaultProtein;
        if (!selectedTaco.equals("Veggie Taco")) {
            protein = proteinSelections(defaultProtein);
        }

        List<String> toppings = selectToppings(defaultToppings, maxNumberOfToppings, selectedTaco);
        String tortilla = tortillaSelections(defaultTortilla);

        BasicTaco newTaco = new BasicTaco(selectedTaco, protein, tortilla, price, maxNumberOfToppings, toppings);
//        orderedEntree.add(newTaco);

        System.out.println("For your taco, you chose the delicious and mouth watering " + newTaco.getName() + newline +
                "for a bargain price of $" + newTaco.getPrice() + " with " +
                newTaco.getProtein() + " on top of a " + newTaco.getTortilla() + " tortilla with " + newline +
                newTaco.getToppings() + " toppings!" + newline );
        return newTaco;
    }

}
