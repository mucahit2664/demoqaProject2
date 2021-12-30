package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US17_TabsPage {

    public US17_TabsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //TABS
    @FindBy(xpath = "//span[.='Tabs']")
    public WebElement tabsLink;

    @FindBy(xpath = "//a[@id='demo-tab-what']")
    public WebElement tab_What;

    @FindBy(xpath = "//a[@id='demo-tab-origin']")
    public WebElement tab_Origin;

    @FindBy(xpath = "//a[@id='demo-tab-use']")
    public WebElement tab_Use;

    @FindBy(xpath = "//a[@id='demo-tab-more']")
    public WebElement tab_More;

    @FindBy(xpath = "//div[@class='fade tab-pane active show']")
    public WebElement activeTab;

    @FindBy(css = "#demo-tabpane-what")
    public WebElement whatTabText;

    @FindBy(css= "#demo-tabpane-origin")
    public WebElement originTabText;

    @FindBy(css = "#demo-tabpane-use")
    public WebElement useTabText;
    @FindBy(xpath = "//a")
    public List<WebElement> tabsBaslik;

    @FindBy(id = "demo-tab-what")
    public WebElement whatTab;
    @FindBy(css= "#demo-tabpane-what")
    public WebElement whatText;
    @FindBy(css = "#demo-tabpane-origin")
    public WebElement originText;
    @FindBy(css = "#demo-tabpane-use")
    public WebElement useText;
    @FindBy(id = "demo-tab-origin")
    public WebElement originTab;
    @FindBy(id = "demo-tab-use")
    public WebElement useTab;
    @FindBy(id = "demo-tab-more")
    public WebElement moreTab;

    //tool-tips
    @FindBy(xpath = "//span[.='Tool Tips']")
    public WebElement toolTips;
    @FindBy(id = "toolTipButton")
    public WebElement hoverMeToSeeButton;
    @FindBy(css = ".tooltip-inner")
    public WebElement gorunurText;
    @FindBy(id = "toolTipButton")
    public WebElement hoverButton;
    @FindBy(id = "toolTipTextField")
    public WebElement hovertextBox;
    @FindBy(xpath = "//a[.='Contrary']")
    public WebElement hoverContraryText;
    @FindBy(xpath = "//a[.='1.10.32']")
    public WebElement hoverDegerText;




}
