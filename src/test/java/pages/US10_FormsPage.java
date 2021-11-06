package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US10_FormsPage {


    public US10_FormsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='card-up'])[2]")

    public WebElement formSection;

    @FindBy(xpath="//span[.='Practice Form']")
    public WebElement practiseForm;

    @FindBy(xpath = "//h5[.='Student Registration Form']")
    public WebElement sayfaDogrulama;


    @FindBy(id ="firstName")
    public WebElement firstName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="userEmail")
    public WebElement userEmail;

    @FindBy(xpath ="//input[@id='gender-radio-1']")
    public WebElement genderRadio1;

    @FindBy(id ="gender-radio-2")
    public WebElement genderRadio2;

    @FindBy(id ="gender-radio-3")
    public WebElement genderRadio3;


    @FindBy(id ="userNumber")
    public WebElement userNumber;

    @FindBy(id ="dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id ="subjectsContainer")
    public WebElement subjectsContainer;

    @FindBy(id ="hobbies-checkbox-1")
    public WebElement sportCheckbox1;

    @FindBy(id ="hobbies-checkbox-2")
    public WebElement readingCheckbox1;

    @FindBy(id ="hobbies-checkbox-3")
    public WebElement musicCheckbox;

    @FindBy(id ="uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id ="currentAddress")
    public WebElement currentAddress;

    @FindBy(id ="state")
    public WebElement state;

    @FindBy(id ="city")
    public WebElement city;

    @FindBy(id ="submit")
    public WebElement submit;
}
