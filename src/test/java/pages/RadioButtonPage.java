package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RadioButtonPage {


    public RadioButtonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//span[.='Radio Button']")
    public WebElement radioButton;
    @FindBy(xpath = "(//label[@class='custom-control-label'])[1]")
    public WebElement yes;
    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement yesYaziyiDogrulama;

    @FindBy(id = "impressiveRadio")
public WebElement impressive;


}
