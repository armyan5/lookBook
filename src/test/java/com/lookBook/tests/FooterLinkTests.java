package com.lookBook.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FooterLinkTests extends TestBase {

    @Test
    public void fbLinkTest() {
        driver.findElement(By.className("mr-10")).click();
        switchToNextTab(1);
    }

    @Test
    public void whatsAppLinkTest() {
        driver.findElement(By.className("")).click(); // className
        switchToNextTab(1);
    }

    @Test
    public void instagramLinkTest() {
        driver.findElement(By.className("instagram")).click();
        switchToNextTab(1);
    }

}
