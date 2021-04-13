package com.designpattern.decorator;



public class Main {
    public static void main(String[] args) {

        //decorator
        Tshirt tshirt = new LogoTshirt(new TshirtWithColor(new BasicTshirt()));
        System.out.println(tshirt.getDescription() + " " + tshirt.getCost());
    }
}

