package com.designpattern.decorator;

public class BasicTshirt implements Tshirt{

    @Override
    public String getDescription() {
        return "a white tshirt";
    }

    @Override
    public int getCost() {
        return 6;
    }
}
