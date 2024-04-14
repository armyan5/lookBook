package com.lookBook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPanelNegativeTests extends TestBase{

    @Test
    public void searchWithNumber() {
        driver.findElement(By.cssSelector(".input")).click();
        driver.findElement(By.cssSelector(".input")).clear();
        driver.findElement(By.cssSelector(".input")).sendKeys("124253463");
        driver.findElement(By.cssSelector(".input")).sendKeys(Keys.ENTER);
        Assert.assertTrue(isElementPresent(By.cssSelector(".modal-title")));

    }

    @Test
    public void searchWithWrongName() {
        driver.findElement(By.cssSelector(".input")).click();
        driver.findElement(By.cssSelector(".input")).clear();
        driver.findElement(By.cssSelector(".input")).sendKeys("trxizculvl");
        driver.findElement(By.cssSelector(".input")).sendKeys(Keys.ENTER);
        Assert.assertTrue(isElementPresent(By.cssSelector(".modal-title")));

    }

    @Test
    public void searchWithNullName() {
        driver.findElement(By.cssSelector(".input")).click();
        driver.findElement(By.cssSelector(".input")).clear();
        driver.findElement(By.cssSelector(".input")).sendKeys("      ");
        driver.findElement(By.cssSelector(".input")).sendKeys(Keys.ENTER);
        Assert.assertTrue(isElementPresent(By.cssSelector(".modal-title")));

    }
}
