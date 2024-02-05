package _enum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public enum Delivery {
    POÇT("Cari",By.cssSelector("div[title = 'Poçt']")),
    ƏLBƏƏL("Əlbəəl", By.cssSelector("div[title='Əlbəəl']"));

    private final String delivery;
    private final By postSelector;

    Delivery(String delivery,By postSelector){
        this.delivery = delivery;
        this.postSelector = postSelector;
    }
}
