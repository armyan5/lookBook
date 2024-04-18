package com.lookBook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPanelPositiveTests extends TestBase{

    @Test
    public void searchTestWithWalidName() {
        app.getHomePage().fillSearchFieldWithWalidName();
        Assert.assertTrue(app.getUser().isElementPresent(By.cssSelector(".found-books h5")));
    }

}
