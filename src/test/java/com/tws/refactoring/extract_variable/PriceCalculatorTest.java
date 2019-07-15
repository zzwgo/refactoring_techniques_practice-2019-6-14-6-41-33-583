package com.tws.refactoring.extract_variable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {
    private PriceCalculator priceCalculator;

    @Before
    public void initPriceCalculator(){
        priceCalculator=new PriceCalculator();
    }

    @Test
    public void should_return_10100point0_when_input_100_and_100(){
        double result=priceCalculator.getPrice(100,100);

        assertEquals(10100.0,result,0.0);
    }
    @Test
    public void should_return_50100point0_when_input_500_and_100(){
        double result=priceCalculator.getPrice(500,100);

        assertEquals(50100.0,result,0.0);
    }
    @Test
    public void should_return_0point0_when_input_0_and_0(){
        double result=priceCalculator.getPrice(0,0);

        assertEquals(0.0,result,0.0);
    }

}