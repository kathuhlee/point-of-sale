package com.teksystems.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeluxeTaco extends BasicTaco {

    public DeluxeTaco() {
        super(
                "Deluxe Taco",
                "Steak",
                "Flour",
                20.99,
                2,
                new ArrayList<>(Arrays.asList("Lettuce", "Tomato", "Onion", "Cheese"))
        );

        }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getProtein() {
        return super.getProtein();
    }

    @Override
    public String getTortilla() {
        return super.getTortilla();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public List<String> getToppings() {
        return super.getToppings();
    }
}

