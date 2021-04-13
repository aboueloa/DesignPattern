package com.designpattern.factory;



public class Main {
    public static void main(String[] args){
        //factory
        Operateur op = new OperatorFactory("France").getOperator();
        System.out.println(op.description());


    }
}
