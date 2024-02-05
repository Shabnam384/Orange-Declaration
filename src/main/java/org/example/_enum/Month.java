package org.example._enum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    DECEMBER("Dekabr", By.cssSelector("div[title='Dekabr'] div[class='vis-select-item-option-content']")),
    FIRSTQUARTER("I", By.cssSelector("div[title='I'] div[class='vis-select-item-option-content']")),
    SECONDQUARTER("II", By.cssSelector("div[title='II'] div[class='vis-select-item-option-content']")),
    THRİDQUARTER("III", By.cssSelector("div[title='III'] div[class='vis-select-item-option-content']")),
    FOURTHQUARTER("IV", By.cssSelector("div[title='IV'] div[class='vis-select-item-option-content']"));

    private final String month;
    private final By periodMonthLocator;
    public final String getMonth(){
        return month;
    }
    public final By getPeriodMonthLocator(){
        return periodMonthLocator;
    }
    Month(String month,By periodMonthLocator){
        this.month = month;
        this.periodMonthLocator = periodMonthLocator;
    }
    public final WebElement getMonthWebElement(WebDriver driver) {
        return driver.findElement(getPeriodMonthLocator());
    }
    static public Month getMonthByName(String name) {
        return switch (name) {
            case "YANVAR" -> Month.JANUARY;
            case "FEVRAL" -> Month.FEBRUARY;
            case "MART"   -> Month.MARCH;
            case "APREL" -> Month.APRIL;
            case "MAY" -> Month.MAY;
            case "IYUN" -> Month.JUNE;
            case "IYUL" -> Month.JULY;
            case "AVQUST" -> Month.AUGUST;
            case "SENTYABR" -> Month.SEPTEMBER;
            case "OKTYABR" -> Month.OCTOBER;
            case "NOYABR" -> Month.NOVEMBER;
            case "DEKABR" -> Month.DECEMBER;
            case "I" -> Month.FIRSTQUARTER;
            case "II" -> Month.SECONDQUARTER;
            case "III" -> Month.THRİDQUARTER;
            case "IV" -> Month.FOURTHQUARTER;
            default -> throw new RuntimeException("Invalid month. Month:" + name);
        };
    }
}
