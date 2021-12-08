package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US14_WidgetsPage {

    public US14_WidgetsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//div[@class='card-up'])[4]")
    public WebElement WidgetBolum;


    @FindBy(xpath = "//span[.='Accordian']")
    public WebElement accordianSekmesi;

    @FindBy(xpath = "(//div[@class='card-header'])[1]")
    public WebElement acordian1;

    @FindBy(xpath = "(//div[@class='card-header'])[2]")
    public WebElement acordian2;

    @FindBy(xpath = "(//div[@class='card-header'])[3]")
    public WebElement acordian3;

    @FindBy(xpath = "(//div[@class='card-body'])[1]")
    public WebElement acord1Text;
    @FindBy(xpath = "(//div[@class='card-body'])[2]")
    public WebElement acord2Text;
    @FindBy(xpath = "(//div[@class='card-body'])[3]")
    public WebElement acord3Text;

    @FindBy(xpath = "//div[@class='collapse show']")
    public WebElement collapseShow;


//Auto_Complete

    @FindBy(xpath = "//span[.='Auto Complete']")
    public WebElement Auto_CompleteSekmesi;
    @FindBy(xpath = "(//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3'])[1]")
    public WebElement multipleAuto_CompleteInput;

    @FindBy(id = "autoCompleteSingle")
    public WebElement singleCompleteInput;
//DATA-PICKER

    @FindBy(xpath = "//span[.='Date Picker']")
    public WebElement data_PickerSekmesi;

    @FindBy(id = "datePickerMonthYearInput")
    public WebElement selectandDate;
@FindBy(className = "react-datepicker__year-select")
    public WebElement year;
    @FindBy(className = "react-datepicker__month-select")
    public WebElement ay;
    @FindBy(xpath="(//*[contains(@class,'react-datepicker')])[29]")
    public WebElement dateilkGun;
    @FindBy(id = "dateAndTimePickerInput")
    public WebElement dateandTime;
    @FindBy(xpath = "//div[.='May']")
    public WebElement monthMay;
    @FindBy(xpath = "//div[.='2018']")
    public WebElement year2018;
    @FindBy(xpath = "//div[@class='react-datepicker__year-read-view']")
    public WebElement yearIki;
    @FindBy(xpath = "//div[@class='react-datepicker__month-read-view']")
    public WebElement month;

    public WebElement getYear(String year){

        return Driver.getDriver().findElement(By.xpath("//div[.='"+year+"']"));
    }



    public WebElement getMonth(String month){

        return Driver.getDriver().findElement(By.xpath("//div[.='"+month+"']"));
    }




}