package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.US13_FramePage;
import utilities.Driver;
import utilities.ReusableMethods;


public class US13_FrameStepDefinitions {

US13_FramePage us13_framePage=new US13_FramePage();
Actions actions=new Actions(Driver.getDriver());

    @Given("Kulanici acilan sekmede Frames basligini tiklar.")
    public void kulanici_acilan_sekmede_frames_basligini_tiklar() {
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
us13_framePage.frames.click();
    }

    @Then("frameler arasinda gecis oldugu dogrulanabilir")
    public void frameler_arasinda_gecis_oldugu_dogrulanabilir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("frame2")));

        String message1=us13_framePage.samplePage.getText();
        System.out.println("frame2:"+us13_framePage.samplePage.getText());
        Driver.getDriver().switchTo().defaultContent();
        actions.sendKeys(Keys.PAGE_UP).perform();

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("frame1")));
        ReusableMethods.waitFor(1);
        String message2=us13_framePage.samplePage.getText();
        System.out.println("frame1:"+us13_framePage.samplePage.getText());
        Assert.assertTrue(message1.equals(message2));
    }

}
