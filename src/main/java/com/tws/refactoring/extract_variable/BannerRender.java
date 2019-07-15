package com.tws.refactoring.extract_variable;

public class BannerRender {

    boolean isContainsMACandIE(String platform, String browser){
        return (platform.toUpperCase().contains("MAC")) && (browser.toUpperCase().contains("IE"));
    }

    String renderBanner(String platform, String browser) {
        return isContainsMACandIE(platform,browser)?"IE on Mac?":"banner";
    }
}
