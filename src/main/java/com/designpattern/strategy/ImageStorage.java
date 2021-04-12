package com.designpattern.strategy;

public class ImageStorage {
    private Filter filter;
    private Compressor compressor;

    public ImageStorage(Filter filter, Compressor compressor) {
        this.filter = filter;
        this.compressor = compressor;
    }
    public String storeImage(){
        String res = filter.apply();
        res += compressor.apply();
        return res;
    }
}
