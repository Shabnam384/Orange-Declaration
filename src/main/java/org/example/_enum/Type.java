package org.example._enum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public enum Type {
    CARI("Cari",By.cssSelector("div[title='Cari']")),
    DEQIQLESHMISH("Dəqiqləşmiş",By.cssSelector("div[title='Dəqiqləşmiş']")),
    LEGVOLMA("Ləğv olma",By.cssSelector("div[title='Ləğv olma']")),
    LEGVINDEQIQLESHMISHI("Ləğvin dəqiqləşmişi",By.cssSelector("div[title='Ləğvin dəqiqləşdirilmişi']")),
    KONULLUACIQLAMA("Könüllü açıqlama",By.cssSelector("div[title='Könüllü açıqlama']"));

    private final String type;
    private final By declTypeLocator;
    public final String getType(){
        return type;
    }
    public final By getDeclarationTypeLocator(){
        return declTypeLocator;
    }
    Type(String type, By declTypeLocator){
        this.type = type;
        this.declTypeLocator = declTypeLocator;
    }
    public final WebElement getTypeWebElement(WebDriver driver){
        return driver.findElement(getDeclarationTypeLocator());
    }
    static public Type getTypeByName(String name){
        return  switch (name) {
            case "Cari" -> Type.CARI;
            case "Dəqiqləşmiş" -> Type.DEQIQLESHMISH;
            case "Ləğv olma" -> Type.LEGVOLMA;
            case "Ləğvin dəqiqləşmişi" -> Type.LEGVINDEQIQLESHMISHI;
            case "Könüllü açıqlama" -> Type.KONULLUACIQLAMA;
            default -> throw new RuntimeException("Invalid type. Type name:" + name);
        };
    }
}
