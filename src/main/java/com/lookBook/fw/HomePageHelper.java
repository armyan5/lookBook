package com.lookBook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper{
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public static By fbLink() {
        return By.className("mr-10");
    }

    public static By watsAppLink() {
        return By.className("whatsapp");
    }

    public static By instagramLink() {
        return By.className("instagram");
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector(".mb-40"));

    }

    public boolean titleOfBook() {
        return isElementPresent(By.cssSelector(".modal-title"));
    }

    public void fillSearchField() {
        type(By.cssSelector(".input"),"124253463");
        driver.findElement(By.cssSelector(".input")).sendKeys(Keys.ENTER);
    }

    public void fillSearchFieldWithWalidName() {
        type(By.cssSelector(".input"),"Three Comrades");
        driver.findElement(By.cssSelector(".input")).sendKeys(Keys.ENTER);
    }
}
