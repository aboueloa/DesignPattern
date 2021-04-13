package com.designpattern.singleton;

public class SingletonThreadSafe {
    private String value;
    private static SingletonThreadSafe instance;
    private SingletonThreadSafe(String value){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }
    public static synchronized SingletonThreadSafe getInstance(String value){
        if(instance == null){
            instance = new SingletonThreadSafe(value);
        }
        return instance;
    }
    public String getValue(){
        return value;
    }
}
