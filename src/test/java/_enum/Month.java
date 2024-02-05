package _enum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public enum Month {
    JANUARY("Yanvar", By.cssSelector("div[title='Yanvar'] div[class='vis-select-item-option-content']")),
    FEBRUARY("Fevral", By.cssSelector("div[title='Fevral'] div[class='vis-select-item-option-content']")),
    MARCH("Mart", By.cssSelector("div[title='Mart'] div[class='vis-select-item-option-content']")),
    APRIL("Aprel", By.cssSelector("div[title='Aprel'] div[class='vis-select-item-option-content']")),
    MAY("May", By.cssSelector("div[title='May'] div[class='vis-select-item-option-content']")),
    JUNE("İyun", By.cssSelector("div[title='İyun'] div[class='vis-select-item-option-content']")),
    JULY("İyul", By.cssSelector("div[title='İyul'] div[class='vis-select-item-option-content']")),
    AUGUST("Avqust", By.cssSelector("div[title='Avqust'] div[class='vis-select-item-option-content']")),
    SEPTEMBER("Sentyabr", By.cssSelector("div[title='Sentyabr'] div[class='vis-select-item-option-content']")),
    OCTOBER("Oktyabr", By.cssSelector("div[title='Oktyabr'] div[class='vis-select-item-option-content']")),
    NOVEMBER("Noyabr", By.cssSelector("div[title='Noyabr'] div[class='vis-select-item-option-content']")),
    DECEMBER("Dekabr", By.cssSelector("div[title='Dekabr'] div[class='vis-select-item-option-content']"));

    Month(String dekabr, By by) {

    }

}
