package com.tws.refactoring.extract_variable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {
    private BannerRender bannerRender;
    @Before
    public void initPriceCalculator(){
         bannerRender=new BannerRender();
    }

    @Test
    public void should_return_banner_when_input_abc_and_edf(){
        String result=bannerRender.renderBanner("abc","edf");
        assertEquals("banner",result);
    }

    @Test
    public void should_return_banner_when_input_MAC1_and_IE1(){
        String result=bannerRender.renderBanner("MAC1","IE1");
        assertEquals("IE on Mac?",result);
    }

    @Test
    public void should_return_banner_when_input_MAC_and_IE(){
        String result=bannerRender.renderBanner("MAC","IE");
        assertEquals("IE on Mac?",result);
    }
}