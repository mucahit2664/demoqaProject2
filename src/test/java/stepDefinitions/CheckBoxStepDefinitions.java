package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CheckBoxPage;
import pages.TextBoxPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxStepDefinitions {
    CheckBoxPage checkBoxPage = new CheckBoxPage();
    Actions actions = new Actions(Driver.getDriver());


    @Then("checktbox butonuna tiklayiniz")
    public void checktbox_butonuna_tiklayiniz() {
        checkBoxPage.checkBoxMenuLink.click();
    }

    @Then("+ butonuna basınız")
    public void butonuna_basınız() {
        checkBoxPage.Checkboxarti.click();
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
        checkBoxPage.Checkboxeksi.click();

    }
    @Then("menunun kapalı oldugunu dogrulayiniz")
    public void menunun_kapalı_oldugunu_dogrulayiniz() {

       Assert.assertTrue(checkBoxPage.CheckboxEksiDogrulama.isDisplayed());
        System.out.println("menu kapali");
    }



    @Then("excelfile butonu basin")
    public void excelfileButonuBasin() {

actions.sendKeys(Keys.PAGE_DOWN).perform();
        checkBoxPage.excelFile.click();
    }

    @Then("excelfile butonu secili oldugunu dogrulayin")
    public void excelfileButonuSeciliOldugunuDogrulayin() {
        Assert.assertTrue(checkBoxPage.succeskontrol.getText().contains("excelFile"));

        System.out.println(checkBoxPage.succeskontrol.getText());
    }
}