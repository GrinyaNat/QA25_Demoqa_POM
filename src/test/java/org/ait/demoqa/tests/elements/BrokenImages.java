package org.ait.demoqa.tests.elements;

import org.ait.demoqa.elements.BrokenImagesPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImages extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBrokenImages();
    }

    @Test
    public void checkNewBrokenImages() {// битые картинки
        new SidePanel(driver).selectBrokenImages();
        new BrokenImagesPage(driver).checkNewBrokenImages();
    }
}
