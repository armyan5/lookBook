package com.lookBook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPanelNegativeTests extends TestBase{

    @Test
    public void searchWithNumber() {
        app.getHomePage().fillSearchField();
        Assert.assertTrue(app.getHomePage().titleOfBook());

    }

    @Test
    public void searchWithWrongName() {
        app.getUser().fillWithWrongName();
        Assert.assertTrue(app.getHomePage().titleOfBook());

    }

    @Test
    public void searchWithNullName() {
        app.getUser().fillWithNullName();
        Assert.assertTrue(app.getHomePage().titleOfBook());

    }


}
