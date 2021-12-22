package demoqa.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import demoqa.pages.US13_FramePage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;


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

    @And("Kulanici acilan sekmede Modal Dialogs basligini tiklar")
    public void kulaniciAcilanSekmedeModalDialogsBasliginiTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        us13_framePage.ModalDialogSekmesi.click();
    }


    @Then("Kullanici small butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciSmallButonununTiklanabilirOldugunuDogrular() {

        Assert.assertTrue(us13_framePage.showSmallModal.isEnabled());

    }


    @Then("Kullanici Large modal butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciLargeModalButonununTiklanabilirOldugunuDogrular() {
        Assert.assertTrue(us13_framePage.showSmallModal.isEnabled());
    }

    @And("kullanici Small modal butonunu tiklar")
    public void kullaniciSmallModalButonunuTiklar() {
        us13_framePage.showSmallModal.click();
    }

    @And("kullanici Large modal butonunu tiklar")
    public void kullaniciLargeModalButonunuTiklar() {
        us13_framePage.showLargeModal.click();
    }

    @Then("kullanici large close butonunun enable oldugunu dogrular")
    public void kullaniciLargeCloseButonununEnableoLdugunuDogrular() {

        Assert.assertTrue(us13_framePage.closeLargeModal.isEnabled());
    }

    @Then("kullanici small close butonunun enable oldugunu dogrular")
    public void kullaniciSmallCloseButonununEnableoLdugunuDogrular() {
        Assert.assertTrue(us13_framePage.closeSmallModal.isEnabled());
    }
    @Then("Kullanici yeni bir small modal acildigini dogrular")
    public void kullaniciYeniBirSmallModalAcildiginiDogrular() {
        System.out.println(us13_framePage.small_LargeModaltext.getText());
        Assert.assertTrue(us13_framePage.small_LargeModaltext.getText().equals("This is a small modal. It has very less content"));
    }

    @Then("kullanici Yeni Bir Genis Model Diyalog Acildigini Dogrular")
    public void kullaniciYeniBirGenisModelDiyalogAcildiginiDogrular() {
        ReusableMethods.waitFor(3);
        System.out.println(us13_framePage.small_LargeModaltext.getText());
        Assert.assertTrue(us13_framePage.small_LargeModaltext.getText()
                .equals("Lorem Ipsum is simply dummy text of the printing and" +
                        " typesetting industry. Lorem Ipsum has been the industry's " +
                        "standard dummy text ever since the 1500s, when an unknown printer " +
                        "took a galley of type and scrambled it to make a type specimen book." +
                        " It has survived not only five centuries, but also the leap into electronic " +
                        "typesetting, remaining essentially unchanged. It was popularised in the " +
                        "1960s with the release of Letraset sheets containing Lorem Ipsum passages," +
                        " and more recently with desktop publishing software like Aldus PageMaker " +
                        "including versions of Lorem Ipsum."));
    }


    @And("kullanici {string} ı goruntuler:")
    public void kullaniciIGoruntuler(String arg0,String uzunmesaj) {

        System.out.println(arg0);
        System.out.println(uzunmesaj);
        ReusableMethods.waitFor(5);
//        System.out.println(us13_framePage.small_LargeModaltext.getText());
       Assert.assertTrue(us13_framePage.small_LargeModaltext.getText().equals(uzunmesaj));

    }


    @And("kullanici goruntuler")
    public void kullaniciGoruntuler(String a) {


        System.out.println(a);
        ReusableMethods.waitFor(5);
        System.out.println(us13_framePage.small_LargeModaltext.getText());
        Assert.assertTrue(us13_framePage.small_LargeModaltext.getText().equals(a));
    }



}

