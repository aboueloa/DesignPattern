package com.designpattern.decorator;

public class TshirtDecorator implements Tshirt{
    protected Tshirt tshirt;
    public TshirtDecorator(Tshirt tshirt){
        this.tshirt = tshirt;
    }
    @Override
    public String getDescription() {
        return tshirt.getDescription();
    }

    @Override
    public int getCost() {
        return tshirt.getCost();
    }
}
