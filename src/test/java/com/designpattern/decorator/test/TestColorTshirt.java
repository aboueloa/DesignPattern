package com.designpattern.decorator.test;
import com.designpattern.decorator.BasicTshirt;
import static org.junit.jupiter.api.Assertions.assertEquals;


import com.designpattern.decorator.TshirtWithColor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class TestColorTshirt {
    private static TshirtWithColor tshirtWithColorUnderTest;
    @BeforeAll
    public static void initTest(){
        tshirtWithColorUnderTest = new TshirtWithColor(new BasicTshirt());
    }
    @Test
    public void testgetDescription(){
        String desc = tshirtWithColorUnderTest.getDescription();
        assertEquals("a white tshirt with colors ", desc);
    }
    @Test
    public void testgetCost(){
        int cost = tshirtWithColorUnderTest.getCost();
        assertEquals(8, cost);
    }
}
