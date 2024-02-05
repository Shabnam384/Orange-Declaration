package org.example.stepdefinition;
import org.example._enum.TaxCode;
import org.example._enum.Delivery;
import org.example.pageObjectModel.DeclRegistrationPage;
import org.example.pageObjectModel.LoginPage;
import org.example.utilities.Driver;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;

public class DeclRegistrationSteps {
    private WebDriver driver;
    DeclRegistrationPage declRegistrationPage = new DeclRegistrationPage();
    public DeclRegistrationSteps() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @Given("create scenario")
    public void create_scenario() {
        System.setProperty("tin", "1400120022");
        System.setProperty("taxCode", "ÖMV");
        System.setProperty("year", "2023");
        //IV III II I
        System.setProperty("month","I");
        System.setProperty("type", "Cari");
        System.setProperty("delivery", "Əlbəəl");
    }

    @Given("click register")
    public void click_register() throws InterruptedException {
        sleep(1000);
        declRegistrationPage.clickRegister();
    }

    @Given("click declaration")
    public void click_declaration() throws InterruptedException {
        sleep(1000);
        declRegistrationPage.clickDeclRegister();
    }

    @Given("enter tin")
    public void enter_tin() throws InterruptedException {
        declRegistrationPage.enterTin();
    }
    @Given("select taxcode")
    public void select_taxcode() {

    }

    @Given("select period code")
    public void select_period_code() {

    }

    @Given("select declaration type")
    public void select_declaration_type() throws InterruptedException {
        sleep(1000);
        declRegistrationPage.chooseDeclType();
    }

    @Given("select delivery type")
    public void select_delivery_type() {
        declRegistrationPage.chooseDeliveryType();
    }

    @Given("click registration")
    public void click_registration() {
        declRegistrationPage.clickDeclRegistation();
    }

    @Given("take registration number")
    public void take_registration_number() {
        declRegistrationPage.takeRegistrationNumber();
    }
    @Given("go to filter")
    public void go_to_filter() throws InterruptedException {
        declRegistrationPage.clickFiltr();
    }
    @Given("enter document number")
    public void enter_document_number() throws InterruptedException {
        declRegistrationPage.enterRegNumber();
    }
    @Given("apply filter")
    public void apply_filter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("choose declaration task")
    public void choose_declaration_task() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("check decl")
    public void check_decl() {

    }
}
