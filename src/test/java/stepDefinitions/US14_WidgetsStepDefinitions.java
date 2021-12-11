package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US14_WidgetsPage;
import utilities.Driver;
import utilities.ReusableMethods;

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
//data-picker
    @And("Kullanici date pickers sekmesini tiklar")
    public void kullaniciDatePickersSekmesiniTiklar() {
ReusableMethods.waitFor(1);
       actions.sendKeys(Keys.PAGE_DOWN).perform();

        widgets.data_PickerSekmesi.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    @And("Kullanici date girilecek selectboxa tiklar")
    public void kullaniciDateGirilecekSelectboxaTiklar() {
        widgets.selectandDate.click();
    }

    @And("Kullanici yil secer {string}")
    public void kullaniciYilSecer(String arg0) {
        Select selectYil=new Select(widgets.year);
        selectYil.selectByValue(arg0);


    }

    @And("Kullanici ay secer {string}")
    public void kullaniciAySecer(String arg0) {
        Select selectAy=new Select(widgets.ay);

        selectAy.selectByVisibleText(arg0);



    }

    @And("Kullanici gun secer {int}")
    public void kullaniciGunSecer(int gun) {
        String ilkGunText=widgets.dateilkGun.getText();
        if(ilkGunText.equals("25")){gun=gun+6;
        }else if (ilkGunText.equals("26")){
            gun=gun+5;
        }else if (ilkGunText.equals("27")){
            gun=gun+4;
        }else if (ilkGunText.equals("28")){
            gun=gun+3;
        }else if (ilkGunText.equals("29")){
            gun=gun+2;
        }else if (ilkGunText.equals("30")){
            gun=gun+1;
        }
        Driver.getDriver().findElement(By.xpath("(//*[contains(@class,'react-datepicker__day react-datepicker__day')])[" + gun+ "]")).click();

    }

    @Then("Kullanici date and time secilebildigini dogrular")
    public void kullaniciDateAndTimeSecilebildiginiDogrular() {
Assert.assertTrue(widgets.selectandDate.getAttribute("value").equals("12/04/1992"));

    }
    //date-and-time
    @And("Kullanici date and time girilecek selectboxa tiklar")
    public void kullaniciDateAndTimeGirilecekSelectboxaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        widgets.dateandTime.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    @And("Kullanici tablodan yil secer {string}")
    public void kullaniciTablodanYilSecer(String arg0) {
   ReusableMethods.waitFor(1);
   widgets.yearIki.click();
    widgets.getYear(arg0).click();

    }

    @And("Kullanici tablodan ay secer {string}")
    public void kullaniciTablodanAySecer(String arg0) {
ReusableMethods.waitFor(1);
widgets.month.click();
        widgets.getMonth(arg0).click();
    }


    @And("Kullanici tablodan time secer {string}")
    public void kullaniciTablodanTimeSecer(String arg0) {
    }

    @Then("Kullanici date and time secildigini dogrular")
    public void kullaniciDateAndTimeSecildiginiDogrular() {
    }
}
