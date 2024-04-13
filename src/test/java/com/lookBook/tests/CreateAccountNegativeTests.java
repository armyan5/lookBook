package com.lookBook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountNegativeTests extends TestBase {

    @Test
    public void createAccountNegativeTestWithWrongName() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();
    }

    @Test
    public void createAccountNegativeTestWithWrongPassword() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

    }

    @Test
    public void newAccountWithSameData() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

    }

    @Test
    public void createAccountNegativeTestWithNullName() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

    }

    @Test
    public void createAccountNegativeTestWithNullPassword() {
        driver.findElement(By.cssSelector(".SignUpHeader")).click();

    }
}
