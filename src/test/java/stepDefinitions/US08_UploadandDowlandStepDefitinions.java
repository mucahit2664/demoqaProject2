package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US08_UploadandDowlandPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08_UploadandDowlandStepDefitinions {

    US08_UploadandDowlandPage us08_uploadandDowlandPage=new US08_UploadandDowlandPage();
    Actions actions=new Actions(Driver.getDriver());




    @Then("UploandandDownland butonuna tiklayiniz")
    public void uploandand_downland_butonuna_tiklayiniz() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        us08_uploadandDowlandPage.UploadandDownload.click();
    }

    @Given("choosefile btonunu seciniz")
    public void choosefile_btonunu_seciniz() {
    ReusableMethods.waitFor(1);
        us08_uploadandDowlandPage.uploadFile.click();
    }

    @Given("bir dosya indiriniz")
    public void bir_dosya_indiriniz() {

    }

    @Given("sectigimiz dosyanin gorunurlugunu dogrulayiniz")
    public void sectigimiz_dosyanin_gorunurlugunu_dogrulayiniz() {

    }

    @Given("dosyaninin indriildigini dogrulayiniz")
    public void dosyaninin_indriildigini_dogrulayiniz() {

    }

    @Given("Dowland butonuna tiklayiniz")
    public void dowland_butonuna_tiklayiniz() {

    }

    @Given("indirilen dosyayi gorunurlugunu dogrulayiniz")
    public void indirilen_dosyayi_gorunurlugunu_dogrulayiniz() {

    }



}
