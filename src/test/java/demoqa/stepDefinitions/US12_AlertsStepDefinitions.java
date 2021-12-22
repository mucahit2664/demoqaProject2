package demoqa.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import demoqa.pages.US12_AlertsPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;

public class US12_AlertsStepDefinitions {
    US12_AlertsPage us12_alertsPage = new US12_AlertsPage();

Actions actions=new Actions(Driver.getDriver());
    @And("Kulanici acilan sekmede Alerts basligini tiklar.")
    public void kulaniciAcilanSekmedeAlertsBasliginiTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        us12_alertsPage.alertsButonu.click();
    }

    @And("Kullanici ilk alertme butonuna tiklar.")
    public void kullaniciIlkAlertmeButonunaTiklar() {
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);
        us12_alertsPage.alertbirinciclikcme.click();
    }

    @Then("Kullanici alert uzerinde mesaji dogrular.")
    public void kullaniciAlertUzerindeMesajiDogrular() {
        // Alert a = Driver.getDriver().switchTo().alert();

        String s= Driver.getDriver().switchTo().alert().getText();
        System.out.println(s);

        Assert.assertTrue(s.equals("You clicked a button"));

    }

    @Then("Kullanici alert uzerinde tamam butonunun tiklanabilir oldugunu dogrular.")
    public void kullaniciAlertUzerindeTamamButonununTiklanabilirOldugunuDogrular() {
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().alert().accept();

    }

    @And("Kullanici ikinci alertme butonuna tiklar.")
    public void kullaniciIkinciAlertmeButonunaTiklar() {
        ReusableMethods.waitFor(5);
        us12_alertsPage.alertikinciclickme.click();
    }
/*

    @Then("Kullanici alertin {int}sn gorunmedigini dogrular.")
    public void kullaniciAlertinSnGorunmediginiDogrular(int arg0) {

    }
*/

    @Then("Kullanici alertte {int}sn sonra mesajin gorundugunu dogrular.")
    public void kullaniciAlertteSnSonraMesajinGorundugunuDogrular(int arg0) {
        ReusableMethods.waitFor(5);
        String gecikenMesaj= Driver.getDriver().switchTo().alert().getText();
        System.out.println(gecikenMesaj);

        Assert.assertTrue(gecikenMesaj.equals("This alert appeared after 5 seconds"));
        Driver.getDriver().switchTo().alert().accept();

    }

    @And("Kullanici ucuncu alertme butonuna tiklar.")
    public void kullaniciUcuncuAlertmeButonunaTiklar() {
        us12_alertsPage.alertucuncuclikcme.click();
    }

    @Then("tamam butonunu tiklar")
    public void tamamButonunuTiklar() {
        ReusableMethods.waitFor(1);
        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("tamam secildiginde selected ok yazisini dogrular")
    public void tamamSecildigindeSelectedOkYazisiniDogrular() {
        ReusableMethods.waitFor(1);
       String confirm=us12_alertsPage.confirmResult.getText();
        System.out.println(confirm);
        Assert.assertTrue(confirm.equals("You selected Ok"));



    }

    @Then("iptal butonunu tiklar")
    public void iptalButonunuTiklar() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    @Then("iptal secildiginde selected cancelyazisini dogrular")
    public void iptalSecildigindeSelectedCancelyazisiniDogrular() {
        ReusableMethods.waitFor(1);
        String confirm2=us12_alertsPage.confirmResult.getText();
        System.out.println(confirm2);
        Assert.assertTrue(confirm2.equals("You selected Cancel"));



    }

    @And("Kullanici dorduncu alertme butonuna tiklar.")
    public void kullaniciDorduncuAlertmeButonunaTiklar() {
        us12_alertsPage.alertdorduncuclickme.click();
    }

    @When("Kullanici textboxa mesaj yazar.")
    public void kullaniciTextboxaMesajYazar() {
        Driver.getDriver().switchTo().alert().sendKeys("team3");
    }

    @And("Kullanici alertte tamam butonunu tiklar.")
    public void kullaniciAlertteTamamButonunuTiklar() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Kullanici mesajin goruntulendigini dogrular.")
    public void kullaniciMesajinGoruntulendiginiDogrular() {
        String prompt=us12_alertsPage.promptResult.getText();
        System.out.println(prompt);
        Assert.assertTrue(prompt.contains("team3"));
    }
}

