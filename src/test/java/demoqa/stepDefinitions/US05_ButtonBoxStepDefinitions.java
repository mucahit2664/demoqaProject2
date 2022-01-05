package demoqa.stepDefinitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import demoqa.pages.US05_ButtonBoxPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;

public class US05_ButtonBoxStepDefinitions {

    US05_ButtonBoxPage uS05_ButtonBoxPage = new US05_ButtonBoxPage();
SoftAssert softAssert=new SoftAssert();
    Actions actions = new Actions(Driver.getDriver());



    @And("Buttons butonuna basiniz")
    public void buttonsButonunaBasiniz() {
        ReusableMethods.waitFor(1);
        uS05_ButtonBoxPage.button.click();


    }

    @And("double click me butonuna basiniz")
    public void doubleClickMeButonunaBasiniz() {

        ReusableMethods.waitFor(1);
        // actions.doubleClick(uS05_ButtonBoxPage.doubleClickMe);

        actions.doubleClick(uS05_ButtonBoxPage.doubleClickMe).perform();

        System.out.println(uS05_ButtonBoxPage.doubleClickMessage.getText());
    }

    @And("basildigini dogrulayiniz")
    public void basildiginiDogrulayiniz() {
String expectedResult="You have done a double click";
softAssert.assertTrue(uS05_ButtonBoxPage.doubleClickMessage.getText().equals("You have done a double click"),"bu yazi cikmadi");

    //    Assert.assertTrue(uS05_ButtonBoxPage.doubleClickMessage.getText().equals("You have done a double click"));

    }


    @And("right click me butonuna basiniz")
    public void rightClickMeButonunaBasiniz() {
        ReusableMethods.waitFor(2);
        actions.contextClick(uS05_ButtonBoxPage.rightClickMe).perform();
        System.out.println(uS05_ButtonBoxPage.rightClickMessage.getText());
    }

    @And("right basildigini dogrulayiniz")
    public void rightBasildiginiDogrulayiniz() {
        Assert.assertTrue(uS05_ButtonBoxPage.rightClickMessage.getText().equals("You have done a right click"));

    }

    @And("click me butonuna basiniz")
    public void clickMeButonunaBasiniz() {
        actions.doubleClick(uS05_ButtonBoxPage.ClickMe).perform();
        System.out.println(uS05_ButtonBoxPage.dynamicClickMessage.getText());
    }

    @And("clickme butonuna basildigini dogrulayiniz")
    public void clickmeButonunaBasildiginiDogrulayiniz() {
        ReusableMethods.waitFor(1);

        Assert.assertTrue(uS05_ButtonBoxPage.dynamicClickMessage.getText().equals("You have done a dynamic click"));
    }

    @And("Buttons yazisinin gorunurlugunu basildigini Dogrulayiniz")
    public void buttonsYazisininGorunurlugunuBasildiginiDogrulayiniz() {
        System.out.println(uS05_ButtonBoxPage.yaziButton.getText());
        Assert.assertFalse(uS05_ButtonBoxPage.yaziButton.getText().equals("BUTTONS"));
    softAssert.assertAll();
    }



}
