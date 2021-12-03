package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US12_WidgetsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;


public class US12_WidgetsStepDefinitions {
    US12_WidgetsPage widgets = new US12_WidgetsPage();
    Actions actions = new Actions(Driver.getDriver());



    @And("kullanici widgets sekmesini acar")
    public void kullaniciWidgetsSekmesiniAcar() {
widgets.WidgetBolum.click();
    }

    @And("Kullanici Accordian sekmesini tiklar")
    public void kullaniciAccordianSekmesiniTiklar() {
        widgets.accordianSekmesi.click();
    }

    @And("Kullanici ilk acordian tiklar")
    public void kullaniciIlkAcordianTiklar() {

        ReusableMethods.waitFor(2);
        System.out.println(widgets.acord1Text.getText());

    }

    @Then("Kullanici digerlerinin kapalı oldugunu dogrular")
    public void kullaniciDigerlerininKapalıOldugunuDogrular() {

        List<WebElement> elems=Driver.getDriver().findElements(By.xpath("//div[@class='collapse show']"));

       int okunanYaziSayisi= elems.size();
        System.out.println(okunanYaziSayisi);
        widgets.acordian1.click();
        Assert.assertTrue(okunanYaziSayisi==1);
    }

    @And("Kullanici ikinci acordian tiklar")
    public void kullaniciIkinciAcordianTiklar() {
        ReusableMethods.waitFor(2);
        widgets.acordian2.click();
        ReusableMethods.waitFor(2);
        System.out.println(widgets.acord2Text.getText());
    }

    @And("Kullanici ucuncu acordian tiklar")
    public void kullaniciUcuncuAcordianTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        widgets.acordian3.click();
        ReusableMethods.waitFor(2);
        System.out.println(widgets.acord3Text.getText());
    }
}