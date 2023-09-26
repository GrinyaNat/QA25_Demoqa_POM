package org.ait.demoqa.elements;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

public class LinksPage extends BasePage {

    public LinksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "a")
    List<WebElement> allLinks;

    public LinksPage getAllLinks() {
        System.out.println("Total number of links on the page: ");
        String url;
        //перебрать элементы
        Iterator<WebElement> iterator = allLinks.iterator();
        while (iterator.hasNext()) {//поочереди печатать
            url = iterator.next().getText();
            System.out.println(url);
        }
        return this;
    }

    @FindBy(css = "[href]")
    WebElement attr;

    public LinksPage checkBrokenLinks() {
        for (int i = 0; i < allLinks.size(); i++) { //перебираем все линки с тегом href
            WebElement el = allLinks.get(i);
            String url = el.getAttribute("href");
            verifyLinks(url);

        }
        return this;
    }

}
