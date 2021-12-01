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

    @FindBy(xpath = "//span[.='Nested Frames']")
    public WebElement nestedFrames;
    @FindBy(tagName = "body")
    public WebElement parentChildMessage;
    @FindBy(xpath = "//span[.='Modal Dialogs']")
    public WebElement modalDialogs;
    @FindBy(id = "showSmallModal")
    public WebElement showSmallModal;
    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement smallModal;
    @FindBy(tagName = "body")
    public WebElement smallModalText;
    @FindBy(id = "closeSmallModal")
    public WebElement close;
    @FindBy(id = "showLargeModal")
    public WebElement largeModalButton;
    @FindBy(xpath = "//p")
    public WebElement largeModalText;
    @FindBy(id = "closeLargeModal")
    public WebElement largeModalWindowCloseButton;
    @FindBy (xpath = "//body")
    public WebElement textAssertionTag;
}
