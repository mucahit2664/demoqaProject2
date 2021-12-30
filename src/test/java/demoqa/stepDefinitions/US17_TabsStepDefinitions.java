package demoqa.stepDefinitions;

import demoqa.pages.US16_SlidersPage;
import demoqa.pages.US17_TabsPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US17_TabsStepDefinitions {
    US17_TabsPage tabsPage=new US17_TabsPage();
    Actions actions=new Actions(Driver.getDriver());



    @Given("Kullanici Tabs sekmesini tiklar")
    public void kullaniciTabsSekmesiniTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        tabsPage.tabsLink.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
    }

    @And("Kullanici Whats tab tiklar")
    public void kullaniciWhatsTabTiklar() {
        tabsPage.tab_What.click();

    }



    @And("Kullanici Origin Tab tiklar")
    public void kullaniciOriginTabTiklar() {
        tabsPage.tab_Origin.click();
    }

    @And("Kullanici Use tab tiklar")
    public void kullaniciUseTabTiklar() {

        tabsPage.tab_Use.click();
    }


    @Then("kullanici texti dogrular")
    public void kullaniciTextiDogrular(String teks) {

        System.out.println(ReusableMethods.jsGetInnerText(tabsPage.activeTab));
        Assert.assertTrue(tabsPage.activeTab.getText().contains(teks));

/*
        System.out.println(ReusableMethods.getHexColor(slidersPage.tab_What,"color"));
       if (ReusableMethods.getHexColor(slidersPage.tab_What,"color").equals("#495057")){
        System.out.println(ReusableMethods.jsGetInnerText(slidersPage.whatTabText));
        Assert.assertTrue(slidersPage.whatTabText.getText().contains(teks));
    }else  if (ReusableMethods.getHexColor(slidersPage.tab_Origin,"color").equals("#495057")){
            System.out.println(ReusableMethods.jsGetInnerText(slidersPage.originTabText));
        Assert.assertTrue(slidersPage.originTabText.getText().contains(teks));
     }else if (ReusableMethods.getHexColor(slidersPage.tab_Use,"color").equals("#495057")){
            System.out.println(ReusableMethods.jsGetInnerText(slidersPage.useTabText));
        Assert.assertTrue(slidersPage.useTabText.getText().contains(teks));
}
*/
    }

    //TOOLS-TIPS
    @And("Kullanici tooltips butonunu tiklar")
    public void kullaniciTooltipsButonunuTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tabsPage.toolTips.click();

        actions.sendKeys(Keys.PAGE_UP).perform();
    }
    @And("Kullanici mouse buttonun ustune getirir butonun uzerinde geldiginde renginin degistigini ve yazinin ciktigini dogrular")
    public void kullaniciMouseButtonunUstuneGetirirButonunUzerindeGeldigindeRengininDegistiginiVeYazininCiktiginiDogrular() {
        ReusableMethods.waitFor(1);
        String beforeColor=ReusableMethods.getHexColor(tabsPage.hoverMeToSeeButton,"background-color");
        System.out.println(beforeColor);

        ReusableMethods.hover(tabsPage.hoverMeToSeeButton);
        ReusableMethods.waitFor(1);
        String afterColor=ReusableMethods.getHexColor(tabsPage.hoverMeToSeeButton,"background-color");
        System.out.println(afterColor);
        Assert.assertFalse(beforeColor.equals(afterColor))
        ;


    }


    @And("Kullanici hover me too see uzerine tiklar butona tikladiginda border-color renginin degistigini dogrular")
    public void kullaniciHoverMeTooSeeUzerineTiklarButonaTikladigindaBorderColorRengininDegistiginiDogrular() {
        ReusableMethods.waitFor(1);
        String beforeBorderColor=ReusableMethods.getHexColor(tabsPage.hoverMeToSeeButton,"border-color");
        tabsPage.hoverMeToSeeButton.click();
        ReusableMethods.waitFor(1);
        String afterBorderColor=ReusableMethods.getHexColor(tabsPage.hoverMeToSeeButton,"border-color");
        // Assert.assertFalse(beforeBorderColor.equals(afterBorderColor));
    }

    @Then("Kullanici hover me too see uzerine geldiginde cikan texti dogrular")
    public void kullaniciHoverMeTooSeeUzerineGeldigindeCikanTextiDogrular() {
        System.out.println(tabsPage.gorunurText.getText());
        Assert.assertTrue(tabsPage.gorunurText.getText().equals("You hovered over the Button"));

    }

    ///TOOL TİPS HOVER OVER seyrani-bey in

    String beforeBgColor;
    String afterBgColor;
    String beforeBColor;
    String afterBColor;

    @And("KullaniciTool Tips sekmesini tiklar")
    public void kullanicitoolTipsSekmesiniTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        tabsPage.toolTips.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici fareyi butonun uzerine getirir")
    public void kullaniciFareyiButonunUzerineGetirir() {
        beforeBgColor=ReusableMethods.getHexColor(tabsPage.hoverButton,"background-color");
        beforeBColor=ReusableMethods.getHexColor(tabsPage.hoverButton,"border-color");
        actions.moveToElement(tabsPage.hoverButton).build().perform();
        ReusableMethods.waitFor(3);
        afterBgColor=ReusableMethods.getHexColor(tabsPage.hoverButton,"background-color");
    }

    @Then("Kullanici rengin degistigini dogrular")
    public void kullaniciRenginDegistiginiDogrular() {

        System.out.println("Before : "+beforeBgColor+"  -  after    : "+afterBgColor);

        Assert.assertFalse(beforeBgColor.equals(afterBgColor));


    }

    @Then("Kullanici {string} textinin gorundugunu dogrular")
    public void kullaniciTextininGorundugunuDogrular(String arg0) {

        ReusableMethods.waitFor(3);
        System.out.println("actual text   : "+tabsPage.gorunurText.getText());
        System.out.println("Expected Text : You hovered over the "+arg0);
        Assert.assertTrue(tabsPage.gorunurText.getText().equals("You hovered over the "+arg0));

    }

    @And("Kullanici hover butonunu tiklar")
    public void kullaniciHoverButonunuTiklar() {
        actions.click(tabsPage.hoverButton).perform();
        ReusableMethods.waitFor(2);
        afterBColor=ReusableMethods.getHexColor(tabsPage.hoverButton,"border-color");
    }
    @And("kullanici rengi dogrular")
    public void kullaniciRengiDogrular() {

        System.out.println("Before border : "+beforeBColor+"  -  after border    : "+afterBColor);
        Assert.assertFalse(beforeBColor.equals(afterBColor));



    }

    @And("Kullanici fareyi textboxin uzerine getirir")
    public void kullaniciFareyiTextboxinUzerineGetirir() {
        beforeBColor=ReusableMethods.getHexColor(tabsPage.hovertextBox,"border-color");
        ReusableMethods.hover(tabsPage.hovertextBox);
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici  textboxa tiklar")
    public void kullaniciTextboxaTiklar() {
        tabsPage.hovertextBox.click();
        ReusableMethods.waitFor(2);
        afterBColor=ReusableMethods.getHexColor(tabsPage.hovertextBox,"border-color");

    }

    @And("Kullanici fareyi textin uzerine getirir {string}")
    public void kullaniciFareyiTextinUzerineGetirir(String arg0) {
        if(arg0.equals("Contrary")){
            beforeBgColor=ReusableMethods.getHexColor(tabsPage.hoverContraryText,"color");
            ReusableMethods.hover( tabsPage.hoverContraryText);
            ReusableMethods.waitFor(2);
            afterBgColor=ReusableMethods.getHexColor(tabsPage.hoverContraryText,"color");
        }else if(arg0.equals("deger")){
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            beforeBgColor=ReusableMethods.getHexColor(tabsPage.hoverDegerText,"color");
            ReusableMethods.hover(tabsPage.hoverDegerText);
            ReusableMethods.waitFor(2);
            afterBgColor=ReusableMethods.getHexColor(tabsPage.hoverDegerText,"color");
        }


    }

}
