package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import pages.US10_FormsPage;
import utilities.Driver;

public class US10_FormsStepDefinitions {

US10_FormsPage us10_formsPage=new US10_FormsPage();
Faker faker=new Faker();
Actions actions=new Actions(Driver.getDriver());



    @Given("Kulanici Forms  accordionunu tiklar")
    public void kulanici_forms_accordionunu_tiklar() {
       us10_formsPage.formSection.click();
    }

    @Given("Kullanici acilan sekmede Practice Forms butonu tiklar")
    public void kullanici_acilan_sekmede_practice_forms_butonu_tiklar() {
       us10_formsPage.practiseForm.click();
    }

    @Then("Kullanici acilan sayfada Student Registration Form oldugunu dogrular.")
    public void kullanici_acilan_sayfada_student_registration_form_oldugunu_dogrular() {
        Assert.assertTrue(us10_formsPage.sayfaDogrulama.isDisplayed());
        System.out.println(us10_formsPage.sayfaDogrulama.getText());
    }

    @Given("Kullanici acilan sayfada firstname bilgisini girer.")
    public void kullanici_acilan_sayfada_firstname_bilgisini_girer() {
        us10_formsPage.firstName.sendKeys(faker.name().firstName());
    }

    @Given("firstname kabul edildigini dogrulayiniz")
    public void firstname_kabul_edildigini_dogrulayiniz() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us10_formsPage.submit.click();
        String color1=us10_formsPage.firstName.getCssValue("border-color");
        System.out.println(color1);

        String colorHex = Color.fromString(color1).asHex();
        System.out.println(colorHex);
        Assert.assertEquals(colorHex,"#28a745");
    }

    @Given("firstname bos birakilmamalidir")
    public void firstname_bos_birakilmamalidir() {

    }

    @Then("firsatname bos birakilamadigini dogrulayin")
    public void firsatname_bos_birakilamadigini_dogrulayin() {

    }

    @Then("Kullanici acilan sayfada lastname bilgisini girer.")
    public void kullanici_acilan_sayfada_lastname_bilgisini_girer() {

    }

    @Then("lastname kabul edildigini dogrulayiniz")
    public void lastname_kabul_edildigini_dogrulayiniz() {

    }

    @Then("lastname bos birakilmamalidir")
    public void lastname_bos_birakilmamalidir() {

    }

    @Then("lastname bos birakilamadigini dogrulayin")
    public void lastname_bos_birakilamadigini_dogrulayin() {

    }

    @Given("Kullanici email bilgisini .'@, seklinde girmek zorundadir.")
    public void kullanici_email_bilgisini_seklinde_girmek_zorundadir() {

    }

    @Then("email dogru girldigini dogrulayin")
    public void email_dogru_girldigini_dogrulayin() {

    }

    @Then("Kullanici email bilgisini at olmadan girer")
    public void kullanici_email_bilgisini_at_olmadan_girer() {
    ;
    }

    @Then("kabul edilmedigini dogrular")
    public void kabul_edilmedigini_dogrular() {

    }

    @Then("Kullanici email bilgisini nokta olmadan girer")
    public void kullanici_email_bilgisini_nokta_olmadan_girer() {

    }


    @And("submid butonuna tiklayiniz")
    public void submidButonunaTiklayiniz() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us10_formsPage.submit.click();
    }
}
