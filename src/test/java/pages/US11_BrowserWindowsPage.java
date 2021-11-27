package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US11_BrowserWindowsPage {

    public US11_BrowserWindowsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='card-up'])[3]")
    public WebElement alertSection;
    @FindBy(xpath = "(//li[@id='item-0'])[3]")
    public WebElement browserWindows;
    @FindBy(id = "tabButton")
    public WebElement newTabButton;
    @FindBy(id = "windowButton")
    public WebElement windowButton;
    @FindBy(id="messageWindowButton")
    public WebElement messageWindow;
    @FindBy(id = "sampleHeading")
    public WebElement thisISaSamplePage;
    @FindBy(xpath = "//h1")
    public WebElement thisISaSamplePage2;
    @FindBy(tagName = "body")
    public WebElement messageWindowText;
}
