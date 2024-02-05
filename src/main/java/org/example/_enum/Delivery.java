package org.example._enum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public enum Delivery {
    POÇT("Cari",By.cssSelector("div[title = 'Poçt']")),
    ƏLBƏƏL("Əlbəəl", By.cssSelector("div[title='Əlbəəl']"));

    private final String delivery;
    private final By deliveryLocator;
    public final String getDelivery(){
        return delivery;
    }
    public final By getDeliveryLocator(){
        return deliveryLocator;
    }
    Delivery(String delivery,By getDelivery){
        this.delivery = delivery;
        this.deliveryLocator = getDelivery;
    }
    public final WebElement getDeliveryWebElement(WebDriver driver){
        return driver.findElement(getDeliveryLocator());
    }

    static public Delivery getDeliveryByName(String name){
        return switch (name) {
            case "Əlbəəl" -> Delivery.ƏLBƏƏL;
            case "Poçt" -> Delivery.POÇT;
            default -> throw new RuntimeException("Invalid delivery. Delivery:" + name);
        };
    }
}
