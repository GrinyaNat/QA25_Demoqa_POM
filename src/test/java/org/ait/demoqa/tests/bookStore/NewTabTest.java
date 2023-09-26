package org.ait.demoqa.tests.bookStore;


import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.bookStore.WindowPage;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTabTest extends TestBase {

    //click on Multiple Windows link
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getMultipleWindows();
    }

    @Test
    public void switchToNewTabTest() {
        //click on Click here link and switch to new tab
        //assert New tab
        new WindowPage(driver).switchToNewTab(1)
                .verifyNewTabTitle("New Window");
    }

}
