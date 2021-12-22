package demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import demoqa.utilities.Driver;

public class US12_AlertsPage {

    public US12_AlertsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//span[.='Alerts']")
    public WebElement alertsButonu;

    @FindBy(xpath ="(//button[@class='btn btn-primary'])[1]")
    public WebElement alertbirinciclikcme;
    @FindBy(xpath ="(//button[@class='btn btn-primary'])[2]")
    public WebElement alertikinciclickme;

    @FindBy(xpath ="(//button[@class='btn btn-primary'])[3]")
    public WebElement alertucuncuclikcme;

    @FindBy(xpath ="(//button[@class='btn btn-primary'])[4]")
    public WebElement alertdorduncuclickme;
    @FindBy(id="confirmResult")
    public WebElement confirmResult;
    //promptResult
    @FindBy(id="promptResult")
    public WebElement promptResult;
}
