package org.ait.demoqa.pages;

import org.ait.demoqa.elements.BrokenImagesPage;
import org.ait.demoqa.elements.BrokenLinksImagesPage;
import org.ait.demoqa.elements.LinksPage;
import org.ait.demoqa.pages.bookStore.BookStorePage;
import org.ait.demoqa.pages.bookStore.LoginPage;
import org.ait.demoqa.pages.bookStore.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage{

    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".show #item-0")
    WebElement login;

    public LoginPage selectLogin() {
        clickWithJSExecutor(login,0,600);
        return new LoginPage(driver);
    }
    @FindBy(xpath = "//span[.='Profile']")
    WebElement profile;

    public ProfilePage selectProfile() {
        clickWithJSExecutor(profile, 0, 600);
        return new ProfilePage(driver);
    }

    @FindBy(xpath = "//span[.='Links']")
    WebElement links;
    public LinksPage selectLinks() {
        clickWithJSExecutor(links,0, 300);
        return new LinksPage(driver);
    }
    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;
    public BrokenLinksImagesPage selectBrokenLinksImages() {
        clickWithJSExecutor(brokenLinksImages, 0, 300);
        return new BrokenLinksImagesPage(driver);
    }

    @FindBy(xpath = "//span[.='Broken Images']")
    WebElement brokenImages;
    public BrokenImagesPage selectBrokenImages() {
        clickWithJSExecutor(brokenImages, 0, 300);
        return new BrokenImagesPage(driver);
    }
}