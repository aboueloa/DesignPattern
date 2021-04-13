package com.designpattern.factory;

public class Lebara implements Operateur{

    protected Lebara(){

    }
    @Override
    public int fee() {
        return 39;
    }

    @Override
    public String description() {
        return "Lebara is the tel operator in Swiss";
    }
}
