package com.lookBook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void createNewAccountPositiveTests() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

        driver.findElement(By.id("new-login")).click();
        driver.findElement(By.id("new-login")).clear();
        driver.findElement(By.id("new-login")).sendKeys("");

        driver.findElement(By.id("new-password")).click();
        driver.findElement(By.id("new-password")).clear();
        driver.findElement(By.id("new-password")).sendKeys("");

        driver.findElement(By.cssSelector(".submitButton")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(" ")));

    }
}
