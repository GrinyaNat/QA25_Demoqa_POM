package org.ait.demoqa.tests.bookStore;

import org.ait.demoqa.data.UserData;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.pages.bookStore.BookStorePage;
import org.ait.demoqa.pages.bookStore.LoginPage;
import org.ait.demoqa.pages.bookStore.ProfilePage;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddBookToCollectionTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        //кликаем на book
        new HomePage(driver).getBookStore();
        //кликаем на логин
        new BookStorePage(driver).clickOnLoginButton();
        //логинимся
        new LoginPage(driver).login(UserData.USER_NAME, UserData.USER_PASSWORD);
    }
    @Test
    public void addBookToCollectionTest(){
        //введем имя книги
        //кликаем на книгу
        //кликаем на кноку addbookcollection
        //acceptAlert
        //кликаем profile
        //assert книги

        new BookStorePage(driver).enterBookName(UserData.BOOK_NAME)
                .clickOnBookName()
                .addToCollection();
        new SidePanel(driver).selectProfile();
        new BookStorePage(driver).verifyBookName(UserData.BOOK_NAME);
    }

    //удаление книги
    @AfterMethod
    public void deleteBookFromCollection(){
        new ProfilePage(driver).deleteBook();
    }
}
