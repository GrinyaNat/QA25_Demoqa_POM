package org.ait.demoqa.tests;


import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.JSExecutor;
import org.ait.demoqa.pages.UserData;
import org.testng.annotations.Test;

public class JSExecutorTests extends TestBase{

    @Test
    public void jsExecutorTest() {
        new HomePage(driver).getFormAuthentication();
        new JSExecutor(driver)
                .enterDataWithJSE(UserData.USER_NAME,UserData.USER_PASSWORD)
                .clickOnLoginButtonWithJSE()
                .checkURLWithJSE();
    }
}
