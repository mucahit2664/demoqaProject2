package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US18_MenuPage {


    public US18_MenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Menu']")
    public WebElement menuLink;
    @FindBy(xpath = "//a[.='Main Item 1']")
    public WebElement mainMenu1;
    @FindBy(xpath = "//a[.='Main Item 2']")
    public WebElement mainMenu2;
    @FindBy(xpath = "//a[.='Main Item 3']")
    public WebElement mainMenu3;
    @FindBy(xpath = "//ul[@id='nav']/li")
    public List<WebElement> menuItems;
    @FindBy(xpath = "(//a[.='Sub Item'])[1]")
    public WebElement Sub_Item1;
    @FindBy(xpath = "(//a[.='Sub Item'])[2]")
    public WebElement Sub_Item2;

    @FindBy(xpath = "//a[.='SUB SUB LIST »']")
    public WebElement SubSubList;

    @FindBy(xpath = "//a[.='Sub Sub Item 1']")
    public WebElement SubSubItem1;
    @FindBy(xpath = "//a[.='Sub Sub Item 2']")
    public WebElement SubSubItem2;

    //==============select-menupage
    @FindBy(xpath = "//div[@class='main-header']")
    public WebElement selectMenu;

    @FindBy(xpath = "(//li[@id='item-8'])[2]")
    public WebElement selectMenuButton;

    @FindBy(id = "withOptGroup")
    public WebElement selectValueBox;

    @FindBy(xpath = "//div[@tabindex='-1']")
    public List<WebElement> selectValueDropDownOptions;
    @FindBy(xpath = "(//div[@class=' css-1uccc91-singleValue'])[1]")
    public WebElement selectOptionText;
    @FindBy(xpath = "(//div[@class=' css-1uccc91-singleValue'])[1]")
    public WebElement selectOneText;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
    public WebElement selectOneBox;

    @FindBy(xpath = "//div[@tabindex='-1']")
    public List<WebElement> selectOneDropDownOptions;

    @FindBy(id = "oldSelectMenu")
    public WebElement oldSelectBox;

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[3]")
    public WebElement multiSelectDropdownBox;

    @FindBy(xpath = "//div[@tabindex='-1']")
    public List<WebElement> multiSelectionDropDownOptions;

    @FindBy(xpath = "//div[@tabindex='-1']")
    public List<WebElement> multiSelectDropdownOptions;

    @FindBy(id = "cars")
    public WebElement standartMultiSelect;

    @FindBy(xpath = "//*[.='Multiselect drop down']")
    public WebElement multiSelectBold;





}
