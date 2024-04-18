package com.lookBook.fw;

import com.lookBook.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class UserHelper extends BaseHelper{


    public UserHelper(WebDriver driver) {
        super(driver);

    }

    public static By signInButton() {
        return By.className("submitButton");
    }

    public static By sinInButton() {
        return UserHelper.signInButton();
    }

    public static By signInLink() {
        return By.cssSelector(".SignInHeader");
    }

    public void switchToNextTab(int index) {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
    }

    public boolean isButtonLogoutPresent() {
        return isElementPresent(By.xpath("//button"));
    }

    public void clickOnSignInButton() {
        click(By.className("submitButton"));
    }

    public void clickOnSignInLink() {
        click(By.cssSelector(".SignInHeader"));
    }

    public void fillSignInForm(User user) {
        type(By.id("login"), user.getLogin());
        type(By.id("password"), user.getPassword());
    }

    public void fillRegisterFieldWithWrongName() {
        type(By.id("new-login"),"12345678");
        type(By.id("new-password"),"zxcvbAS1");
    }

    public void fillRegisterFieldWithWrongPassword() {
        type(By.id("new-login"),"test123@gm.com");
        type(By.id("new-password"),"dfxfgxgjc");
    }

    public void fillRegisterFieldWithSameData() {
        type(By.id("new-login"),"test123@gm.com");
        type(By.id("new-password"),"zxcvbAS1");
    }

    public void fillRegisterFieldWithNullName() {
        type(By.id("new-login"),"        ");
        type(By.id("new-password"),"zxcvbAS1");
    }

    public void clickOnSignUpButton() {
         click(By.cssSelector(".submitButton"));
    }

    public void clickInSignUpLink() {
        click(By.cssSelector(".SignUpHeader"));
    }

    public void fillLoginRegisterForm(User register) {
        type(By.id("new-login"), register.getLogin());
        type(By.id("new-password"), register.getPassword());
    }

    public void clickOnSignUpLink() {
        clickInSignUpLink();
    }

    public void fillRegisterFieldWithNullPassword() {
        type(By.id("new-login"),"test123@gm.com");
        type(By.id("new-password"),"        ");
    }

    public void fillLoginFieldWithNotValidEmail() {
        type(By.id("login"),"131idsnxl<.");
        type(By.id("password"),"zxcvbAS1");
    }

    public void fillLoginFieldWithNullEmail() {
        type(By.id("login"),"        ");
        type(By.id("password"),"zxcvbAS1");
    }

    public void fillLoginFieldWithNotWalidPassword() {
        type(By.id("login"),"test123@gm.com");
        type(By.id("password"),"12345678nn");
    }

    public void fillLogFieldWithNullPassword() {
        type(By.id("login"),"test123@gm.com");
        type(By.id("password"),"       ");
    }

    public void fillWithWrongName() {
        type(By.cssSelector(".input"),"trxizculvl");
        driver.findElement(By.cssSelector(".input")).sendKeys(Keys.ENTER);
    }

    public void fillWithNullName() {
        type(By.cssSelector(".input"),"      ");
        driver.findElement(By.cssSelector(".input")).sendKeys(Keys.ENTER);
    }
}
