package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WbTablesPage;

public class WebTablesStepDefinitions {
WbTablesPage wbTablesPage=new WbTablesPage();


    @Then("webTables butonuna basiniz")
    public void web_tables_butonuna_basiniz() {
wbTablesPage.webTables.click();
    }

    @Given("Add butonuna basiniz")
    public void add_butonuna_basiniz() {
wbTablesPage.add.click();
    }


    @And("cikan formda firstName yaziniz{string}")
    public void cikanFormdaFirstNameYazinzi(String firstName) {
wbTablesPage.firstName.sendKeys(firstName);

    }

    @And("cikan formda lastName yaziniz{string}")
    public void cikanFormdaLastNameYaziniz(String lastName) {
        wbTablesPage.lastName.sendKeys(lastName);
    }

    @And("cikan formda email giriniz{string}")
    public void cikanFormdaEmailGiriniz(String email) {
        wbTablesPage.email.sendKeys(email);
    }

    @And("cikan formda age yaziniz{string}")
    public void cikanFormdaAgeYaziniz(String age) {
        wbTablesPage.age.sendKeys(age);
    }

    @And("cikan formda salary yaziniz{string}")
    public void cikanFormdaSalaryYaziniz(String salary) {
        wbTablesPage.salary.sendKeys(salary);
    }

    @And("cikan formda department yaziniz{string}")
    public void cikanFormdaDepartmentYaziniz(String department) {
        wbTablesPage.department.sendKeys(department);
    }

    @And("submit butonuna tiklayiniz")
    public void submitButonunaTiklayiniz() {
        wbTablesPage.submit.click();
    }



    @And("search butonuna firstName giriniz {string}")
    public void searchButonunaFirstNameGiriniz(String search) {

    wbTablesPage.seaarch.sendKeys(search);

    }


    @Then("kaydin ekledigini dogrulayiniz {string}")
    public void kaydinEklediginiDogrulayiniz(String firstName) {
        System.out.println(wbTablesPage.firstRow.getText());
        Assert.assertTrue(wbTablesPage.firstRow.getText().contains(firstName));
    }
}
