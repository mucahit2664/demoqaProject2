package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStoreApplicationPage {


public BookStoreApplicationPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}



    @FindBy(xpath = "//h5[text()='Book Store Application']")
    public WebElement bookStoreApplication;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement bookStoreLogin;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(xpath = "//button[text()='New User']")
    public WebElement newUserButton;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@title='reCAPTCHA']")
    public WebElement captchaIframe;


    @FindBy(xpath = "//span[@role='checkbox']")
    public WebElement notRobotCheckBox;

    @FindBy(xpath = "//button[@id='register']")
    public WebElement registerButton;

    @FindBy(xpath = "//button[@id='gotologin']")
    public WebElement backToLoginButton;
}
