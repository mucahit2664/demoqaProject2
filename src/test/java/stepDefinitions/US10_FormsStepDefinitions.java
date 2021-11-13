package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.US10_FormsPage;
import utilities.Driver;
import utilities.ReusableMethods;

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





    @Then("Kullanici email bilgisini at olmadan girer")
    public void kullanici_email_bilgisini_at_olmadan_girer() {
    us10_formsPage.userEmail.sendKeys(faker.name().firstName() + faker.name().lastName()+".com");

    }

    @Then("kabul edilmedigini dogrular")
    public void kabul_edilmedigini_dogrular() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us10_formsPage.submit.click();
        String color1=us10_formsPage.userEmail.getCssValue("border-color");
        System.out.println(color1);

        String colorHex = Color.fromString(color1).asHex();
        System.out.println(colorHex);
        Assert.assertEquals(colorHex,"#dc3545");
    }

    @Then("Kullanici email bilgisini nokta olmadan girer")
    public void kullanici_email_bilgisini_nokta_olmadan_girer() {
us10_formsPage.userEmail.sendKeys(faker.name().firstName()+faker.name().lastName()+"@com");
    }




    @And("FirstName yaziniz  {string}")
    public void firstnameYaziniz(String arg0) {
        us10_formsPage.firstName.sendKeys(arg0);
    }

    @And("LastName yaziniz  {string}")
    public void lastnameYaziniz(String arg0) {
        us10_formsPage.lastName.sendKeys(arg0);
    }

    @And("Email giriniz {string}")
    public void emailGiriniz(String arg0) {
        us10_formsPage.userEmail.sendKeys(arg0);
    }

    @And("cinsiyet seciniz {string}")
    public void cinsiyetSeciniz(String arg0) {
        us10_formsPage.genderRadio1.click();
    }

    @And("valid telefon giriniz {string}")
    public void validTelefonGiriniz(String arg0) {
        us10_formsPage.userNumber.sendKeys(arg0);
    }

    @And("valid dogum tarihi giriniz {string}")
    public void validDogumTarihiGiriniz(String arg0) {
 us10_formsPage.dateOfBirthInput.click();
 Select selectAy=new Select(us10_formsPage.selectAy);

        selectAy.selectByValue("5");

        Select selectYil=new Select(us10_formsPage.selectYil);
        selectYil.selectByValue("2000");
       us10_formsPage.selectGun.click();

    }

    @And("subject Giriniz")
    public void subjectGiriniz() {
        us10_formsPage.subjectsContainer.sendKeys("m");
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
        us10_formsPage.subjectsContainer.sendKeys("s");
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
    }

    @And("Hobby seciniz {int}")
    public void hobbySeciniz(int arg0) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us10_formsPage.sportCheckbox1.click();
    }

    @And("Resim seciniz")
    public void resimSeciniz() {
        us10_formsPage.uploadPicture.sendKeys("C:/Users/BEST TECH/Pictures/java.png");
    }

    @And("Current Adres giriniz")
    public void currentAdresGiriniz() {
        us10_formsPage.currentAddress.sendKeys(faker.address().fullAddress());
    }

    @And("State seciniz")
    public void stateSeciniz() {
        us10_formsPage.state.sendKeys("NCR"+Keys.ENTER);
    }

    @And("City seciniz")
    public void citySeciniz() {
        us10_formsPage.city.sendKeys("Delhi"+Keys.ENTER);

    }

    @Then("Submiti Tiklayin")
    public void submitiTiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us10_formsPage.submit.click();
    }

    @Then("Onaylandigini dogrulayin")
    public void onaylandiginiDogrulayin() {
        Assert.assertTrue(us10_formsPage.sonucBaslik.getText().equals("Thanks for submitting the form"));

    }
}
