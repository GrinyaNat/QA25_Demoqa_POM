package org.ait.demoqa.tests.elements;

import org.ait.demoqa.elements.BrokenLinksImagesPage;
import org.ait.demoqa.elements.LinksPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTests extends TestBase {

    @BeforeMethod //заходим на главную страницу
    public void precondition(){

        new HomePage(driver).getElements(); //переходим в аккордион Elements

    }

    @Test
    public void getAllLinksTest(){ //получаем все ссылки со страницы
        new SidePanel(driver).selectLinks();//боковая панель
        new LinksPage(driver).getAllLinks();
    }

    @Test
    public void checkBrokenLinksTest(){ //битые ссылки
        new SidePanel(driver).selectLinks();
        new LinksPage(driver).checkBrokenLinks();
    }

    @Test
    public  void checkBrokenImages() {// битые картинки
        new SidePanel(driver).selectBrokenLinksImages();
        new BrokenLinksImagesPage(driver).checkBrokenImages();



    }
}
