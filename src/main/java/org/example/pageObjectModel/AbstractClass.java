package org.example.pageObjectModel;
import org.example.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.ArrayList;

public abstract class AbstractClass {
    private WebDriver driver= Driver.getDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions actions = new Actions(driver);




    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void rightClickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        actions.contextClick(clickElement).perform();
    }

    public void sendKeysFunction (WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }
    public void selectElementFromDropdown(WebElement dropdown, String element){
        Select slc=new Select(dropdown);
        slc.selectByVisibleText(element);
    }

}
