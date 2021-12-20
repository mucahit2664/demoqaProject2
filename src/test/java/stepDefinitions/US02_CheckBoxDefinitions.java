package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US02_CheckBoxPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US02_CheckBoxDefinitions {
    US02_CheckBoxPage checkBoxPage = new US02_CheckBoxPage();
    Actions actions = new Actions(Driver.getDriver());



    @Then("checkbox butonuna tiklayiniz")
    public void checkboxbutonunatiklayiniz() {
        checkBoxPage.checkBoxMenuLink.click();
    }

    @Then("sum butona basiniz")
    public void sumbutonabasiniz() {
        checkBoxPage.Checkboxarti.click();
    }

    @Then("menunun acik oldugunu dogrulayiniz")
    public void menununacikoldugunudogrulayiniz() {
     /*   for(int i =1; i<=17; i++ ) {
            String xpathInput= "(//input)[" + i + "]"; //  (//input)[17]
            System.out.println( "Xpath Kontrol: " + xpathInput);
            WebElement checkbox = Driver.getDriver().findElement(By.xpath(xpathInput));

            Assert.assertTrue(checkbox.isEnabled());*/
        List<WebElement> elems=Driver.getDriver().findElements(By.xpath("//li[@class='rct-node rct-node-leaf']"));
        List list=new ArrayList();
        list= ReusableMethods.getElementsText(elems);
        System.out.println(list);
    }

    @Then("eksi butonunu tiklayiniz")
    public void eksibutonunutiklayiniz() {
        checkBoxPage.Checkboxeksi.click();
    }
    @Then("menunun kapali oldugunu dogrulayiniz")
    public void menunun_kapali_oldugunu_dogrulayiniz() {
        Assert.assertTrue(checkBoxPage.eksiDogrulama.isDisplayed());
        System.out.println("MENU KAPALI");
    }




    @And("excel file seciniz")
    public void excelfileseciniz() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        checkBoxPage.excelFile.click();
    }

    @Then("Excelin secili oldugunu dogrulayiniz")
    public void excelinSeciliOldugunuDogrulayiniz() {

        Assert.assertTrue(checkBoxPage.succeskontrol.getText().contains("excelFile"));
        System.out.println(checkBoxPage.succeskontrol.getText());
    }
}
