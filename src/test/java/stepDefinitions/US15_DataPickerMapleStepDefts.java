package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US15_DataPickerMaplePage;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class US15_DataPickerMapleStepDefts {

US15_DataPickerMaplePage datePicker=new US15_DataPickerMaplePage();
    String expectedYear, expectedDay, expectedMonth;
    @Given("Kullanici YIL,AY,GUN secer")
    public void kullanici_yil_ay_gun_secer(List<Map<String, String>> dateTable) {
        for (Map<String, String> map : dateTable) {
            Select selectYear = new Select(datePicker.selectDateYearSelectBox);
            selectYear.selectByValue(map.get("Year"));
            Select selectMonth = new Select(datePicker.selectDateMonthSelectBox);
            selectMonth.selectByVisibleText(map.get("Month"));
            String month = map.get("Month");
            expectedYear = map.get("Year");
            List<WebElement> days = null;
            switch (month.toLowerCase()) {
                case "january":
                    days = datePicker.january;
                    expectedMonth = "01";
                    break;
                case "february":
                    days = datePicker.february;
                    expectedMonth = "02";
                    break;
                case "march":
                    days = datePicker.march;
                    expectedMonth = "03";
                    break;
                case "april":
                    days = datePicker.april;
                    expectedMonth = "04";
                    break;
                case "may":
                    days = datePicker.may;
                    expectedMonth = "05";
                    break;
                case "june":
                    days = datePicker.june;
                    expectedMonth = "06";
                    break;
                case "july":
                    days = datePicker.july;
                    expectedMonth = "07";
                    break;
                case "august":
                    days = datePicker.august;
                    expectedMonth = "08";
                    break;
                case "september":
                    days = datePicker.september;
                    expectedMonth = "09";
                    break;
                case "october":
                    days = datePicker.october;
                    expectedMonth = "10";
                    break;
                case "november":
                    days = datePicker.november;
                    expectedMonth = "11";
                    break;
                case "december":
                    days = datePicker.december;
                    expectedMonth = "12";
                    break;
            }
            for (WebElement day : days) {
                ReusableMethods.waitFor(2);
                if ((day.getText()).equals(map.get("Day"))) {
                    expectedDay = day.getText();
                    ReusableMethods.waitFor(1);
                    day.click();
                    break;
                }
            }
        }
    }

    @Then("Kullanici date and time secilebildigini dogrular")
    public void kullaniciDateAndTimeSecilebildiginiDogrular() {
        Assert.assertEquals(expectedMonth + "/" + expectedDay + "/" + expectedYear, datePicker.selectDateBox.getAttribute("value"));
    }
}
