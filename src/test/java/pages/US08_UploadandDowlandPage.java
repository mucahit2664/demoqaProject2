package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US08_UploadandDowlandPage {


    public US08_UploadandDowlandPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="//span[.='Upload and Download']")
    public WebElement UploadandDownload;

    @FindBy(xpath = "//label[@class='form-file-label']")
    public WebElement uploadFile;

}
