package com.designpattern.observer;

public class Subscriber extends Observer{
    public Subscriber(String name){
        super(name);
    }

    @Override
    public void update() {
        System.out.println("hey " + this.name + " a new video is uploaded");
    }

    public void subscribeTo(Channel ch){
        this.channel = ch;
    }

}
