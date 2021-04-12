package com.designpattern.strategy;

public class DesignPatternStrategy {
    public static void main(String[] args){
        Filter BW = new BlackWhite();
        Compressor jpeg = new Jpeg();
        ImageStorage imageStorage = new ImageStorage(BW, jpeg);
        System.out.println(imageStorage.storeImage());
    }
}
