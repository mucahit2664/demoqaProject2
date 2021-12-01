package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US13_FramePage;
import utilities.Driver;
import utilities.ReusableMethods;


public class US13_FrameStepDefinitions {

US13_FramePage us13_framePage=new US13_FramePage();
Actions actions=new Actions(Driver.getDriver());

    @Given("Kulanici acilan sekmede Frames basligini tiklar.")
    public void kulanici_acilan_sekmede_frames_basligini_tiklar() {
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
us13_framePage.frames.click();
    }

    @Then("frameler arasinda gecis oldugu dogrulanabilir")
    public void frameler_arasinda_gecis_oldugu_dogrulanabilir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("frame2")));

        String message1=us13_framePage.samplePage.getText();
        System.out.println("frame2:"+us13_framePage.samplePage.getText());
        Driver.getDriver().switchTo().defaultContent();
        actions.sendKeys(Keys.PAGE_UP).perform();

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("frame1")));
        ReusableMethods.waitFor(1);
        String message2=us13_framePage.samplePage.getText();
        System.out.println("frame1:"+us13_framePage.samplePage.getText());
        Assert.assertTrue(message1.equals(message2));
    }
    @Given("Kulanici acilan sekmede NestedFrames basligini tiklar.")
    public void kulanici_acilan_sekmede_nested_frames_basligini_tiklar() {
     actions.sendKeys(Keys.PAGE_DOWN).perform();
     ReusableMethods.waitFor(1);
     us13_framePage.nestedFrames.click();

    }

    @Then("nestedFrame arasinda gecis oldugu dogrulanabiir")
    public void nested_frame_arasinda_gecis_oldugu_dogrulanabiir() {
//Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("frame1")));
        SoftAssert softAssert=new SoftAssert();
        Driver.getDriver().switchTo().frame("frame1");
ReusableMethods.waitFor(1);
String parentMessage=us13_framePage.parentChildMessage.getText();
        System.out.println(parentMessage);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.tagName("iframe")));
        ReusableMethods.waitFor(1);
        String childMessage=us13_framePage.parentChildMessage.getText();
        System.out.println(childMessage);
        ReusableMethods.waitFor(1);
      //  Driver.getDriver().switchTo().parentFrame();
/*Assert.assertTrue(childMessage.equals("Child Iframe"));
Assert.assertTrue(parentMessage.equals("Parent frame"))*/;
softAssert.assertTrue(childMessage.equals("Child Iframe"));
softAssert.assertTrue(parentMessage.equals("Parent frame"));




softAssert.assertAll();
    }

    @And("Kulanici acilan sekmede modalDialogs basligini tiklar.")
    public void kulaniciAcilanSekmedeModalDialogsBasliginiTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
us13_framePage.modalDialogs.click();
    }

    @And("Kullanici acilan sayfada smallModal buonuna tiklar")
    public void kullaniciAcilanSayfadaSmallModalBuonunaTiklar() {
        ReusableMethods.waitFor(1);
        us13_framePage.showSmallModal.click();
    }


    @Then("Kullanici {string}mesaji gorur")
    public void kullaniciMesajiGorur(String arg0) {
        SoftAssert softAssert=new SoftAssert();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(us13_framePage.smallModal.getText().equals(arg0));
        System.out.println(arg0);
        softAssert.assertAll();
    }

    @Then("Kullanici close butonuna basildiginda smallModalin kapandigini dogrular")
    public void kullaniciCloseButonunaBasildigindaSmallModalinKapandiginiDogrular() {
        us13_framePage.close.click();
        Assert.assertTrue(us13_framePage.close.isEnabled());

    }

    @And("Kullanici acilan sayfada largeModal buonuna tiklar")
    public void kullaniciAcilanSayfadaLargeModalBuonunaTiklar() {
        ReusableMethods.waitFor(1);

        us13_framePage.largeModalButton.click();
    }


    @Then("Kullanici mesaji gorur")
    public void kullaniciMesajiGorur() {
        SoftAssert softAssert=new SoftAssert();

        String cssValue=us13_framePage.largeModalText.getCssValue("font-family");
        System.out.println(cssValue);
        softAssert.assertTrue(cssValue.contains("Roboto"));

        softAssert.assertTrue(us13_framePage.largeModalText.isEnabled());

        softAssert.assertAll();
    }

    @Then("Kullanici close butonuna basildiginda largeModalin kapandigini dogrular")
    public void kullaniciCloseButonunaBasildigindaLargeModalinKapandiginiDogrular() {
        ReusableMethods.waitFor(1);
        us13_framePage.largeModalWindowCloseButton.click();
        Assert.assertTrue(us13_framePage.textAssertionTag.getCssValue("class").equals(""));
    }


    @And("kullanici {string} ı goruntuler:")
    public void kullaniciIGoruntuler(String arg0,String uzunmesaj) {
ReusableMethods.waitFor(1);
        System.out.println(arg0);
        System.out.println(uzunmesaj);
        System.out.println(us13_framePage.smallModal.getText());
        Assert.assertTrue(us13_framePage.smallModal.getText().equals(uzunmesaj));

    }


    @And("kullanici goruntuler")
    public void kullaniciGoruntuler(String a) {


        System.out.println(a);
        System.out.println(us13_framePage.smallModal.getText());
        Assert.assertTrue(us13_framePage.smallModal.getText().equals(a));
    }




    @And("kullanici Large modal butonunu tiklar")
    public void kullaniciLargeModalButonunuTiklar() {
        us13_framePage.largeModalButton.click();
    }


}

