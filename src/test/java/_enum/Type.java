package _enum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public enum Type {
    CARI("Cari",By.cssSelector("div[title='Cari']")),
    DEQIQLESHMISH("Dəqiqləşmiş",By.cssSelector("div[title='Dəqiqləşmiş']")),
    LEGVOLMA("Ləğv olma",By.cssSelector("div[title='Ləğv olma']")),
    LEGVINDEQIQLESHMISHI("Ləğvin dəqiqləşmişi",By.cssSelector("div[title='Ləğvin dəqiqləşdirilmişi']")),
    KONULLUACIQLAMA("Könüllü açıqlama",By.cssSelector("div[title='Könüllü açıqlama']"));

    private final String type;
    private final By declTypeLocator;

    Type(String type, By declTypeLocator){
        this.type = type;
        this.declTypeLocator = declTypeLocator;
    }
}
