package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    @Test
    public void should_return_banner_when_input_abc_and_edf(){
        BannerRender bannerRender=new BannerRender();
        String result=bannerRender.renderBanner("abc","edf");
        assertEquals("banner",result);
    }

    @Test
    public void should_return_banner_when_input_MAC_and_IE(){
        BannerRender bannerRender=new BannerRender();
        String result=bannerRender.renderBanner("MAC","IE");
        assertEquals("IE on Mac?",result);
    }
}