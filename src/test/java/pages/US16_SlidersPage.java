package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US16_SlidersPage {

    public US16_SlidersPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[4]")
    public WebElement widgetsCard;
    @FindBy(xpath = "//span[.='Slider']")
    public WebElement sliderLink;
    @FindBy(xpath = "//input[@class='range-slider range-slider--primary']")
    public WebElement sliderBall;
    @FindBy(id = "sliderValue")
    public WebElement sliderValue;
    @FindBy(xpath = "//div[@class='range-slider__tooltip__label']")
    public WebElement sliderValue2;

    //PROGRESS---BAR
    @FindBy(xpath = "//span[.='Progress Bar']")
    public WebElement progressBar;
    @FindBy(xpath = "//button[@id='startStopButton']")
    public WebElement startStopButton;
    @FindBy(xpath = "//div[@class='progress-bar bg-info']")
    public WebElement progressBarPercent;
    @FindBy(xpath = "//button[@id='resetButton']")
    public WebElement resetButton;
    @FindBy(xpath = "//div[@class='progress-bar bg-success']")
    public WebElement progressBarSuccess;

}
