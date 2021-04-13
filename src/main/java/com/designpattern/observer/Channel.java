package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel{
    private List<Observer> subscribers;
    private String video;

    public Channel(){
        subscribers = new ArrayList<Observer>();
    }
    public void addSubscriber(Observer subscriber){
        subscribers.add(subscriber);
    }
    public void uploadVideo(String video){
        this.video = video;
        notifyAllSub();
    }
    public void notifyAllSub(){
        for(Observer sub:subscribers){
            sub.update();
        }
    }

    public String getVideo() {
        return video;
    }
}
