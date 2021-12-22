package demoqa.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import demoqa.pages.US14_WidgetsPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;

import java.util.List;

public class US14_WidgetsStepDefinitions {

    US14_WidgetsPage widgets = new US14_WidgetsPage();
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

    //Auto Compolete




    @And("Kullanici AutoComplete sekmesini tiklar")
    public void kullaniciAutoCompleteSekmesiniTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        widgets.Auto_CompleteSekmesi.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici Multiple text alaninna tiklar")
    public void kullaniciMultipleTextAlaninnaTiklar() {
        widgets.multipleAuto_CompleteInput.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici bir veri secer {string}")
    public void kullaniciBirVeriSecer(String harf) {
        actions.sendKeys(harf).perform();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(1);
    }


    @Then("Kullanici Multiple text alaninna girdigi verilerin {string} icerdigini oldugunu dogrular")
    public void kullaniciMultipleTextAlaninnaGirdigiVerilerinIcerdiginiOldugunuDogrular(String arg0) {
        SoftAssert softAssert=new SoftAssert();
        List<String> degerler =ReusableMethods.getElementsText(By.xpath("//div[@class='css-12jo7m5 auto-complete__multi-value__label']"));
        System.out.println(degerler);
        softAssert.assertTrue(degerler.get(0).contains(arg0));
        softAssert.assertTrue(degerler.get(1).contains(arg0));
        softAssert.assertTrue(degerler.get(2).contains(arg0));

        softAssert.assertAll();

    }
    @Then("Kullanici ayni text alaninda uc veri oldugunu dogrular")
    public void kullaniciAyniTextAlanindaUcVeriOldugunuDogrular() {
        List<String> degerler =ReusableMethods.getElementsText(By.xpath("//div[@class='css-12jo7m5 auto-complete__multi-value__label']"));
        Assert.assertTrue(degerler.size()>1);
      //  System.out.println(degerler);


    }

    @And("Kullanici single text alanina tiklar")
    public void kullaniciSingleTextAlaninaTiklar() {
        ReusableMethods.waitFor(1);
        widgets.singleCompleteInput.click();
    }



    @Then("Kullanici birinci verinin olmadigini dogrular")
    public void kullaniciBirinciVerininOlmadiginiDogrular() {
        String singleDeger =widgets.singleCompleteInput.getText();

        System.out.println(singleDeger);
        Assert.assertFalse(singleDeger.contains("Magenta"));


    }

    @Then("Kullanici ikinci verinin oldugunu dogrular")
    public void kullaniciIkinciVerininOldugunuDogrular() {
        String singleDeger =widgets.singleCompleteInput.getText();
        Assert.assertTrue(singleDeger.contains("Blue"));

    }


}
