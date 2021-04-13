package com.designpattern.factory;

public class Orange implements Operateur{

    protected Orange(){

    }
    @Override
    public int fee() {
        return 25;
    }

    @Override
    public String description() {
        return "orange is the best telephone operator in France";
    }
}
