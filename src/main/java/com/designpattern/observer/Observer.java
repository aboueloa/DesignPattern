package com.designpattern.observer;

public abstract class Observer {

    protected Channel channel;
    protected String name;
    public Observer(String name){
        this.name = name;
        channel = new Channel();
    }
    public abstract void update();

}
