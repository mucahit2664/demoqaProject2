package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TextBoxPage {


    public TextBoxPage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    public WebElement elementsCard;

    @FindBy(xpath = "(//span[@class='pr-1'])[1]\"")
    public WebElement elementsMenu;


    @FindBy(xpath = "//span[.='Text Box']")
    public WebElement textBoxMenuLink;

    @FindBy(xpath = "//div[@class='main-header']")
    public WebElement textBoxHeader;

    @FindBy(id = "userForm")
    public WebElement userForm;

    @FindBy(id = "userName")
    public WebElement fullnameTextBox;

    @FindBy(id = "userEmail")
    public WebElement emailTextBox;

    @FindBy(id = "currentAddress")
    public WebElement currentAdressTextBox;
    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressTextBox;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']")
    public WebElement submitButtonEngel;

    @FindBy(xpath = "//div[@class='border col-md-12 col-sm-12']")
    public WebElement formKayit;
}