package demoqa.stepDefinitions;

import demoqa.pages.US18_MenuPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class US18_MenuSelectMenuStepDefitinions {
US18_MenuPage menuPage=new US18_MenuPage();
Actions actions=new Actions(Driver.getDriver());
SoftAssert softAssert=new SoftAssert();


    @Given("Kullanici Menu sekmesini tiklar")
    public void kullanici_menu_sekmesini_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
menuPage.menuLink.click();
        ReusableMethods.waitFor(1);
actions.sendKeys(Keys.PAGE_UP).perform();
    }

    @Then("Kullanici SubItemlerin gorunmedigini dogrular")
    public void kullanici_sub_itemlerin_gorunmedigini_dogrular() {
softAssert.assertFalse(menuPage.Sub_Item1.isDisplayed());
softAssert.assertFalse(menuPage.Sub_Item2.isDisplayed());


softAssert.assertAll();
    }

    @Then("Kullanici mouse Mainıtem1 uzerine getirir")
    public void kullanici_mouse_mainıtem1_uzerine_getirir() {
ReusableMethods.hover(menuPage.menuItems.get(0));
ReusableMethods.waitFor(1);
    }

    @Then("Kullanici SubSubItemlerin gorunmedigini dogrular")
    public void kullanici_sub_sub_itemlerin_gorunmedigini_dogrular() {
        softAssert.assertFalse(menuPage.SubSubItem1.isDisplayed());
        softAssert.assertFalse(menuPage.SubSubItem2.isDisplayed());

    }

    @Then("Kullanici mouse Mainıtem3 uzerine getirir")
    public void kullanici_mouse_mainıtem3_uzerine_getirir() {
        ReusableMethods.hover(menuPage.menuItems.get(2));
        ReusableMethods.waitFor(1);

    }

    @Then("Kullanici mouse Mainıtem2 uzerine getirir")
    public void kullanici_mouse_mainıtem2_uzerine_getirir() {
        ReusableMethods.hover(menuPage.menuItems.get(1));
        ReusableMethods.waitFor(1);

    }

    @Then("Kullanici SubItemlerin gorundugunu dogrular")
    public void kullanici_sub_itemlerin_gorundugunu_dogrular() {
        softAssert.assertTrue(menuPage.Sub_Item1.isDisplayed());
        softAssert.assertTrue(menuPage.Sub_Item2.isDisplayed());

    }

    @Then("Kullanici mouse subItem1 uzerine getirir")
    public void kullanici_mouse_sub_item1_uzerine_getirir() {
        ReusableMethods.hover(menuPage.Sub_Item1);
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici mouse subItem2 uzerine getirir")
    public void kullanici_mouse_sub_item2_uzerine_getirir() {
        ReusableMethods.hover(menuPage.Sub_Item2);
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici mouse subublist uzerine getirir")
    public void kullanici_mouse_subublist_uzerine_getirir() {
        ReusableMethods.hover(menuPage.SubSubList);
        ReusableMethods.waitFor(1);

    }

    @Then("Kullanici SubSubItemlerin gorundugunu dogrular")
    public void kullanici_sub_sub_itemlerin_gorundugunu_dogrular() {
        softAssert.assertTrue(menuPage.SubSubItem1.isDisplayed());
        softAssert.assertTrue(menuPage.SubSubItem2.isDisplayed());

    }

    @Then("Kullanici uc tane main-item oldugunu dogrular")
    public void kullaniciUcTaneMainItemOldugunuDogrular() {



    }

    @Then("Kullanici iki tane sub-item ve birtane sub-sub list oldugunu dogrular")
    public void kullaniciIkiTaneSubItemVeBirtaneSubSubListOldugunuDogrular() {
    }

    @Then("Kullanici sekiz tane linkin oldugunu ve {string} dogrular")
    public void kullaniciSekizTaneLinkinOldugunuVeDogrular(String arg0) {
    }





}
