package com.designpattern.builder;

public class Script {
    private final String text;
    private long duration;
    private final String author;

    public Script(Builder builder){
        this.text = builder.text;
        this.duration = builder.duration;
        this.author = builder.author;
    }
    public static class Builder{
        private String text;
        private long duration;
        private String author;

        public Builder text(String text){
            this.text = text;
            return this;
        }
        public Builder duration(long duration){
            this.duration = duration;
            return this;
        }
        public Builder author(String author){
            this.author = author;
            return this;
        }
        public Script build(){
            return new Script(this);
        }
    }

    public java.lang.String getText() {
        return text;
    }

    public long getDuration() {
        return duration;
    }

    public java.lang.String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Script{" +
                "text=" + text +
                ", duration=" + duration +
                ", author=" + author +
                '}';
    }
}
