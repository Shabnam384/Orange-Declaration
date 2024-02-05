package org.example._enum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public enum Year {
    _2020("2020",By.cssSelector("div[title='2020'] div[class='vis-select-item-option-content']")),
    _2021("2021",By.cssSelector("div[title='2021'] div[class='vis-select-item-option-content']")),
    _2022("2022",By.cssSelector("div[title='2022'] div[class='vis-select-item-option-content']")),
    _2023("2023",By.cssSelector("div[title='2023'] div[class='vis-select-item-option-content']"));

    private final String year;
    private final By periodYearLocator;
    public final WebElement getYearsWebElement(WebDriver driver){
        return driver.findElement(periodYearLocator);
    }

    Year(String year, By periodYearLocator) {
        this.year = year;
        this.periodYearLocator = periodYearLocator;
    }
    static public Year getYearsByName(String name) {
        return switch (name) {
            case "2020" -> Year._2020;
            case "2021" -> Year._2021;
            case "2022" -> Year._2022;
            case "2023" -> Year._2023;
            default -> throw new RuntimeException("Invalid years. Years:" + name);
        };
    }
}
