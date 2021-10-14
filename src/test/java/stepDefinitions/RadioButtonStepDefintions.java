package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RadioButtonPage;

public class RadioButtonStepDefintions {
RadioButtonPage radioButtonPage=new RadioButtonPage();


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

    @Then("Impressive butonuna basiniz")
    public void impressive_butonuna_basiniz() {
        
    }

    @Then("Impressive basinca cikan yaziyi dogrulayin")
    public void impressive_basinca_cikan_yaziyi_dogrulayin() {
      
    }

    @Then("Impressive basinca yes butonundan secili olmadigini dogrulayin")
    public void impressive_basinca_yes_butonundan_secili_olmadigini_dogrulayin() {
      
    }

    @And("no butonuna basiniz")
    public void noButonunaBasiniz() {
    }


    @And("no butonun seciligini dogrulayin")
    public void noButonunSeciliginiDogrulayin() {
    }
}
