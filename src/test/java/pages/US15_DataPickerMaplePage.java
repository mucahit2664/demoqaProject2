package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US15_DataPickerMaplePage {

    public US15_DataPickerMaplePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "(//div[@class='card-up'])[4]")
    public WebElement widgets;
    @FindBy(xpath = "//span[.='Date Picker']")
    public WebElement datePicker;

    @FindBy(css = "#datePickerMonthYearInput")
    public WebElement selectDateBox;

    @FindBy(css = ".react-datepicker__month-select")
    public WebElement selectDateMonthSelectBox;

    @FindBy(css = ".react-datepicker__year-select")
    public WebElement selectDateYearSelectBox;

    @FindBy(id = "dateAndTimePickerInput")
    public WebElement dateAndTimeBox;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'January'))]")
    public List<WebElement> january;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'February'))]")
    public List<WebElement> february;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'March'))]")
    public List<WebElement> march;
    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'April'))]")
    public List<WebElement> april;
    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'May'))]")
    public List<WebElement> may;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'June'))]")
    public List<WebElement> june;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'July'))]")
    public List<WebElement> july;

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'August'))]")
    public List<WebElement> august;
    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'September'))]")
    public List<WebElement> september;
    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'October'))]")
    public List<WebElement> october;
    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'November'))]")
    public List<WebElement> november;
    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (contains (@aria-label,'December'))]")
    public List<WebElement> december;


}
