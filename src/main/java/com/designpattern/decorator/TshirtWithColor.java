package com.designpattern.decorator;

public class TshirtWithColor extends TshirtDecorator{

    public TshirtWithColor(Tshirt tshirt) {
        super(tshirt);
    }
    public String getDescription(){
        return this.tshirt.getDescription() + " with colors ";
    }
    public int getCost(){
        return tshirt.getCost() + 2;
    }
}
