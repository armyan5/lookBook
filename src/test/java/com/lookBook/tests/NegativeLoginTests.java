package com.lookBook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {

    @Test
    public void loginNegativeTestWithNotValidEmail() {
        driver.findElement(By.cssSelector(".SignInHeader")).click();

    }

    @Test
    public void loginNegativeTestWithNotWalid() {
        driver.findElement(By.cssSelector(".SignInHeader")).click();

    }

}
