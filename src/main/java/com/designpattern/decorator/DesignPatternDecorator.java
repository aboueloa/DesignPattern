package com.designpattern.decorator;

public class DesignPatternDecorator {
    public static void main(String[] args){
        Tshirt tshirt = new LogoTshirt(new TshirtWithColor(new BasicTshirt()));
        System.out.println(tshirt.getDescription() + " " + tshirt.getCost());
    }
}
