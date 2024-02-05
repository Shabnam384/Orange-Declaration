package _enum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public enum Years {
    _2020("2020",By.cssSelector("div[title='2020'] div[class='vis-select-item-option-content']")),
    _2021("2021",By.cssSelector("div[title='2021'] div[class='vis-select-item-option-content']")),
    _2022("2022",By.cssSelector("div[title='2022'] div[class='vis-select-item-option-content']"));


    private final String year;
    private final By periodYearLocator;

    Years(String year,By periodYearLocator) {
        this.year = year;
        this.periodYearLocator = periodYearLocator;
    }
}
