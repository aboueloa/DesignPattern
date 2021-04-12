package com.designpattern.decorator.test;
import com.designpattern.decorator.BasicTshirt;
import static org.junit.jupiter.api.Assertions.assertEquals;


import com.designpattern.decorator.LogoTshirt;
import com.designpattern.decorator.TshirtWithColor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class TestLogoTshirt {
    private static LogoTshirt logoTshirtUnderTest;
    @BeforeAll
    public static void initTest(){
        logoTshirtUnderTest = new LogoTshirt(new BasicTshirt());
    }
    @Test
    public void testgetDescription(){
        String desc = logoTshirtUnderTest.getDescription();
        assertEquals("a white tshirt and a logo ", desc);
    }
    @Test
    public void testgetCost(){
        int cost = logoTshirtUnderTest.getCost();
        assertEquals(8, cost);
    }
}