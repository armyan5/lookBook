package com.lookBook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {

    @Test
    public void loginNegativeTestWithNotValidEmail() {
        driver.findElement(By.cssSelector(".SignInHeader")).click();

        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(""); // sendKeys

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(""); // sendKeys

        driver.findElement(By.className(".submitButton")).click();

    }

    @Test
    public void loginNegativeTestWithNotWalid() {
        driver.findElement(By.cssSelector(".SignInHeader")).click();

        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(""); // sendKeys

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(""); // sendKeys

        driver.findElement(By.className(".submitButton")).click();


    }

}
