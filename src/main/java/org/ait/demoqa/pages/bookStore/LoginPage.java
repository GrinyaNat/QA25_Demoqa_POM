package org.ait.demoqa.pages.bookStore;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) { //alt+Enter, создания конструктора
        super(driver);
    }

    @FindBy(id = "userName")//добавили локатор логина
    WebElement userNameField;//инициализация элемента

    @FindBy(id ="password")
    WebElement passwordField;

    @FindBy(id = "login")
    WebElement loginButton;

    public ProfilePage login(String userName, String password){// метод чтобы попасть на ProfilePage, возвращает профайл странички
        typeWithJSExecutor(userNameField,userName, 0, 200);
        type(passwordField,password);
        click(loginButton);
        return  new ProfilePage(driver);
    }

    public LoginPage loginNegative(String userName,String password){// негативный тест
        type(userNameField,userName);
        type(passwordField,password);
        click(loginButton);
        return  this; //возвращаем ту же страницу на которой находимся
    }


}
