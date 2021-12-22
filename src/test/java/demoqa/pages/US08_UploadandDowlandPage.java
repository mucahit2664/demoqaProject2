package demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import demoqa.utilities.Driver;

public class US08_UploadandDowlandPage {


    public US08_UploadandDowlandPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="//span[.='Upload and Download']")
    public WebElement UploadandDownload;

    @FindBy(xpath = "//input[@id='uploadFile']")
    public WebElement uploadFile;


     @FindBy(linkText = "Download")
    public WebElement downloadButton;

    @FindBy(id = "uploadedFilePath")
    public  WebElement choosefileTexti;
}
