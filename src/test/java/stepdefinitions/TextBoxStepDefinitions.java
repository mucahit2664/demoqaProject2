package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TextBoxPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TextBoxStepDefinitions {
    TextBoxPage textBoxPage = new TextBoxPage();
    Actions actions = new Actions(Driver.getDriver());



    @Given("demoqa anasayfaya gidin")
    public void demoqa_anasayfaya_gidin()
    {
        Driver.getDriver().get(ConfigReader.getProperty("demoqa_url"));
    }

    @Then("elements butonuna basiniz")
    public void elements_butonuna_basiniz() {

        textBoxPage.elementsCard.click();
        textBoxPage.elementsMenu.click();
actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Then("textbox butonuna tiklayiniz")
    public void textbox_butonuna_tiklayiniz() {
        ReusableMethods.waitFor(2);
        textBoxPage.textBoxMenuLink.click();

    }

    @Then("Fullname giriniz")
    public void fullname_giriniz() {
textBoxPage.userForm.click();
        textBoxPage.fullnameTextBox.sendKeys(ConfigReader.getProperty("fullName"));
    }
        @Then("email giriniz")
        public void email_giriniz () {
         textBoxPage.emailTextBox.sendKeys(ConfigReader.getProperty("email"));
        }

        @Then("adres1 giriniz")
        public void adres1_giriniz () {
           textBoxPage.currentAdressTextBox.sendKeys(ConfigReader.getProperty("currentAdress"));
        }

        @Then("adres2 giriniz")
        public void adres2_giriniz () {
            textBoxPage.permanentAddressTextBox.sendKeys(ConfigReader.getProperty("permanentAdress"));
        }

        @Then("submit butonuna tiklayin")
        public void submit_butonuna_tiklayin () {
textBoxPage.submitButton.click();
        }

        @Then("giris isleminin tamamlandigini dogrulayin")
        public void giris_isleminin_tamamlandigini_dogrulayin () {
            Assert.assertTrue(textBoxPage.formKayit.isDisplayed());
        }



}

