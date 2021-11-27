package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.US11_BrowserWindowsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class US11_BrowserWindowsStepDefinitions {
    US11_BrowserWindowsPage us11_browserWindowsPage = new US11_BrowserWindowsPage();
    Actions actions = new Actions(Driver.getDriver());


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

    @Then("new window message butonu tiklayin")
    public void new_window_message_butonu_tiklayin() {
        ReusableMethods.waitFor(1);
        us11_browserWindowsPage.messageWindow.click();
    }

    @Then("new window message butonu tiklayinca yeni bir pencere acildigini dogrulayin")
    public void new_window_message_butonu_tiklayinca_yeni_bir_pencere_acildigini_dogrulayin() {
      /*  ReusableMethods.waitFor(3);
       // actions.click(us11_browserWindowsPage.browserWindows).perform();
        System.out.println(Driver.getDriver().getWindowHandle());
        ReusableMethods.waitFor(3);
      //  us11_browserWindowsPage.browserWindows.click();

        List<String> allWindowsHandles;
        allWindowsHandles = new ArrayList<>(Driver.getDriver().getWindowHandles());
        System.out.println(allWindowsHandles); // 2 tane windows handle aldigini gorduk.
        Driver.getDriver().switchTo().window(allWindowsHandles.get(1));
        System.out.println(Driver.getDriver().getWindowHandle()); //2. pencereye gecildigini gorduk.
        String actualMessageWindowText = us11_browserWindowsPage.messageWindowText.getText();
        System.out.println(actualMessageWindowText);
        String expectedText = "Knowledge increases";

        Assert.assertTrue(actualMessageWindowText.contains(expectedText));
        }*/




    }
}

