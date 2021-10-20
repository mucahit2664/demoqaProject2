package pages;

import org.jsoup.select.Evaluator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WbTablesPage {


    public WbTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@id='item-3'])[1]")
    public WebElement webTables;


@FindBy(id="addNewRecordButton")
    public WebElement add;
@FindBy(id="firstName")
public WebElement firstName;

    @FindBy(id="lastName")
    public WebElement lastName;
    @FindBy(id="userEmail")
    public WebElement email;
    @FindBy(id="age")
    public WebElement age;
    @FindBy(id="salary")
    public WebElement salary;
    @FindBy(id="department")
    public WebElement department;
    @FindBy(id="submit")
    public WebElement submit;
    @FindBy(id="searchBox")
    public WebElement seaarch;
    @FindBy(xpath = "(//div[@class='rt-tr -odd'])[1]")
    public WebElement firstRow;
}
