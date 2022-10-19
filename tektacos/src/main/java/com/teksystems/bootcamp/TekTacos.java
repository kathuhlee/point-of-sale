package com.teksystems.bootcamp;

import com.teksystems.bootcamp.EntreeOptions.TacoCustomization;

import java.util.ArrayList;
import java.util.Arrays;


public class TekTacos {
// everytime we make a project, we must pass these in, we need a constructor for all of these
   // we want to use getter methods


    private String protein;
    private String tortilla;

    private String toppings;
    private double price;
    private String name;

    public TekTacos(boolean drink) {
    }


    enum TacoSelections  {
        BASICTACO(9.99, "Flour", "Ground Beef", new String[]{""}),
        DELUXETACO(18.99, "Flour", "Steak", new String[]{"Shredded Lettuce", "Tomato", "Onion", "Cheese"}),
        VEGGIETACO(8.99, "Corn", "Black Beans", new String[]{""});

        public final double price;
        public final String tortilla;
        public final String protein;
        public final String[] toppings;
        TacoSelections(double price, String tortilla, String protein, String[] toppings) {
            this.price = price;
            this.tortilla = tortilla;
            this.protein = protein;
            this.toppings = toppings;
        }

        public double getPrice() {
            return price;
        }

        public String getTortilla() {
            return tortilla;
        }

        public String getProtein() {
            return protein;
        }

        public String[] getToppings() {
            return toppings;
        }
    }

    public TekTacos(String protein, String tortilla, String toppings, String name, double price) {
        this.protein = protein;
        this.tortilla = tortilla;
        this.toppings = toppings;
        this.name = name;
        this.price = price;

//
//        if (name.equals("Basic Taco")) {
//            if (protein.equals("")) {
//                this.protein = TacoSelections.BASICTACO.getProtein();
//            } else {
//                this.protein = protein;
//            }
//
//            if (tortilla.equals("")) {
//                this.tortilla = TacoSelections.BASICTACO.getTortilla();
//            } else {
//                this.tortilla = tortilla;
//            }
//            this.price = TacoSelections.BASICTACO.getPrice();
//
//        }
//
//        if (name.equals("Deluxe Taco")) {
//            if (protein.equals("")) {
//                this.protein = TacoSelections.DELUXETACO.getProtein();
//            } else {
//                this.protein = protein;
//            }
//
//            if (tortilla.equals("")) {
//                this.tortilla = TacoSelections.DELUXETACO.getTortilla();
//            } else {
//                this.tortilla = tortilla;
//            }
//            this.price = TacoSelections.DELUXETACO.getPrice();
//            this.toppings = Arrays.toString(TacoSelections.DELUXETACO.getToppings());
//        }
//
//        if (name.equals("Veggie Taco")) {
//            if (protein.equals("")) {
//                this.protein = TacoSelections.VEGGIETACO.getProtein();
//            } else {
//                this.protein = protein;
//            }
//
//            if (tortilla.equals("")) {
//                this.tortilla = TacoSelections.VEGGIETACO.getTortilla();
//            } else {
//                this.tortilla = tortilla;
//            }
//            this.price = TacoSelections.VEGGIETACO.getPrice();
//
//        }
    }

    public TekTacos() {

    }

    public String getProtein() {
        return protein;
    }

    public String getTortilla() {
        return tortilla;
    }

    public String getToppings() {
        return toppings;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public class Testing {

    }
}



