package com.designpattern.singleton;

public class Singleton {
    private String value;
    private static Singleton instance;
    private Singleton(String value){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }
    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
    public String getValue(){
        return value;
    }
}
