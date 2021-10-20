package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RadioButtonPage;

public class RadioButtonStepDefintions {
    RadioButtonPage radioButtonPage = new RadioButtonPage();


    @Then("radioButton butonuna basiniz")
    public void radio_button_butonuna_basiniz() {
        radioButtonPage.radioButton.click();
    }

    @Then("yes butonuna basiniz")
    public void yes_butonuna_basiniz() {
        radioButtonPage.yes.click();
    }

    @Then("yes butonuna basinca cikan yaziyi dogrulayin")
    public void yes_butonuna_basinca_cikan_yaziyi_dogrulayin() {
        Assert.assertTrue(radioButtonPage.yesYaziyiDogrulama.getText().contains("Yes"));
        System.out.println(radioButtonPage.yesYaziyiDogrulama.getText());

    }

    @Given("Impresive butonuna tiklayiniz")
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
    public void no_butonunu_seciniz() {
        radioButtonPage.noButton.click();
    }

    @Then("No butonunun secildigini  dogrulayiniz")
    public void no_butonunun_secildigini_dogrulayiniz() {
        if (radioButtonPage.noButton.isEnabled()) {
            System.out.println("işlem tamam");
        } else {
            System.out.println("burada bug car No butonu kullanılamıyor");
        }


    }
}
