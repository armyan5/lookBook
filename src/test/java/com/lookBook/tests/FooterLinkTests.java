package com.lookBook.tests;


import com.lookBook.fw.HomePageHelper;
import org.testng.annotations.Test;

public class FooterLinkTests extends TestBase {

    @Test
    public void fbLinkTest() {
        app.driver.findElement(HomePageHelper.fbLink()).click();
        app.getUser().switchToNextTab(1);
    }

    @Test
    public void whatsAppLinkTest() {
        app.driver.findElement(HomePageHelper.watsAppLink()).click(); // className
        app.getUser().switchToNextTab(1);
    }

    @Test
    public void instagramLinkTest() {
        app.driver.findElement(HomePageHelper.instagramLink()).click();
        app.getUser().switchToNextTab(1);
    }

}
