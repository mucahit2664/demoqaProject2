package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_15_Widgets_DataPickerPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class US_15_Widgets_DataPicker_StepDefinitions {

    US_15_Widgets_DataPickerPage dataPicker= new US_15_Widgets_DataPickerPage();
    Actions actions = new Actions(Driver.getDriver());

Faker fake=new Faker();


    @And("kullanici dataPicker sekmesini acar")
    public void kullaniciWidgetsSekmesiniAcar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        dataPicker.dataPickerSekmesi.click();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(2);

    }

    @And("Kullanici takvimi tiklar")
    public void kullaniciTakvimiTiklar() {

        dataPicker.tarihsecme1.click();
    }
/*
    @And("rastgele ogum tarihi giriniz {string}")
    public void rastgeleOgumTarihiGiriniz(String arg0) {




        Select dropdownAy = new Select(dataPicker.selectAy);

        String aylar[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int ay = fake.number().numberBetween(1, 12);
        dropdownAy.selectByIndex(ay);


        int yil = fake.number().numberBetween(1950, 2020);

        Select dropdownYil = new Select(dataPicker.selectYil);
        dropdownYil.selectByValue(String.valueOf(yil));
        // dropdown.selectByVisibleText("Programmer ");
        // int gun=fake.number().numberBetween(1,30);

        Driver.getDriver().findElement(By.xpath("(//*[contains(@class,'react-datepicker')])[" + fake.number().numberBetween(28, 76) + "]")).click();

    }*/

    @And("Kullanici Yil girer {string}")
    public void kullaniciYilGirer(String arg0) {
        Select dropdownYil = new Select(dataPicker.selectYil);
        dropdownYil.selectByValue(arg0);
    }

    @And("Kullanici Ayi girer {int}")
    public void kullaniciAyiGirer(int arg0) {
        Select dropdownAy = new Select(dataPicker.selectAy);
        arg0=arg0-1;
        dropdownAy.selectByIndex(arg0);
    }

    @And("Kullanici Gunu secer {int}")
    public void kullaniciGunuSecer(int gun) {



     String ilkGunText=dataPicker.dateilkGun.getText();
     if(ilkGunText.equals("25")){gun=gun+6;
     }else if (ilkGunText.equals("26")){
         gun=gun+5;
     }else if (ilkGunText.equals("27")){
         gun=gun+4;
     }else if (ilkGunText.equals("28")){
         gun=gun+3;
      }else if (ilkGunText.equals("29")){
          gun=gun+2;
         }else if (ilkGunText.equals("30")){
             gun=gun+1;
         }
        Driver.getDriver().findElement(By.xpath("(//*[contains(@class,'react-datepicker__day react-datepicker__day')])[" + gun+ "]")).click();
       // Driver.getDriver().findElement(By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--020']")).click();
    }

    @Then("dogru tarih oldugunu test ediniz")
    public void dogruTarihOldugunuTestEdiniz() {
        System.out.println("gelen tarih: "+dataPicker.tarihsonuc.getAttribute("value"));
        LocalDate tarih = LocalDate.now();
        System.out.println("Bugnün tarihi: "+DateTimeFormatter.ofPattern("MM/dd/yyyy").format(tarih));


    }


    @Then("Kullanici İleri tarihi kabul etmedigini dogrular")
    public void kullaniciİleriTarihiKabulEtmediginiDogrular() throws ParseException {
        Date d1,d2;
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        System.out.println("gelen tarih: "+dataPicker.tarihsonuc.getAttribute("value"));
       LocalDate tarih = LocalDate.now();
      //   System.out.println("Bugnün tarihi: "+DateTimeFormatter.ofPattern("MM/dd/yyyy").format(tarih));

        d1 = simpleDateFormat.parse(dataPicker.tarihsonuc.getAttribute("value"));
        d2 = simpleDateFormat.parse(DateTimeFormatter.ofPattern("MM/dd/yyyy").format(tarih));
        System.out.println("gelen: "+d1);
        System.out.println("bugun: "+d2);

        //-------------------------------------------------------------------


        if (d1.compareTo(d2) > 0) {

            // d1 > d2 ise çalıştır
            System.out.println("gelen tarih bugünden ilerdedir");
        }

        else if (d1.compareTo(d2) < 0) {

            // d1 < d2 ise çalışır.
            System.out.println(" Gelen Tarih bugünden geridedir");
        }

        else if (d1.compareTo(d2) == 0) {

            // iki tarih eşitse çalışır.
            System.out.println("Gelen Tarih bugündür");
        }

         //-------------------------------------------------------------------------------
        Assert.assertTrue("tarih ilerde olmaz",d1.compareTo(d2)<0);

    }


    @And("Kullanici zamanbox i tiklar tiklar")
    public void kullaniciZamanboxITiklarTiklar() {
        dataPicker.zamansecme2.click();


    }



    @And("Kullanicizaman bolumune Ayi girer {int}")
    public void kullanicizamanOlumuneAyiGirer(int arg0) {
       dataPicker.selectZamanAy.click();
   actions.sendKeys(Keys.DOWN).perform();
   ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.DOWN).perform();
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).click().perform();
        ReusableMethods.waitFor(2);
    }



    @And("Kullanici zaman bolumune Yil girer {string}")
    public void kullaniciZamanOlumuneYilGirer(String arg0) {

    }
    @And("Kullanici zaman bolumune Gunu secer {int}")
    public void kullaniciZamanOlumuneGunuSecer(int arg0) {
    }
}
