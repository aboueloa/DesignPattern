package com.designpattern.factory;

public class OperatorFactory {
    private String country;

    public OperatorFactory(String country) {
        this.country = country;
    }
    public Operateur getOperator(){
        if(country.equals("France")){
            return new Orange();
        }
        else if(country.equals("Swiss")){
            return new Lebara();
        }
        System.out.println("there is no operator in the country you have chosen");
        return null;
    }
}
