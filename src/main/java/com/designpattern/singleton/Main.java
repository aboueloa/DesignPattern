package com.designpattern.singleton;



public class Main {
    public static void main(String[] args){

        //singleton
        //Thread safe
        new Thread(() -> System.out.println(SingletonThreadSafe.getInstance("thread1")
                .getValue()))
                .start();
        new Thread(() -> System.out.println(SingletonThreadSafe.getInstance("thread2")
                .getValue()))
                .start();
        //naif
        new Thread(() -> System.out.println(Singleton.getInstance("thread3")
                .getValue()))
                .start();
        new Thread(() -> System.out.println(Singleton.getInstance("thread4")
                .getValue()))
                .start();



    }
}
