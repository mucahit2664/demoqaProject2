package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DataPickerPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class US15_DataPicker_StepDefinitions {

    DataPickerPage datePicker = new DataPickerPage();
    Actions actions = new Actions(Driver.getDriver());
    String expectedYear, expectedDay, expectedMonth;

    @And("kullanici dataPicker sekmesini acar")
    public void kullaniciWidgetsSekmesiniAcar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        datePicker.dataPickerSekmesi.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(2);

    }

    @And("Kullanici takvimi tiklar")
    public void kullaniciTakvimiTiklar() {

        datePicker.tarihsecme1.click();
    }



    @And("Kullanici {string},{string},{string} girer")
    public void kullaniciGirer(String yil, String ay, String gun) {
ReusableMethods.waitFor(1);
        Select dropdownYil = new Select(datePicker.selectYil);
        dropdownYil.selectByVisibleText(yil);

        int ayindexi = Integer.parseInt(ay) - 1;
        Select dropdownAy = new Select(datePicker.selectAy);
        dropdownAy.selectByIndex(ayindexi);
        ReusableMethods.waitFor(1);

        for (int i = 1; i < 8; i++) {
            ReusableMethods.waitFor(1);

            //  WebElement takvimgunu = Driver.getDriver().findElement(By.xpath(" (//*[contains(@class,'react-datepicker__day react-datepicker__day')])[" + (i) + "]"));
            WebElement takvimgunu=datePicker.getGun(i);

            if (takvimgunu.getText().equals("1")) {
                int belligun = Integer.parseInt(gun);
                //  actions.click(Driver.getDriver().findElement(By.xpath(" (//*[contains(@class,'react-datepicker__day react-datepicker__day')])[" + (i + belligun - 1) + "]"))).perform();
                datePicker.getGun((i+belligun-1)).click();

                ReusableMethods.waitFor(1);
                break;
            } else {
                continue;
            }
        }
    }

    @And("Kullanici {string},{string},{string} girdiginin sonucunu dogrular")
    public void kullaniciGirdigininSonucunuDogrular(String yil, String ay, String gun) {
        String verilengun = ay + "/" + gun + "/" + yil;
        System.out.println("verilengun:  " + ay + "/" + gun + "/" + yil);

        System.out.println("gelen tarih: " + datePicker.tarihsonuc.getAttribute("value"));
        System.out.println("-----------------------------------------------------------");
        Assert.assertTrue(datePicker.tarihsonuc.getAttribute("value").equals(verilengun));
    }


    /*@And("Kullanici date and time girilecek selectboxa tiklar")
    public void kullaniciDateAndTimeGirilecekSelectboxaTiklar() {
        ReusableMethods.waitFor(1);
        datePicker.dateandTime.click();
    }*/

    @And("Kullanici tablodan yil secer {string}")
    public void kullaniciTablodanYilSecer(String arg0) {
        ReusableMethods.waitFor(1);
datePicker.yearIki.click();
        datePicker.getYear(arg0).click();



    }

    @And("Kullanici tablodan ay secer {string}")
    public void kullaniciTablodanAySecer(String arg0) {
        ReusableMethods.waitFor(1);
datePicker.month.click();
        datePicker.getMonth(arg0).click();
    }

    @And("Kullanici gun secer {int}")
    public void kullaniciGunSecer(int arg0) {
     ReusableMethods.waitFor(1);
    // datePicker.getGun(arg0).click();
     //System.out.println();
        for (int i = 1; i < 8; i++) {
            ReusableMethods.waitFor(1);

            //  WebElement takvimgunu = Driver.getDriver().findElement(By.xpath(" (//*[contains(@class,'react-datepicker__day react-datepicker__day')])[" + (i) + "]"));
            WebElement takvimgunu=datePicker.getGun(i);

            if (takvimgunu.getText().equals("1")) {
                int belligun = arg0;
                //  actions.click(Driver.getDriver().findElement(By.xpath(" (//*[contains(@class,'react-datepicker__day react-datepicker__day')])[" + (i + belligun - 1) + "]"))).perform();
                datePicker.getGun((i+belligun-1)).click();

                ReusableMethods.waitFor(1);
                break;
            } else {
                continue;
            }
        }

    }

    @And("Kullanici tablodan time secer {string}")
    public void kullaniciTablodanTimeSecer(String arg0) {

ReusableMethods.waitFor(5);

        JSUtils.scrollDownByJS();
        datePicker.time.contains(arg0);


    }


    @And("Kullanici date and time girilecek selectboxa tiklar")
    public void kullaniciDateAndTimeGirilecekSelectboxaTiklar() {
        datePicker.dateandTime.click();
        Assert.assertTrue(datePicker.dateandTime.isSelected());
    }
}
