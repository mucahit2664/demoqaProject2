package demoqa.stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import demoqa.pages.US02_CheckBoxPage;
import demoqa.utilities.Driver;

public class US02_CheckBoxStepDefinitions {
    US02_CheckBoxPage US02CheckBoxPage = new US02_CheckBoxPage();
    Actions actions = new Actions(Driver.getDriver());


    @Then("checktbox butonuna tiklayiniz")
    public void checktbox_butonuna_tiklayiniz() {
        US02CheckBoxPage.checkBoxMenuLink.click();
    }

    @Then("+ butonuna basınız")
    public void butonuna_basınız() {
        US02CheckBoxPage.Checkboxarti.click();
    }

    @Then("butun mnenunun acildigini dogrulayin")
    public void butun_mnenunun_acildigini_dogrulayin() {
        for (int i = 1; i <= 17; i++) {
            String xpathInput = "(//input)[" + i + "]"; //  (//input)[17]
            System.out.println("Xpath Kontrol: " + xpathInput);
            WebElement checkbox = Driver.getDriver().findElement(By.xpath(xpathInput));
            Assert.assertTrue(checkbox.isEnabled());
        }
    }


    @Then("eksibutonuna basiniz")
    public void eksibutonuna_basiniz() {
        US02CheckBoxPage.Checkboxeksi.click();

    }
    @Then("menunun kapalı oldugunu dogrulayiniz")
    public void menunun_kapalı_oldugunu_dogrulayiniz() {

       Assert.assertTrue(US02CheckBoxPage.CheckboxEksiDogrulama.isDisplayed());
        System.out.println("menu kapali");
    }



    @Then("excelfile butonu basin")
    public void excelfileButonuBasin() {

actions.sendKeys(Keys.PAGE_DOWN).perform();
        US02CheckBoxPage.excelFile.click();
    }

    @Then("excelfile butonu secili oldugunu dogrulayin")
    public void excelfileButonuSeciliOldugunuDogrulayin() {
        Assert.assertTrue(US02CheckBoxPage.succeskontrol.getText().contains("excelFile"));

        System.out.println(US02CheckBoxPage.succeskontrol.getText());
    }
}