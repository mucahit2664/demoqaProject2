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
    @FindBy(xpath ="//span[.='Modal Dialogs']")
    public WebElement ModalDialogSekmesi;
    @FindBy(tagName ="body")
    public WebElement messagText;

    @FindBy(id ="showLargeModal")
    public WebElement showLargeModal;

    @FindBy(id ="showSmallModal")
    public WebElement showSmallModal;

    @FindBy(id ="closeSmallModal")
    public WebElement closeSmallModal;

    @FindBy(id ="closeLargeModal")
    public WebElement closeLargeModal;

    @FindBy(id ="example-modal-sizes-title-lg")
    public WebElement largeModalBaslik;

    @FindBy(id ="example-modal-sizes-title-sm")
    public WebElement smallModalBaslik;

    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement small_LargeModaltext;
}
