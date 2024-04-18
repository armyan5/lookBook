package com.lookBook.tests;

import com.lookBook.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        app.getUser().clickOnSignInLink();
        app.getUser().fillSignInForm(new User()
                .setLogin("test123@gm.com")
                .setPassword("zxcvbAS1"));
        app.getUser().clickOnSignInButton();
        app.getUser().isAlertAppears();
        Assert.assertTrue(app.getUser().isButtonLogoutPresent());

    }

}
