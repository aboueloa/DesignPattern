package com.designpattern.builder;


public class BuilderDesignPattern {
    public static void main(String[] args){
        Script script = new Script.Builder().text("a long text to learn by heart")
                .duration(120)
                .author("ayman")
                .build();
        Role role = new Role.Builder().role("the hero")
                .script(script)
                .build();
        Actor actor = new Actor.Builder()
                .name("ayman")
                .role(role)
                .salary(50000)
                .build();

        System.out.println(actor.toString());
    }
}
