package com.lookBook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountNegativeTests extends TestBase {

    @Test
    public void createAccountNegativeTestWithWrongName() {
        app.getUser().clickOnSignUpLink();
        app.getUser().fillRegisterFieldWithWrongName();
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isAlertAppears());
    }

    @Test
    public void createAccountNegativeTestWithWrongPassword() {
        app.getUser().clickOnSignUpLink();
        app.getUser().fillRegisterFieldWithWrongPassword();
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isAlertAppears());

    }

    @Test
    public void newAccountWithSameData() {
        app.getUser().clickOnSignUpLink();
        app.getUser().fillRegisterFieldWithSameData();
        app.getUser().clickOnSignUpButton();

    }

    @Test
    public void createAccountNegativeTestWithNullName() {
        app.getUser().clickOnSignUpLink();
        app.getUser().fillRegisterFieldWithNullName();
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isAlertAppears());

    }

    @Test
    public void createAccountNegativeTestWithNullPassword() {
        app.getUser().clickOnSignUpLink();
        app.getUser().fillRegisterFieldWithNullPassword();
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isAlertAppears());
    }


}
