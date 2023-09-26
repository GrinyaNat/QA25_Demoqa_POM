package org.ait.demoqa.tests.bookStore;


import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.bookStore.JSExecutor;
import org.ait.demoqa.pages.bookStore.UserData;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.Test;

public class JSExecutorTests extends TestBase {

    @Test
    public void jsExecutorTest() {
        new HomePage(driver).getFormAuthentication();
        new JSExecutor(driver)
                .enterDataWithJSE(UserData.USER_NAME,UserData.USER_PASSWORD)
                .clickOnLoginButtonWithJSE()
                .checkURLWithJSE();
    }
}
