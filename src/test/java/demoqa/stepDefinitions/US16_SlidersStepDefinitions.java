package demoqa.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import demoqa.pages.US16_SlidersPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;

public class US16_SlidersStepDefinitions {
US16_SlidersPage slidersPage=new US16_SlidersPage();
Actions actions=new Actions(Driver.getDriver());

    @Given("Kullanici silders butonunu tiklar")
    public void kullanici_silders_butonunu_tiklar() {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
slidersPage.sliderLink.click();
    }
    @Then("Kulanici sliderin saga kaydirabilecegini dogrular")
    public void kulanici_sliderin_saga_kaydirabilecegini_dogrular() {
        ReusableMethods.setSliderBall(slidersPage.sliderBall,0,50);

        Assert.assertTrue(slidersPage.sliderBall.getAttribute("value").equals("50"));
    }

    @Then("Kulanici sliderin sola kaydirabilecegini dogrular")
    public void kulanici_sliderin_sola_kaydirabilecegini_dogrular() {
        ReusableMethods.waitFor(1);

ReusableMethods.setSliderBall(slidersPage.sliderBall,50,40);

        Assert.assertTrue(slidersPage.sliderBall.getAttribute("value").equals("40"));

    }

    @Then("Kulanici sliderin en saga kaydirabilecegini dogrular")
    public void kulanici_sliderin_en_saga_kaydirabilecegini_dogrular() {
        ReusableMethods.waitFor(5);
        ReusableMethods.setSliderBall(slidersPage.sliderBall,70,100);
ReusableMethods.waitFor(5);
        Assert.assertTrue(slidersPage.sliderBall.getAttribute("value").equals("100"));

    }
    @Then("Kulanici sliderin  en sola kaydirabilecegini dogrular")
    public void kulanici_sliderin_en_sola_kaydirabilecegini_dogrular() {
        ReusableMethods.waitFor(5);
        ReusableMethods.setSliderBall(slidersPage.sliderBall,70,0);
        ReusableMethods.waitFor(5);
        Assert.assertTrue(slidersPage.sliderBall.getAttribute("value").equals("0"));
    }



    @Then("Kulanici sliderin once sola sonra saga kaydirabilecegini dogrular")
    public void kulanici_sliderin_once_sola_sonra_saga_kaydirabilecegini_dogrular() {
        ReusableMethods.setSliderBall(slidersPage.sliderBall,0,70);

        ReusableMethods.waitFor(5);
        ReusableMethods.setSliderBall(slidersPage.sliderBall,70,0);
        ReusableMethods.waitFor(5);
        Assert.assertTrue(slidersPage.sliderBall.getAttribute("value").equals("0"));

    }

    ///////TABS
    @And("Kullanici Tabs butonunu tiklar")
    public void kullaniciTabsButonunuTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        slidersPage.tabs.click();
    }
    @Then("Kullanici What Textbox in mavi renkte oldugunu ve click yapildiginda gri renk oldugunu dogrular")
    public void kullaniciTextboxInMaviRenkteOldugunuVeClickYapildigindaGriRenkOldugunuDogrular() {
        slidersPage.whatTab.click();
        String whatColor=ReusableMethods.getHexColor(slidersPage.whatTab,"color");
        System.out.println(whatColor);
        Assert.assertTrue(whatColor.equals("#495057"));
    }
    @Then("Kullanici Origin Textbox in mavi renkte oldugunu ve click yapildiginda gri renk oldugunu dogrular")
    public void kullaniciOriginTextboxInMaviRenkteOldugunuVeClickYapildigindaGriRenkOldugunuDogrular() {
        slidersPage.originTab.click();
        ReusableMethods.waitFor(1);
        String originColor=ReusableMethods.getHexColor(slidersPage.whatTab,"color");
        System.out.println(originColor);
        Assert.assertTrue(originColor.equals("#495057"));
    }
    @Then("Kullanici Use Textbox in mavi renkte oldugunu ve click yapildiginda gri renk oldugunu dogrular")
    public void kullaniciUseTextboxInMaviRenkteOldugunuVeClickYapildigindaGriRenkOldugunuDogrular() {
        slidersPage.useTab.click();
        ReusableMethods.waitFor(1);
        String useColor=ReusableMethods.getHexColor(slidersPage.whatTab,"color");
        System.out.println(useColor);
        Assert.assertTrue(useColor.equals("#495057"));
    }
    @Then("Kullanici  whatText icerdigini dogrular")
    public void kullaniciWhatTextIcerdiginiDogrular() {
        Assert.assertTrue(slidersPage.whatText.getText().contains("Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "));
    }
    @Then("Kullanici  originText  icerdigini dogrular")
    public void kullaniciOriginTextIcerdiginiDogrular() {
        Assert.assertTrue(slidersPage.originText.getText().contains("Contrary to popular belief, Lorem Ipsum is not simply random text. " +
                "It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Ri"));
    }
    @Then("Kullanici  useText  icerdigini dogrular")
    public void kullaniciUseTextIcerdiginiDogrular() {
        Assert.assertTrue(slidersPage.useText.getText().contains("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. " +
                "The point of using"));
    }
    @Then("Kullanici More tabina basilamadigini dogrular")
    public void kullaniciMoreTabinaBasilamadiginiDogrular() {
        ReusableMethods.waitFor(1);
        org.testng.Assert.assertFalse(slidersPage.tabsBaslik.get(4).isSelected());
    }






















































    //TOOLS-TIPS
    @And("Kullanici tooltips butonunu tiklar")
    public void kullaniciTooltipsButonunuTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        slidersPage.toolTips.click();

        actions.sendKeys(Keys.PAGE_UP).perform();
    }
    @And("Kullanici mouse buttonun ustune getirir butonun uzerinde geldiginde renginin degistigini ve yazinin ciktigini dogrular")
    public void kullaniciMouseButtonunUstuneGetirirButonunUzerindeGeldigindeRengininDegistiginiVeYazininCiktiginiDogrular() {
        ReusableMethods.waitFor(1);
        String beforeColor=ReusableMethods.getHexColor(slidersPage.hoverMeToSeeButton,"background-color");
        System.out.println(beforeColor);

        ReusableMethods.hover(slidersPage.hoverMeToSeeButton);
        ReusableMethods.waitFor(1);
        String afterColor=ReusableMethods.getHexColor(slidersPage.hoverMeToSeeButton,"background-color");
        System.out.println(afterColor);
        Assert.assertFalse(beforeColor.equals(afterColor))
        ;


    }


    @And("Kullanici hover me too see uzerine tiklar butona tikladiginda border-color renginin degistigini dogrular")
    public void kullaniciHoverMeTooSeeUzerineTiklarButonaTikladigindaBorderColorRengininDegistiginiDogrular() {
        ReusableMethods.waitFor(1);
        String beforeBorderColor=ReusableMethods.getHexColor(slidersPage.hoverMeToSeeButton,"border-color");
        slidersPage.hoverMeToSeeButton.click();
        ReusableMethods.waitFor(1);
        String afterBorderColor=ReusableMethods.getHexColor(slidersPage.hoverMeToSeeButton,"border-color");
       // Assert.assertFalse(beforeBorderColor.equals(afterBorderColor));
    }

    @Then("Kullanici hover me too see uzerine geldiginde cikan texti dogrular")
    public void kullaniciHoverMeTooSeeUzerineGeldigindeCikanTextiDogrular() {
        System.out.println(slidersPage.gorunurText.getText());
        Assert.assertTrue(slidersPage.gorunurText.getText().equals("You hovered over the Button"));

    }
}
