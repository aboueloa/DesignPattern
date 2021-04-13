package com.designpattern.builder;

import com.designpattern.decorator.BasicTshirt;
import com.designpattern.decorator.LogoTshirt;
import com.designpattern.decorator.Tshirt;
import com.designpattern.decorator.TshirtWithColor;
import com.designpattern.factory.Operateur;
import com.designpattern.factory.OperatorFactory;
import com.designpattern.singleton.Singleton;
import com.designpattern.singleton.SingletonThreadSafe;
import com.designpattern.strategy.*;

public class Main {
    public static void main(String[] args){
        //builder
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
