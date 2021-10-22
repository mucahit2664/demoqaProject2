package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US03_RadioButtonPage;
import utilities.Driver;

public class US03_RadioButtonStepDefintions {
    US03_RadioButtonPage radioButtonPage = new US03_RadioButtonPage();
    Actions actions = new Actions(Driver.getDriver());
    @Then("radioButton butonuna basiniz")
    public void radio_button_butonuna_basiniz() {
radioButtonPage.radioButtonMenuLink.click();
    }

    @Then("yes buttonunu  tiklayiniz")
    public void yes_buttonunu_tiklayiniz() {
radioButtonPage.yes.click();
    }

    @Then("yes butonuna basinca cikan yaziyi dogrulayin")
    public void yes_butonuna_basinca_cikan_yaziyi_dogrulayin() {
Assert.assertTrue(radioButtonPage.yesYaziyiDogrulama.getText().contains("Yes"));
        System.out.println(radioButtonPage.yesYaziyiDogrulama.getText());
    }

    @Then("Impresive butonuna tiklayiniz")
    public void impresive_butonuna_tiklayiniz() {
radioButtonPage.impressive.click();
    }

    @Then("İmpersive yazisini dogrulayiniz")
    public void i̇mpersive_yazisini_dogrulayiniz() {
        Assert.assertTrue(radioButtonPage.yesYaziyiDogrulama.getText().contains("Impressive"));
        System.out.println(radioButtonPage.yesYaziyiDogrulama.getText());
    }

    @Then("Yes butonunun secili olmadigini dogrulayin")
    public void yes_butonunun_secili_olmadigini_dogrulayin() {
        Assert.assertFalse(radioButtonPage.yes.isSelected());
    }


    @Then("No butonunu seciniz")
    public void noButonunuSeciniz() {
        radioButtonPage.noButton.click();
    }


    @Then("No butonunun secildigini  dogrulayiniz")
    public void no_butonunun_secildigini_dogrulayiniz() {
        if (radioButtonPage.noButton.isEnabled()){
            System.out.println("işlem tamam");
        }else {
            System.out.println("burada bug car No butonu kullanılamıyor");
        }
    }

}


