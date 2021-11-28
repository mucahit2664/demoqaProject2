package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US13_FramePage {

    public US13_FramePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Frames']")
    public WebElement frames;

//This is a sample page
    @FindBy(id = "sampleHeading")
    public WebElement samplePage;
}
