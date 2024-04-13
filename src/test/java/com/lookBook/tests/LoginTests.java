package com.lookBook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        driver.findElement(By.cssSelector(".SignInHeader")).click();

        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(""); // sendKeys

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(""); // sendKeys
        Assert.assertTrue(isElementPresent(By.cssSelector(""))); // assert logOut
    }
}
