package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.US09_DynamicPropertiesPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US09_DynamicPropertiesStepDefitions {
US09_DynamicPropertiesPage us09_dynamicPropertiesPage=new US09_DynamicPropertiesPage();
Actions actions=new Actions(Driver.getDriver());



    @Then("DynamicProperties butonuna tiklayiniz")
    public void dynamic_properties_butonuna_tiklayiniz() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
us09_dynamicPropertiesPage.dynamicProperties.click();
    }

    @Then("Wil enable {int} seconds isimli buton sayfa acildiginda Disabled oldugunu  dogrulayin")
    public void wil_enable_seconds_isimli_buton_sayfa_acildiginda_disabled_oldugunu_dogrulayin(Integer int1) {
        Assert.assertFalse(us09_dynamicPropertiesPage.enableButton.isEnabled());

    }

    @Then("ve {int} sn sonra Enabled oldugunu dogrulayin")
    public void ve_sn_sonra_enabled_oldugunu_dogrulayin(Integer int5) {
        ReusableMethods.waitForClickablility(us09_dynamicPropertiesPage.enableButton,5);
        Assert.assertTrue(us09_dynamicPropertiesPage.enableButton.isEnabled());
    }

    @Then("This text has random Id isimli Text Box sayfa her yenilendiginde farkli bir ID value'sune sahip oldugunu dogrulayin")
    public void this_text_has_random_id_isimli_text_box_sayfa_her_yenilendiginde_farkli_bir_id_value_sune_sahip_oldugunu_dogrulayin() {

        List<String>randomList=new ArrayList<>();
        int i= 0;
        for (int j = 1; j < 4; j++) {
            String idValue=us09_dynamicPropertiesPage.randomText.getAttribute("id");
            System.out.println(idValue);
            if (!randomList.contains(idValue)){
                randomList.add(idValue);
                i++;
            }
            Driver.getDriver().navigate().refresh();
        }
        Assert.assertEquals(randomList.size(),i);



    }

    @Then("Color Change isimli butonun yazi renginin sayfa yuklendiginde {string} ve {int} sn sonra {string} oldugunu dogrulayin")
    public void color_change_isimli_butonun_yazi_renginin_sayfa_yuklendiginde_ve_sn_sonra_oldugunu_dogrulayin(String string, Integer int1, String string2) {

String color1=us09_dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        System.out.println(color1);

        String colorHex = Color.fromString(color1).asHex();
        System.out.println(colorHex);
        Assert.assertEquals(colorHex, "#ffffff");
        ReusableMethods.waitFor(5);
        String color2 = us09_dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        //ReusableMethods.waitFor(1);
        System.out.println(color2);
        String colorHex2 = Color.fromString(color2).asHex();
        System.out.println(colorHex2);
        Assert.assertEquals(colorHex2, "#dc3545");
    }

    @Then("Visible After {int} Seconds isimli butonun sayfa yuklendiginde goruntulenemez oldugunu ve {int} sn sonra goruntulenebilir oldugunu dogrulayin")
    public void visible_after_seconds_isimli_butonun_sayfa_yuklendiginde_goruntulenemez_oldugunu_ve_sn_sonra_goruntulenebilir_oldugunu_dogrulayin(Integer int1, Integer int2) {

        boolean isNotDisplayed = false;
        try {
            us09_dynamicPropertiesPage.visibleButton.isDisplayed();
        } catch (NoSuchElementException e) {
            // System.out.println("Goruntulenemiyor. Boyle bir eleman yok");
            isNotDisplayed = true;
        }
        System.out.println(isNotDisplayed);
        Assert.assertFalse(isNotDisplayed);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(us09_dynamicPropertiesPage.visibleButton));
        Assert.assertTrue(us09_dynamicPropertiesPage.visibleButton.isDisplayed());





    }

    }


