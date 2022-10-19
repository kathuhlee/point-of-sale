package com.teksystems.bootcamp.TacoAddOns;


public enum ProteinsList {

    GROUNDBEEF("Ground Beef"),
    STEAK("Steak"),
    CHICKEN("Chicken"),
    SHREDDEDPORK("Shredded Pork"),
    BLACKBEANS("Black Beans");


    final String name;
    ProteinsList(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
