package com.lookBook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPanelPositiveTests extends TestBase{

    @Test
    public void searchTestWithWalidName() {
        driver.findElement(By.cssSelector(".input")).click();
        driver.findElement(By.cssSelector(".input")).clear();
        driver.findElement(By.cssSelector(".input")).sendKeys("Three Comrades");
        driver.findElement(By.cssSelector(".input")).sendKeys(Keys.ENTER);
        Assert.assertTrue(isElementPresent(By.cssSelector(".found-books h5")));
    }
}
