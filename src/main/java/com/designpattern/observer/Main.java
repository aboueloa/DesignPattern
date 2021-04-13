package com.designpattern.observer;

public class Main {
    public static void main(String[] args){
        Subscriber s1 = new Subscriber("s1");
        Subscriber s2 = new Subscriber("s2");
        Channel ch = new Channel();
        s1.subscribeTo(ch);
        s2.subscribeTo(ch);
        ch.addSubscriber(s1);
        ch.addSubscriber(s2);
        ch.uploadVideo("how to take a nap");
    }
}
