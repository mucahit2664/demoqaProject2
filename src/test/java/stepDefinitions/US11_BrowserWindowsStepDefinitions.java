package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US11_BrowserWindowsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Set;

public class US11_BrowserWindowsStepDefinitions {
US11_BrowserWindowsPage us11_browserWindowsPage=new US11_BrowserWindowsPage();
Actions actions=new Actions(Driver.getDriver());


    @Given("Kulanici Alerts, Frame & Windows accordionunu tiklar")
    public void kulanici_alerts_frame_windows_accordionunu_tiklar() {

        us11_browserWindowsPage.alertSection.click();

    }

    @Given("Kullanici acilan sekmede BrowserWindows  butonu tiklar")
    public void kullanici_acilan_sekmede_browser_windows_butonu_tiklar() {

actions.sendKeys(Keys.PAGE_DOWN).perform();
ReusableMethods.waitFor(1);
us11_browserWindowsPage.browserWindows.click();

    }
    @Then("Kullanici new Tab butonunun tiklanabilir oldugunu dogrular")
    public void kullanici_new_tab_butonunun_tiklanabilir_oldugunu_dogrular() {
        Assert.assertTrue(us11_browserWindowsPage.newTabButton.isEnabled());
    }

    @Then("Kullanici new Window Message butonunun tiklanabilir oldugunu dogrular")
    public void kullanici_new_window_message_butonunun_tiklanabilir_oldugunu_dogrular() {
        Assert.assertTrue(us11_browserWindowsPage.windowButton.isEnabled());
    }

    @Then("Kullanici new Window butonunun tiklanabilir oldugunu dogrular")
    public void kullanici_new_window_butonunun_tiklanabilir_oldugunu_dogrular() {
        Assert.assertTrue(us11_browserWindowsPage.messageWindow.isEnabled());

    }

    @Then("new tab butonuna tiklayin")
    public void new_tab_butonuna_tiklayin() {
        ReusableMethods.waitFor(1);
        us11_browserWindowsPage.newTabButton.click();

    }


    @Then("new tab butonunu tiklayinca yeni bir sayfa acilinca {string} yazisinin oldugunu dogrulayin")
    public void newTabButonunuTiklayincaYeniBirSayfaAcilincaYazisininOldugunuDogrulayin(String arg0) {
        String parentWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println(Driver.getDriver().getCurrentUrl());
        ReusableMethods.waitFor(2);
       //us11_browserWindowsPage.newTabButton.click();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String newTabHandle : windowHandles) {
            if (newTabHandle != parentWindowHandle) {
                Driver.getDriver().switchTo().window(newTabHandle);
            }
        }
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(us11_browserWindowsPage.thisISaSamplePage.isDisplayed());
    }

    @Then("new window butonu tiklayin")
    public void newWindowButonuTiklayin() {
        us11_browserWindowsPage.windowButton.click();
    }

    @Then("new window butonu tilayinca yeni bir pencere actigini dogrulayin")
    public void newWindowButonuTilayincaYeniBirPencereActiginiDogrulayin() {
        String parentWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println(Driver.getDriver().getCurrentUrl());
        ReusableMethods.waitFor(2);
        //us11_browserWindowsPage.newTabButton.click();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String newTabHandle : windowHandles) {
            if (newTabHandle != parentWindowHandle) {
                Driver.getDriver().switchTo().window(newTabHandle);
            }
        }
        System.out.println(Driver.getDriver().getCurrentUrl());

        Assert.assertTrue(us11_browserWindowsPage.thisISaSamplePage2.isDisplayed());
    }
    }

