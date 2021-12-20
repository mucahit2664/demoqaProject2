package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.US03_RadioButtonPage;
import utilities.Driver;

public class US03_RadioButtonStepDefinitions {

    US03_RadioButtonPage radioButtonPage = new US03_RadioButtonPage();
    Actions actions = new Actions(Driver.getDriver());





    @Then("radiobox butonuna tiklayiniz")
    public void radiobox_butonuna_tiklayiniz() {
        radioButtonPage.radioButtonMenuLink.click();
    }




    @Then("yes Buttonunu tiklayiniz")
    public void yes_buttonunu_tiklayiniz() {
        radioButtonPage.yes.click();
    }
    @Then("Yes secildigini dogrulayiniz")
    public void yes_secildigini_dogrulayiniz() {
        Assert.assertTrue(radioButtonPage.yesYaziyiDogrulama.getText().contains("Yes"));
        System.out.println(radioButtonPage.yesYaziyiDogrulama.getText());
    }


    @Given("impresive butonuna tiklayiniz")
    public void impresive_butonuna_tiklayiniz() {
        radioButtonPage.impressive.click();
    }

    @Then("impresive yazisini dogrulayiniz")
    public void iimpresive_yazisini_dogrulayiniz() {
        Assert.assertTrue(radioButtonPage.yesYaziyiDogrulama.getText().contains("Impressive"));
        System.out.println(radioButtonPage.yesYaziyiDogrulama.getText());
    }
    @Then("yes buton tikli olmadigini dogrulayin")
    public void yesbutontikliolmadiginidogrulayin() {
        Assert.assertFalse(radioButtonPage.yes.isSelected());
    }
    @Then("no butonunu seciniz")
    public void no_butonunu_seciniz() {
        if (radioButtonPage.noButton.isEnabled()) {
            System.out.println("işlem tamam");

        }else {
            System.out.println("burada bug var No butonu kullanılamıyor");


        }}
    @Then("no butonunun secildigini  dogrulayiniz")
    public void no_butonunun_secildigini_dogrulayiniz() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(radioButtonPage.noButton.isEnabled(),"çalışmıyor");

    }
}
