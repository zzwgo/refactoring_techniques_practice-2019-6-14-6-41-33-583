package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {
    @Test
    public void should_return_10100point0_when_input_100_and_100(){
        PriceCalculator priceCalculator=new PriceCalculator();
        double result=priceCalculator.getPrice(100,100);
        assertEquals(10100.0,result,0.0);
    }
    @Test
    public void should_return_50100point0_when_input_500_and_100(){
        PriceCalculator priceCalculator=new PriceCalculator();
        double result=priceCalculator.getPrice(500,100);
        assertEquals(50100.0,result,0.0);
    }
    @Test
    public void should_return_0point0_when_input_0_and_0(){
        PriceCalculator priceCalculator=new PriceCalculator();
        double result=priceCalculator.getPrice(0,0);
        assertEquals(0.0,result,0.0);
    }
}