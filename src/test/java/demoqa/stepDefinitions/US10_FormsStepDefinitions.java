package demoqa.stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import demoqa.pages.US10_FormsPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class US10_FormsStepDefinitions {

    US10_FormsPage us10_formsPage = new US10_FormsPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());


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

        String colorFirst = us10_formsPage.firstName.getCssValue("border-color");


        String colorHex = Color.fromString(colorFirst).asHex();
        System.out.println(colorHex);
        Assert.assertEquals(colorHex, "#28a745");
    }


    @Then("Kullanici email bilgisini at olmadan girer")
    public void kullanici_email_bilgisini_at_olmadan_girer() {
        us10_formsPage.userEmail.sendKeys(faker.name().firstName() + faker.name().lastName() + ".com");

    }

    @Then("kabul edilmedigini dogrular")
    public void kabul_edilmedigini_dogrular() {

        String colorNokta = us10_formsPage.userEmail.getCssValue("border-color");


        String colorHex = Color.fromString(colorNokta).asHex();
        System.out.println(colorHex);
        Assert.assertEquals(colorHex, "#dc3545");
    }

    @Then("Kullanici email bilgisini nokta olmadan girer")
    public void kullanici_email_bilgisini_nokta_olmadan_girer() {
        us10_formsPage.userEmail.sendKeys(faker.name().firstName() + faker.name().lastName() + "@com");
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
        Select selectAy = new Select(us10_formsPage.selectAy);

        selectAy.selectByValue("5");

        Select selectYil = new Select(us10_formsPage.selectYil);
        selectYil.selectByValue("2000");
        us10_formsPage.selectGun.click();

    }

    @And("subject Giriniz")
    public void subjectGiriniz() {
        ReusableMethods.waitFor(1);
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
        us10_formsPage.state.sendKeys("NCR" + Keys.ENTER);
    }

    @And("City seciniz")
    public void citySeciniz() {
        us10_formsPage.city.sendKeys("Delhi" + Keys.ENTER);

    }

    @Then("Submiti Tiklayin")
    public void submitiTiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        us10_formsPage.submit.click();

    }

    @Then("Onaylandigini dogrulayin")
    public void onaylandiginiDogrulayin() {
        Assert.assertTrue(us10_formsPage.sonucBaslik.getText().equals("Thanks for submitting the form"));

    }

    @Then("First Name bos Birakilamayacagini dogrulayin")
    public void firstNameBosBirakilamayacaginiDogrulayin() {


        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);
        String colorFirstName = us10_formsPage.firstName.getCssValue("border-color");


        String colorHex = Color.fromString(colorFirstName).asHex();
        System.out.println(colorHex);
        Assert.assertEquals(colorHex, "#dc3545");
    }

    @Then("LastName bos Birakilamayacagini dogrulayin")
    public void lastnameBosBirakilamayacaginiDogrulayin() {

        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);
        String colorLastNam = us10_formsPage.lastName.getCssValue("border-color");


        String colorHex = Color.fromString(colorLastNam).asHex();
        System.out.println(colorHex);
        Assert.assertEquals(colorHex, "#dc3545");

    }

    @Then("cinsiyette birden fazla secim yapilamadigini dogrulayin")
    public void cinsiyetteBirdenFazlaSecimYapilamadiginiDogrulayin() {
        if (us10_formsPage.genderRadio1.isSelected()) {
            Assert.assertFalse(us10_formsPage.genderRadio2.isSelected());
            Assert.assertFalse(us10_formsPage.genderRadio3.isSelected());
        } else if (us10_formsPage.genderRadio2.isSelected()) {
            Assert.assertFalse(us10_formsPage.genderRadio1.isSelected());
            Assert.assertFalse(us10_formsPage.genderRadio3.isSelected());
        } else if (us10_formsPage.genderRadio3.isSelected()) {
            Assert.assertFalse(us10_formsPage.genderRadio2.isSelected());
            Assert.assertFalse(us10_formsPage.genderRadio1.isSelected());
        }

    }

    @Then("email at olmadan kabul edilmedigini dogrulayin")
    public void emailAtOlmadanKabulEdilmediginiDogrulayin() {

        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);
        String colormailAt = us10_formsPage.userEmail.getCssValue("border-color");


        String colorHexmailAT = Color.fromString(colormailAt).asHex();
        System.out.println(colorHexmailAT);
        Assert.assertEquals(colorHexmailAT, "#dc3545");
    }

    @And("emaili temizleyin")
    public void emailiTemizleyin() {
        us10_formsPage.userEmail.clear();
    }

    @Then("email nokta olmadan kabul edilmedigini dogrulayin")
    public void emailNoktaOlmadanKabulEdilmediginiDogrulayin() {

        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);
        String colorMail = us10_formsPage.userEmail.getCssValue("border-color");


        String colorHexMail = Color.fromString(colorMail).asHex();
        System.out.println(colorHexMail);
        Assert.assertEquals(colorHexMail, "#dc3545");
    }

    @Then("Tel on hane  olmadan kabul edilmedigini dogrulayin")
    public void telOnHaneOlmadanKabulEdilmediginiDogrulayin() {
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);
        String colorNumber = us10_formsPage.userNumber.getCssValue("border-color");


        String colorHexNumber = Color.fromString(colorNumber).asHex();
        System.out.println(colorHexNumber);
        Assert.assertEquals(colorHexNumber, "#dc3545");
    }

    @And("tel bolumunu temizleyin")
    public void telBolumunuTemizleyin() {

        us10_formsPage.userNumber.clear();
    }

    @And("gelecek Yili dogum tarihi giriniz")
    public void gelecekYiliDogumTarihiGiriniz() {
        us10_formsPage.dateOfBirthInput.click();
        Select selectAy = new Select(us10_formsPage.selectAy);

        selectAy.selectByValue("6");

        Select selectYil = new Select(us10_formsPage.selectYil);
        selectYil.selectByValue("2030");
        us10_formsPage.selectGun.click();

    }

    @Then("tarih gunumuzden ileride secilemedigini dogrulayin")
    public void tarihGunumuzdenIlerideSecilemediginiDogrulayin() {
        String tarih = us10_formsPage.birtDaySonuc.getText();
        System.out.println(tarih);
        String tarihYil = tarih.substring(tarih.length() - 4);
        int tarihYil1 = Integer.parseInt(tarihYil);
        Date date = new Date();
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy");
        String today = dateFormat2.format(date);
        int todayYil = Integer.parseInt(today);
        System.out.println(todayYil);
        System.out.println(tarihYil1);
        Assert.assertTrue(tarihYil1 <= todayYil);
    }

    @And("birden fazla giris yapilabildigini dogrulayin")
    public void birdenFazlaGirisYapilabildiginiDogrulayin() {
        List<String> list = new ArrayList<String>();
        String str = us10_formsPage.subjectSonuc.getText();
        String[] arrStr = str.split(",");
        for (String el : arrStr)
            list.add(el);
        System.out.println(list);
        System.out.println(list.size());
        Assert.assertTrue(list.size() > 1);
    }


    @And("tum hobbyleri secin")
    public void tumHobbyleriSecin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us10_formsPage.readingCheckbox2.click();
        us10_formsPage.musicCheckbox.click();
        us10_formsPage.sportCheckbox1.click();

    }

    @Then("Hobbies bolumunde secme serbestiyeti")
    public void hobbiesBolumundeSecmeSerbestiyeti() {
        /*Assert.assertTrue(us10_formsPage.sportCheckbox1.isSelected());
        Assert.assertTrue(us10_formsPage.readingCheckbox2.isSelected());
        Assert.assertTrue(us10_formsPage.musicCheckbox.isSelected());*/

        Assert.assertTrue(us10_formsPage.hobbiesSonuc.getText().contains("Sports"));
        Assert.assertTrue(us10_formsPage.hobbiesSonuc.getText().contains("Reading"));
        Assert.assertTrue(us10_formsPage.hobbiesSonuc.getText().contains("Music"));
    }

    @Then("resmin secildigini dogrulayiniz")
    public void resminSecildiginiDogrulayiniz() {
        Assert.assertTrue(us10_formsPage.dosyaSecSonuc.getText().equals("java.png"));

    }

    @And("Current Adres sadece rakam giriniz")
    public void currentAdresSadeceRakamGiriniz() {
        us10_formsPage.currentAddress.sendKeys("1234567890");
    }

    @And("Current Adres sadece harf giriniz")
    public void currentAdresSadeceHarfGiriniz() {
        us10_formsPage.currentAddress.sendKeys("ali");
    }

    @And("Current Adrese ozel karakterler giriniz")
    public void currentAdreseOzelKarakterlerGiriniz() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us10_formsPage.currentAddress.sendKeys("!=@$%^&*()");
    }

    @And("state Tiklayiniz")
    public void stateTiklayiniz() {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        us10_formsPage.state.sendKeys("C");
    }

    @Then("state isimlerinin gorundugunu dogrulayiniz")
    public void stateIsimlerininGorundugunuDogrulayiniz() {

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
        System.out.println(us10_formsPage.stateTik.getText());
        Assert.assertTrue(us10_formsPage.stateTik.getText().equals("NCR"));

        ReusableMethods.waitFor(1);
        us10_formsPage.state.sendKeys("J");
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
        System.out.println(us10_formsPage.stateTik.getText());
        Assert.assertTrue(us10_formsPage.stateTik.getText().equals("Rajasthan"));
    }

    @And("city Tiklayiniz")
    public void cityTiklayiniz() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us10_formsPage.state.sendKeys("h");
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
        System.out.println(us10_formsPage.stateTik.getText());


        ReusableMethods.waitFor(1);
    }

    @Then("city isimlerinin gorundugunu dogrulayiniz")
    public void cityIsimlerininGorundugunuDogrulayiniz() {
        us10_formsPage.city.sendKeys("K");
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
        System.out.println(us10_formsPage.cityTik.getText());
        Assert.assertTrue(us10_formsPage.cityTik.getText().equals("Karnal"));
    }
}






