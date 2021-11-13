package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US08_UploadandDowlandPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Paths;

public class US08_UploadandDowlandStepDefitinions {

    US08_UploadandDowlandPage us08_uploadandDowlandPage=new US08_UploadandDowlandPage();
    Actions actions=new Actions(Driver.getDriver());




    @Then("UploandandDownland butonuna tiklayiniz")
    public void uploandand_downland_butonuna_tiklayiniz() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        us08_uploadandDowlandPage.UploadandDownload.click();
    }


    @Given("bir dosya indiriniz")
    public void bir_dosya_indiriniz() {
        String dosyaYukle="C:/Users/BEST TECH/Pictures/java.png";
         us08_uploadandDowlandPage.uploadFile.sendKeys(dosyaYukle);
    }

    @Given("sectigimiz dosyanin gorunurlugunu dogrulayiniz")
    public void sectigimiz_dosyanin_gorunurlugunu_dogrulayiniz() {
Assert.assertTrue(us08_uploadandDowlandPage.choosefileTexti.getText().contains("java"));
    }


    @Given("Dowland butonuna tiklayiniz")
    public void dowland_butonuna_tiklayiniz() {
us08_uploadandDowlandPage.downloadButton.click();
    }


    @Given("dosyaninin indriildigini dogrulayiniz")
    public void dosyaninin_indriildigini_dogrulayiniz() {
        String filePath="C:/Users/BEST TECH/Downloads/sampleFile.jpeg";
        ReusableMethods.waitFor(1);
        boolean isDownload= Files.exists(Paths.get(filePath));
        Assert.assertTrue(isDownload);
    }


}
