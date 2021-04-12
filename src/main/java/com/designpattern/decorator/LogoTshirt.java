package com.designpattern.decorator;

public class LogoTshirt extends TshirtDecorator{

    public LogoTshirt(Tshirt tshirt){
        super(tshirt);
    }
    @Override
    public String getDescription(){
        String res = tshirt.getDescription() + " and a logo ";
        return res;
    }
    @Override
    public int getCost(){
        return tshirt.getCost() + 2;
    }
}
