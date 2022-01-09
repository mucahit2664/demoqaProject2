package demoqa.stepDefinitions;

import com.github.javafaker.Faker;
import demoqa.pages.BookStoreApplicationPage;
import demoqa.utilities.ConfigReader;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class BookStoreApplicationSignInSteps {

    BookStoreApplicationPage bookStore = new BookStoreApplicationPage();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());


    @Given("kullanici Book Store Application' a tiklar")
    public void kullanici_book_store_application_a_tiklar() {
        ReusableMethods.jsClick(bookStore.bookStoreApplication);
    }

    @And("Kullanici bookstoreLogin tiklar")
    public void kullaniciBookstoreLoginTiklar() {
        ReusableMethods.jsClick(bookStore.loginButton);


    }
    @When("kullanici New User butonuna tiklar")
    public void kullanici_new_user_butonuna_tiklar() {

        ReusableMethods.jsClick(bookStore.newUserButton);
    }

    @When("kullanici {string} {string} {string} {string} alanlarini doldurur")
    public void kullanici_alanlarini_doldurur(String firstName, String lastName, String userName, String password) {
        bookStore.firstName.sendKeys(faker.name().firstName());
        bookStore.lastName.sendKeys(faker.name().lastName());
        bookStore.userName.sendKeys(faker.name().username());
        bookStore.password.sendKeys(ConfigReader.getProperty("bookStorePassword"));
    }

    @When("kullanici ben bir robot degilim checkBox'ini tiklar")
    public void kullanici_ben_bir_robot_degilim_check_box_ini_tiklar() throws InterruptedException {
       ReusableMethods.waitFor(1);
        Driver.getDriver().switchTo().frame(bookStore.captchaIframe);
        Thread.sleep(5000);
        bookStore.notRobotCheckBox.click();
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("kullanici register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
ReusableMethods.waitFor(1);
        ReusableMethods.jsClick(bookStore.registerButton);
    }

    @Then("kullanici back to login butonuna tiklar")
    public void kullanici_back_to_login_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.jsClick(bookStore.backToLoginButton);
    }

    @Given("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        ReusableMethods.jsClick(bookStore.loginButton);
    }

    @When("kullanici valid UserName ve Password bilgilerini girer")
    public void kullanici_valid_user_name_ve_password_bilgilerini_girer() {
        bookStore.userName.sendKeys(ConfigReader.getProperty("bookStoreUserName"));
        bookStore.password.sendKeys(ConfigReader.getProperty("bookStorePassword"));
    }
    @When("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        ReusableMethods.waitFor(1);
        bookStore.loginButton.click();
    }


    @When("Kullanici search butonunda kitap {string} aratir")
    public void kullaniciSearchButonundaKitapAratir(String arg0) {
        ReusableMethods.waitFor(1);
        bookStore.searchBox.sendKeys(arg0);
    }

    @Then("Kullanici {string} kitabin bulundugunu dogrular")
    public void kullaniciKitabinBulundugunuDogrular(String arg0) {
        System.out.println(bookStore.allData.size());
        List<String> isimler=ReusableMethods.getElementsText(bookStore.allData);
        Assert.assertTrue(isimler.contains(arg0));

        }




    @When("Kullanici kitabin bilgilerine tiklar")
    public void kullaniciKitabinBilgilerineTiklar() {
        bookStore.bookNameSearchResult.click();

    }

    @When("Kullanici bilgilere tikladiktan sonra addtoyourcollectiona tiklar")
    public void kullaniciBilgilereTikladiktanSonraAddtoyourcollectionaTiklar() {
      actions.sendKeys(Keys.PAGE_DOWN).perform();
      ReusableMethods.waitFor(1);
      bookStore.addtoYourCollection.click();
      //actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(3);
      Driver.getDriver().switchTo().alert().accept();

    }


    @Then("Kullanici profile bilgilerinde {string} kitabin eklendigini dogrular")
    public void kullaniciProfileBilgilerindeKitabinEklendiginiDogrular(String arg0) {
        bookStore.Profile.click();
Assert.assertTrue(bookStore.getKitap(arg0).isDisplayed());
    }

    @When("Kullanici bookstore tablosundaki row sayisini {string} olarak secer")
    public void kullaniciBookstoreTablosundakiRowSayisiniOlarakSecer(String arg0) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select options=new Select(bookStore.rowSelectMenu);
        ReusableMethods.waitFor(1);
        options.selectByValue(arg0);

    }



    @Then("Kullanici bookstore sayfasindaki row sayisini dogrular {string}")
    public void kullaniciBookstoreSayfasindakiRowSayisiniDogrular(String arg0) {
        String rowCount=String.valueOf(bookStore.allRowsList.size());

        System.out.println(rowCount);
        Assert.assertEquals(rowCount,arg0);


    }


 /*   @When("Kullanici profile butonuna tiklar")
    public void kullaniciProfileButonunaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bookStore.Profile.click();

    }*/

    @Then("Kullanici kitap adiyla {string} yazar adini {string} eslestigini dogrular")
    public void kullaniciKitapAdiylaYazarAdiniEslestiginiDogrular(String arg0, String arg1) {
        SoftAssert softAssert=new SoftAssert();
        actions.sendKeys(Keys.PAGE_UP).perform();
softAssert.assertTrue(bookStore.ilkKitapIsmi.getText().equals(arg0));
softAssert.assertTrue(bookStore.ilkYazarIsmi.getText().equals(arg1));


softAssert.assertAll();
    }
}