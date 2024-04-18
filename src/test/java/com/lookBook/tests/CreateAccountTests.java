package com.lookBook.tests;

import com.lookBook.models.User;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void createNewAccountPositiveTests() {
        app.getUser().clickOnSignUpLink();
        app.getUser().fillLoginRegisterForm(new User()
                .setLogin("test125624343@gm.com")
                .setPassword("zxcvbAS1"));
        app.getUser().clickOnSignUpButton();
        // verifyUserSignUp("You have successfully registered! To make purchases you need to log in!");
      //  Assert.assertTrue(isAlertAppears());
      //  Assert.assertTrue(isElementPresent(By.cssSelector(" ")));

    }

}
