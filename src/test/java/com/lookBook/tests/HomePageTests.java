package com.lookBook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @Test
    public void isHomeComponentPresentTest() {
        Assert.assertTrue(isHomeComponentPresent());
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector(".mb-40"));

    }

}
