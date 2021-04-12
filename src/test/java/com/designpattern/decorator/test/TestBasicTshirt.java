package com.designpattern.decorator.test;

import com.designpattern.decorator.BasicTshirt;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class TestBasicTshirt {
    private static BasicTshirt basicTshirtUnderTest;

    @BeforeAll
    public static void initTest(){
        System.out.println("start tests on basic Tshirt");
        basicTshirtUnderTest = new BasicTshirt();
    }
    @Test
    public void testGetDescription(){
        String desc = basicTshirtUnderTest.getDescription();
        assertEquals(desc, "a white tshirt");

    }
    @Test
    public void testGetCost(){
        int cost = basicTshirtUnderTest.getCost();
        assertEquals(cost, 6);
    }


}
