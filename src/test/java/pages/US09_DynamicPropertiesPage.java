package pages;

import org.jsoup.select.Evaluator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US09_DynamicPropertiesPage {

    public US09_DynamicPropertiesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//span[.='Dynamic Properties']")
    public WebElement dynamicProperties;
    @FindBy(id = "enableAfter")
    public WebElement enableButton;
@FindBy(xpath ="//button[@id='colorChange']")
    public WebElement colorChangeButton;
    @FindBy(id = "visibleAfter")
    public WebElement visibleButton;

}
