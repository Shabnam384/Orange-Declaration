package org.example.stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pageObjectModel.LoginPage;
import org.example.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    private WebDriver driver;
    LoginPage loginPage = new LoginPage();

    @Given("go to website")
    public void go_to_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://orange.istiodev.e-taxes.gov.az/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        /*var driver2 = driver;
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("document.body.style.zoom='75%'");
        driver = driver2;*/
    }
    @Given("enter mobile number")
    public void enter_mobile_number() {
        loginPage.enterMobileNumber();
    }
    @Given("click Username")
    public void click_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("enter Username")
    public void enter_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("enter password")
    public void enter_password() {

    }
    @Given("enter ID")
    public void enter_id() {
        loginPage.enterMobileId();
    }
    @Given("click login")
    public void click_login() {
        loginPage.clickSubmitButton();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Given("click cancel")
    public void click_cancel() {
        loginPage.clickCancelButton();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Then("check login")
    public void check_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
