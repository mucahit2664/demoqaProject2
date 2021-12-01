package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.codehaus.jackson.map.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US14_AccordianPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US14_AccordianStepDefinitions {

US14_AccordianPage us14_accordianPage=new US14_AccordianPage();

Actions actions=new Actions(Driver.getDriver());
    List<WebElement> accordian = Driver.getDriver().findElements(By.xpath("//div[@class='card-header']"));


    @Given("Kulanici Widgets accordionunu tiklar")
    public void kulanici_widgets_accordionunu_tiklar() {
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        us14_accordianPage.widgets.click();
    }

    @Given("Kulanici acilan sekmede Accordian basligini tiklar.")
    public void kulanici_acilan_sekmede_accordian_basligini_tiklar() {
        us14_accordianPage.accordian.click();
       // System.out.println(accordian.size());

    }

    @Given("What is Lorem Ipsum butonuna tiklar")
    public void what_is_lorem_ipsum_butonuna_tiklar() {
us14_accordianPage.pageHeader.click();
    }

    @Then("What is Lorem Ipsum yazisini dogrular")
    public void what_is_lorem_ipsum_yazisini_dogrular() {
        Assert.assertTrue(us14_accordianPage.accordion1Text.isDisplayed());
        //Assert.assertTrue(us14_accordianPage.birinciAccordianText.getText().contains("Lorem Ipsum"));

    }

}
