package com.teksystems.bootcamp.TacoAddOns;

public enum ToppingsList {

    SHREDDEDLETTUCE("Shredded Lettuce"),
    TOMATO("Tomato"),
    ONION("Onion"),
    CHEESE("Cheese"),
    SALSA("Salsa"),
    CILANTRO("Cilantro"),
    JAPALENO("Jalapeno");

    final String name;
    ToppingsList(String name) {
        this.name = name;
    }
}
