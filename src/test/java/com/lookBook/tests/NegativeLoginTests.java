package com.lookBook.tests;

import com.lookBook.fw.UserHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {

    @Test
    public void loginNegativeTestWithNotValidEmail() {
        app.driver.findElement(UserHelper.signInLink()).click();
        app.getUser().fillLoginFieldWithNotValidEmail();
        app.driver.findElement(UserHelper.sinInButton()).click();
        Assert.assertTrue(app.getUser().isAlertAppears());

    }

    @Test
    public void loginNegativeTestWithNullEmail() {
        app.driver.findElement(UserHelper.signInLink()).click();
        app.getUser().fillLoginFieldWithNullEmail();
        app.driver.findElement(UserHelper.sinInButton()).click();
        Assert.assertTrue(app.getUser().isAlertAppears());

    }


    @Test
    public void loginNegativeTestWithNotWalidPassword() {
        app.driver.findElement(UserHelper.signInLink()).click();
        app.getUser().fillLoginFieldWithNotWalidPassword();
        app.driver.findElement(UserHelper.sinInButton()).click();
        Assert.assertTrue(app.getUser().isAlertAppears());

    }

    @Test
    public void loginNegativeTestWithNullPassword() {
        app.driver.findElement(UserHelper.signInLink()).click();
        app.getUser().fillLogFieldWithNullPassword();
        app.driver.findElement(UserHelper.sinInButton()).click();
        Assert.assertTrue(app.getUser().isAlertAppears());

    }

}
