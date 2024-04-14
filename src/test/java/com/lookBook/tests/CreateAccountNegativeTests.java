package com.lookBook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountNegativeTests extends TestBase {

    @Test
    public void createAccountNegativeTestWithWrongName() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

        driver.findElement(By.id("new-login")).click();
        driver.findElement(By.id("new-login")).clear();
        driver.findElement(By.id("new-login")).sendKeys("");  // sendKeys

        driver.findElement(By.id("new-password")).click();
        driver.findElement(By.id("new-password")).clear();
        driver.findElement(By.id("new-password")).sendKeys("");  // sendKeys

        driver.findElement(By.className(".submitButton")).click();
    }

    @Test
    public void createAccountNegativeTestWithWrongPassword() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

        driver.findElement(By.id("new-login")).click();
        driver.findElement(By.id("new-login")).clear();
        driver.findElement(By.id("new-login")).sendKeys("");  // sendKeys

        driver.findElement(By.id("new-password")).click();
        driver.findElement(By.id("new-password")).clear();
        driver.findElement(By.id("new-password")).sendKeys("");  // sendKeys

        driver.findElement(By.className(".submitButton")).click();

    }

    @Test
    public void newAccountWithSameData() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

        driver.findElement(By.id("new-login")).click();
        driver.findElement(By.id("new-login")).clear();
        driver.findElement(By.id("new-login")).sendKeys("");  // sendKeys

        driver.findElement(By.id("new-password")).click();
        driver.findElement(By.id("new-password")).clear();
        driver.findElement(By.id("new-password")).sendKeys("");  // sendKeys

        driver.findElement(By.className(".submitButton")).click();

    }

    @Test
    public void createAccountNegativeTestWithNullName() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

        driver.findElement(By.id("new-login")).click();
        driver.findElement(By.id("new-login")).clear();
        driver.findElement(By.id("new-login")).sendKeys("");  // sendKeys

        driver.findElement(By.id("new-password")).click();
        driver.findElement(By.id("new-password")).clear();
        driver.findElement(By.id("new-password")).sendKeys("");  // sendKeys

        driver.findElement(By.className(".submitButton")).click();

    }

    @Test
    public void createAccountNegativeTestWithNullPassword() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

        driver.findElement(By.id("new-login")).click();
        driver.findElement(By.id("new-login")).clear();
        driver.findElement(By.id("new-login")).sendKeys("");  // sendKeys

        driver.findElement(By.id("new-password")).click();
        driver.findElement(By.id("new-password")).clear();
        driver.findElement(By.id("new-password")).sendKeys("");  // sendKeys

        driver.findElement(By.className(".submitButton")).click();


    }
}
