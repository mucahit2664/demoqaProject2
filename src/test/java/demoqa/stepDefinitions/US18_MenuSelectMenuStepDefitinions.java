package demoqa.stepDefinitions;

import demoqa.pages.US18_MenuPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class US18_MenuSelectMenuStepDefitinions {
    US18_MenuPage menuPage = new US18_MenuPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();


    @Given("Kullanici Menu sekmesini tiklar")
    public void kullanici_menu_sekmesini_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        menuPage.menuLink.click();

        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(2);
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

        softAssert.assertAll();
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

        softAssert.assertAll();
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

        softAssert.assertAll();
    }

    @Then("Kullanici uc tane main-item oldugunu dogrular")
    public void kullaniciUcTaneMainItemOldugunuDogrular() {

        softAssert.assertTrue(menuPage.menuItems.size() == 3);


        softAssert.assertAll();
    }

    @Then("Kullanici iki tane sub-item ve birtane sub-sub list oldugunu dogrular")
    public void kullaniciIkiTaneSubItemVeBirtaneSubSubListOldugunuDogrular() {


        List<String> subList = ReusableMethods.getElementsText(By.xpath("//ul[@id='nav']//li[2]/ul/li"));
        System.out.println(subList);
        softAssert.assertTrue(subList.size() == 3);

        softAssert.assertAll();
    }


    @Then("Kullanici sekiz tane linkin oldugunu ve isimlerini dogrular")
    public void kullaniciSekizTaneLinkinOldugunuVeIsimleriniDogrular(List<String> arg0) {

        System.out.println(arg0);

        List<String> subItemList = ReusableMethods.getElementsText(By.xpath("//ul[@id='nav']//li/a"));
        softAssert.assertTrue(subItemList.size() == 8);
        ////ul[@id='nav']//li/a

        for (int i = 0; i < arg0.size(); i++) {

            softAssert.assertTrue(subItemList.contains(arg0.get(i)));
            System.out.println(subItemList.get(i));

            softAssert.assertAll();
        }

    }


    //==============SELECT-MENU
    @And("Kullanici Select Menu sekmesini tiklar")
    public void kullaniciSelectMenuSekmesiniTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);

        menuPage.selectMenuButton.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
    }

    @And("Kullanici select Option dropdownunu tiklar ve toplam kac tane secenek oldugunu dogrular")
    public void kullaniciSelectOptionDropdownunuTiklarVeToplamKacTaneSecenekOldugunuDogrular(List<String> kontrolList) {
        menuPage.selectValueBox.click();
        System.out.println("Dropdown Secenekelri: " + menuPage.selectValueDropDownOptions.size());
        List<String> optionslar = ReusableMethods.getElementsText(By.xpath("//div[@tabindex='-1']"));
        for (int i = 0; i < optionslar.size(); i++) {
            ReusableMethods.waitFor(1);
            System.out.println("gelen: " + optionslar.get(i) + " listeden: " + kontrolList.get(i));
            softAssert.assertTrue(optionslar.get(i).equals(kontrolList.get(i)));

            actions.sendKeys(kontrolList.get(i)).sendKeys(Keys.ENTER).perform();
            softAssert.assertTrue(kontrolList.contains(menuPage.selectOptionText.getText()));
            actions.sendKeys(Keys.TAB).click(menuPage.selectValueBox).perform();
            softAssert.assertAll();
        }
    }


    @And("Kullanici select Title dropdownunu tiklar ve toplam kac tane secenek oldugunu dogrular")
    public void kullaniciSelectTitleDropdownunuTiklarVeToplamKacTaneSecenekOldugunuDogrular(List<String> selecetList) {
        menuPage.selectOneBox.click();
        System.out.println("Title Secenekelri: " + menuPage.selectOneDropDownOptions.size());
        List<String> optionslar = ReusableMethods.getElementsText(By.xpath("//div[@tabindex='-1']"));
        System.out.println(optionslar);
        for (int i = 0; i < optionslar.size(); i++) {
            ReusableMethods.waitFor(1);
            System.out.println("gelen: " + optionslar.get(i) + " listeden: " + selecetList.get(i));
            softAssert.assertTrue(optionslar.get(i).equals(selecetList.get(i)));

            actions.sendKeys(selecetList.get(i)).sendKeys(Keys.ENTER).perform();
            ReusableMethods.waitFor(1);
            softAssert.assertTrue(selecetList.contains(menuPage.selectOneText.getText()));
            actions.sendKeys(Keys.TAB).click(menuPage.selectOneBox).perform();
            softAssert.assertAll();
        }
    }

    @Then("Kullanici select Old dropdownunu tiklar ve renklerin degerlerini dogrular")
    public void kullaniciSelectOldDropdownunuTiklarVeRenklerinDegerleriniDogrular(List<String> oldList) {

        Select select = new Select(menuPage.oldSelectBox);


        List<WebElement> listOfColors = select.getOptions();
       /* for (WebElement w : listOfColors) {
            Assert.assertTrue(w.isEnabled());
            System.out.print(w.getText());
            System.out.println(listOfColors.get(1).getText());

        }*/
        for (int i = 0; i <listOfColors.size() ; i++) {
            System.out.println(listOfColors.get(i).getText());
            Assert.assertTrue(listOfColors.get(i).getText().equals(oldList.get(i)));
        }


    }
}