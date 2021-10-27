package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US06_LinksPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;

public class US06_LinksStepDefinitions {
   US06_LinksPage linksPage = new US06_LinksPage();
    Actions actions = new Actions(Driver.getDriver());


    @And("Links butonuna basiniz")
    public void linksButonunaBasiniz() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        linksPage.lineMenuLink.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);

    }

    @And("Home butonuna tiklayin")
    public void homeButonunaTiklayin() {
linksPage.linkHome.click();
    }

    @Then("Yeni bir sekme de anasayfa acildigini dogrulayiniz")
    public void yeniBirSekmeDeAnasayfaAcildiginiDogrulayiniz() {
        ArrayList tabs = new ArrayList (Driver.getDriver().getWindowHandles());


        System.out.println(Driver.getDriver().getCurrentUrl());

        Driver.getDriver().switchTo().window((String) tabs.get(1));
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertEquals("https://demoqa.com/", Driver.getDriver().getCurrentUrl());
        Driver.getDriver().switchTo().window((String) tabs.get(1)).close();
        Driver.getDriver().switchTo().window((String) tabs.get(0));
    }
    @And("HomeEur butonuna tiklayin")
    public void homeeurbutonunatiklayin() {
        linksPage.linkHomeDynamic.click();

    }




    @And("Created butonuna tiklayin")
    public void createdbutonunatiklayin() {

      linksPage.created.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("No Content butonuna tiklayin")
    public void noContentbutonunatiklayin() {
        linksPage.nocontent.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Moved butonuna tiklayin")
    public void movedbutonunatiklayin() {
linksPage.moved.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Bad Request butonuna tiklayin")
    public void badRequestbutonunatiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        linksPage.badrequest.click();
    }

    @And("Unauthorized butonuna tiklayin")
    public void unauthorizedbButonunatiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        linksPage.unauthorized.click();
    }

    @And("Forbidden butonuna tiklayin")
    public void forbiddenbutonunatiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        linksPage.forbidden.click();
    }

    @And("Not Found butonuna tiklayin")
    public void notfoundbutonunatiklayin() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        linksPage.notFound.click();
    }


    @Then("yazinin {string} ve {string} icerdigini dogrulayiniz")
    public void yazininicerdiginidogrulayiniz(String arg0, String arg1) {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        System.out.println(linksPage.yazi.getText());
        Assert.assertTrue(linksPage.yazi.getText().contains(arg0));
        Assert.assertTrue(linksPage.yazi.getText().contains(arg1));
        ReusableMethods.waitFor(1);


    }


    @Then("{string} yazisinin gorunurlugunu  Dogrulayiniz")
    public void yazisiningorunurlugunudogrulayiniz(String arg0) {
        System.out.println(linksPage.linkTitle.getText());
        linksPage.linkTitle.getText().contains(arg0);
    }
}