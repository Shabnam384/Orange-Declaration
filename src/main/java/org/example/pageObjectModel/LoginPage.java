package org.example.pageObjectModel;
import org.openqa.selenium.support.FindBy;
import org.example.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractClass {
    static WebDriver driver;
    public LoginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input.vis-input.visinput.mobile")
    public WebElement mobileNumber;

    public void enterMobileNumber(){
        clickFunction(mobileNumber);
        sendKeysFunction(mobileNumber,"+994501000075");
    }

    @FindBy(name = "id")
    public WebElement mobileId;

    public void enterMobileId(){
        clickFunction(mobileId);
        sendKeysFunction(mobileId,"1");
    }

    @FindBy(css = "button[data-testid='app.login.enter']")
    public WebElement submitButton;

    public void clickSubmitButton(){
        clickFunction(submitButton);
    }
    @FindBy(css = "button[data-testid='drawer-close'] svg")
    public WebElement cancelButton;
    public void clickCancelButton(){
        clickFunction(cancelButton);
    }
}