package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before // TestNG'deki BeforeMethod gibi calisir. Her Scenerio'dan once calisir
    public void setUp(){


    }

    @After // TestNG'deki AfterMethod gibi calisir. Her Scenerio'dan sonra calisir
    public void tearDown(Scenario scenario){

//        Ekran goruntusu almak icin kullaniliyor.
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
scenario.attach(screenshot,"image/png","screenshots");
            //scenario.embed(screenshot,"image/png");
        }

       Driver.closeDriver();
    }
}