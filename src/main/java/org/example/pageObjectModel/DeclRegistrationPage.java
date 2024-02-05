package org.example.pageObjectModel;

import org.example._enum.*;
import org.example.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;
import static java.awt.SystemColor.window;
import static java.lang.Thread.sleep;


public class DeclRegistrationPage extends AbstractClass {
    static WebDriver driver;
    public DeclRegistrationPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    private String regnumber;

    @FindBy(css = "button[data-testid='app.tasks.mytasks.landing.register']")
    public WebElement buttonPrimaryRound;

    public void clickRegister() {
        clickFunction(buttonPrimaryRound);
    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div/ul/li[4]/div[2]/button")
    public WebElement buttonLink;

    public void clickDeclRegister() {
        clickFunction(buttonLink);
    }
    @FindBy(css = "input[class='vis-input']")
    public WebElement inputTin;
    @FindBy(css = "button[data-testid='apps.tasks.registrationDeclaration.register.taxpayer.check']")
    public WebElement buttonYoxla;
    @FindBy(name = "taxCode")
    public WebElement divTaxCode;
    @FindBy(css = "div[name='reportingPeriod.year']")
    public WebElement periodYear;
    @FindBy(css = "div[name='reportingPeriod.month']")
    public WebElement monthLocator;

    @FindBy(css = "div[data-testid='deliveryType']")
    public WebElement deliveryType;
    @FindBy(css = "button[data-testid='apps.tasks.registrationDeclaration.register.register']")
    public WebElement registrationButton;

    public void enterTin() throws InterruptedException {
        TaxCode taxCode = TaxCode.getTaxCodeByTaxName(System.getProperty("taxCode"));
        Year year = Year.getYearsByName(System.getProperty("year"));
        Month month = Month.getMonthByName(System.getProperty("month"));

        clickFunction(inputTin);
        sendKeysFunction(inputTin, System.getProperty("tin"));
        clickFunction(buttonYoxla);
        sleep(1000);
        clickFunction(divTaxCode);
        sleep(1000);
        clickFunction(taxCode.getTaxeCodeWebelement(driver));
        sleep(1000);
        //illik beyannameler
        if (taxCode.equals(TaxCode.TORPAQ)|| taxCode.equals(TaxCode.MV) || taxCode.equals(TaxCode.ƏDV) || taxCode.equals(TaxCode.EMLAK) || taxCode.equals(TaxCode.NEZARET)) {
            System.out.println("Meden secildi");
            clickFunction(periodYear);
            clickFunction(year.getYearsWebElement(driver));
        //ayliq beyannameler
        } else if (taxCode.equals(TaxCode.MƏDƏN) || taxCode.equals(TaxCode.YV) || taxCode.equals(TaxCode.QF) || taxCode.equals(TaxCode.UDUŞÖMV)
                || taxCode.equals(TaxCode.BANKSV) || taxCode.equals(TaxCode.AKSIZ) || taxCode.equals(TaxCode.NTRSV) || taxCode.equals(TaxCode.ƏDVQR)) {
            System.out.println("Yol vergisi secildi");
            sleep(1000);
            clickFunction(monthLocator);
            clickFunction(month.getMonthWebElement(driver));
            sleep(1000);
            clickFunction(periodYear);
            clickFunction(year.getYearsWebElement(driver));
        }
        //rubluk
        else if (taxCode.equals(TaxCode.XNGV) || taxCode.equals(TaxCode.ÖMV) || taxCode.equals(TaxCode.SADELESH) || taxCode.equals(TaxCode.XSÖMV)
                || taxCode.equals(TaxCode.VAHID) || taxCode.equals(TaxCode.DR))
        {
            System.out.println("emlak vergisi secildi");
            sleep(1000);
            clickFunction(monthLocator);
            clickFunction(month.getMonthWebElement(driver));
            clickFunction(periodYear);
            clickFunction(year.getYearsWebElement(driver));
        }
        else {
            System.out.println("dovr duz deyil");
        }
    }
    @FindBy(css = "div[name='declarationType']")
    public WebElement declType;
    public void chooseDeclType() {
        Type type = Type.getTypeByName(System.getProperty("type"));
        clickFunction(declType);
        clickFunction(type.getTypeWebElement(driver));
    }
    @FindBy(css = "div[name='deliveryType']")
    public WebElement declDeliveryType;
    public void chooseDeliveryType(){
        Delivery delivery = Delivery.getDeliveryByName(System.getProperty("delivery"));
        clickFunction(declDeliveryType);
        clickFunction(delivery.getDeliveryWebElement(driver));
    }
    @FindBy(css = "button[data-testid='apps.tasks.registrationDeclaration.register.register']")
    public WebElement registerButton;
    public void clickDeclRegistation(){
        clickFunction(registerButton);
    }
    public void takeRegistrationNumber(){
    WebElement text =
            driver.findElement(By.
                    cssSelector(".vis-notification .vis-notification-notice-message .vis-typography"));
        String regnumber = text.getText().split(" ")[0];
        this.regnumber = regnumber;
        System.out.println(regnumber);
    }
    //@FindBy(css = "button[data-testid='app.tasks.mytasks.landing.btn.filter']")
    @FindBy(xpath = "//*[@id=\"app\"]/section/main/div[2]/div/div/div[2]/div[1]/div/div[1]/div/button")
    public WebElement filtr;
    public void clickFiltr() throws InterruptedException {
        sleep(3000);
        clickFunction(filtr);
    }
    @FindBy(css = "input[name='documentNumber']")
    public WebElement regnumberFiltr;
    public void enterRegNumber() throws InterruptedException {
        sleep(3000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", regnumberFiltr);
        clickFunction(regnumberFiltr);
        //sendKeysFunction(regnumberFiltr, regnumber);
        sendKeysFunction(regnumberFiltr,"2317170000253000");
    }
    //@FindBy(css = "button[class='vis-btn vis-btn-primary vis-btn-round vis-btn-block']")

    public WebElement doFiltr;
    @FindBy(css = "table td input.vis-checkbox-input[type=checkbox]")
    public WebElement checkbox;
    @FindBy(css = "button[data-testid='app.tasks.mytasks.landing.createSet']")
    public WebElement creatSet;
    @FindBy(css = "button[data-testid='apps.tasks.mytasks.taskList.changeSigner']")
    public WebElement chooseSigner;

}