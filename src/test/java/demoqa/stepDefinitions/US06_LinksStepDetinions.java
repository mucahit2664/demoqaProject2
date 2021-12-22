package demoqa.stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import demoqa.pages.US06_LinksPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;

import java.util.ArrayList;

public class US06_LinksStepDetinions {
    US06_LinksPage us06_linksPage=new US06_LinksPage();
    Actions actions=new Actions(Driver.getDriver());



    @Then("Links butonuna basiniz")
    public void links_butonuna_basiniz() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        us06_linksPage.lineMenuLink.click();

        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);
    }

    @Then("Home butonuna tiklayin")
    public void home_butonuna_tiklayin() {
        ReusableMethods.waitFor(1);
us06_linksPage.linkHome.click();
    }

    @Then("Yeni bir sekme de anasayfa acildigini dogrulayiniz")
    public void yeni_bir_sekme_de_anasayfa_acildigini_dogrulayiniz() {
        ArrayList tabs = new ArrayList (Driver.getDriver().getWindowHandles());


        System.out.println(Driver.getDriver().getCurrentUrl());

        Driver.getDriver().switchTo().window((String) tabs.get(1));
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://demoqa.com/"));
        Driver.getDriver().switchTo().window((String) tabs.get(1)).close();
        Driver.getDriver().switchTo().window((String) tabs.get(0));



    }

    @Then("HomeEur butonuna tiklayin")
    public void home_eur_butonuna_tiklayin() {
us06_linksPage.linkHomeDynamic.click();
    }

    @Then("Created butonuna tiklayin")
    public void created_butonuna_tiklayin() {
us06_linksPage.created.click();
    }

    @Then("yazinin {string} ve {string} icerdigini dogrulayiniz")
    public void yazinin_ve_icerdigini_dogrulayiniz(String string, String string2) {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(us06_linksPage.yazi.getText().contains(string));
Assert.assertTrue(us06_linksPage.yazi.getText().contains(string2));



    }

    @Then("No Content butonuna tiklayin")
    public void no_content_butonuna_tiklayin() {
us06_linksPage.nocontent.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("Moved butonuna tiklayin")
    public void moved_butonuna_tiklayin() {
us06_linksPage.moved.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("Bad Request butonuna tiklayin")
    public void bad_request_butonuna_tiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us06_linksPage.badrequest.click();
    }

    @Then("Unauthorized butonuna tiklayin")
    public void unauthorized_butonuna_tiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
us06_linksPage.unauthorized.click();
    }

    @Then("Forbidden butonuna tiklayin")
    public void forbidden_butonuna_tiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
us06_linksPage.forbidden.click();
    }

    @Then("Not Found butonuna tiklayin")
    public void not_found_butonuna_tiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
us06_linksPage.notFound.click();
    }

    @Then("{string} yazisinin gorunurlugunu  Dogrulayiniz")
    public void yazisinin_gorunurlugunu_dogrulayiniz(String string) {
Assert.assertTrue(us06_linksPage.linkTitle.getText().contains(string));
    }
}
