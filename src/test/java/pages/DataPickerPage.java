package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DataPickerPage {

    public DataPickerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//span[.='Date Picker']")
    public WebElement dataPickerSekmesi;


    @FindBy(xpath ="(//div[@class='react-datepicker__input-container'])[1]")
    public WebElement tarihsecme1;
    @FindBy(xpath ="(//div[@class='react-datepicker__input-container'])[2]")
    public WebElement zamansecme2;
    @FindBy(id = "dateAndTimePickerInput")
    public WebElement dateandTime;


    @FindBy(xpath="(//*[contains(@class,'react-datepicker')])[29]")
    public WebElement dateilkGun;
    @FindBy(id="datePickerMonthYearInput")
    public WebElement tarihsonuc;

    @FindBy(xpath="//select[@class='react-datepicker__year-select']")
    public WebElement selectYil;

    @FindBy(xpath="//select[@class='react-datepicker__month-select']")
    public WebElement selectAy;

    @FindBy(xpath="//select[@class='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--scroll']")
    public WebElement selectZamanYil;


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


    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and (not(contains (class,'react-datepicker__day--weekend')))]")
    public List<WebElement> days;

    @FindBy(xpath = "//div[.='May']")
    public WebElement monthMay;
    @FindBy(xpath = "//div[.='2018']")
    public WebElement year2018;
    @FindBy(xpath = "//div[@class='react-datepicker__year-read-view']")
    public WebElement yearIki;

    @FindBy(xpath = "//div[@class='react-datepicker__month-read-view']")
    public WebElement month;

    @FindBy(xpath = "//li[starts-with(@class,‘react-datepicker__time-list-item’)]")

    public List<WebElement> time;


    public static WebElement gunusecme(int a){
        return Driver.getDriver().findElement(By.xpath("(//*[contains(@class,'react-datepicker')])["+a+"]"));

    }

    public WebElement getYear(String year){

        return Driver.getDriver().findElement(By.xpath("//div[.='"+year+"']"));
    }



    public WebElement getMonth(String month){

        return Driver.getDriver().findElement(By.xpath("//div[.='"+month+"']"));
    }






    public WebElement getGun(int gun){

        return Driver.getDriver().findElement(By.xpath("(//*[contains(@class,'react-datepicker__day react-datepicker__day')])[" + (gun) + "]"));
    }





}
