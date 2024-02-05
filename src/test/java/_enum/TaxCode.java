package _enum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public enum TaxCode {
    QF("QF",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Аzərbaycan Respublikasında istehsal edilən və qiymətləri tənzimlənən məhsulların kontrakt (satış) qiyməti ilə (ixrac xərcləri çıxılmaqla) ölkədaxili topdansatış qiyməti arasındakı fərqdən daxilolmalar']")),
    MƏDƏN("MƏDƏN",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Mədən vergisi']")),
    YV("YV",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Yol vergisi 2']")),
    ÖMV("ÖMV",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Ödəmə mənbəyində tutulan vergi']")),
    UDUŞÖMV("UDUŞÖMV",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Uduşlardan (mükafatlardan) əldə edilən gəlirdən ödəmə mənbəyində tutulan verginin bəyannaməsi']")),
    BANKSV("BANKSV",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Pul vəsaitlərinin çıxarılmasına görə sadələşdirilmiş vergi']")),
    MV("MV",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Mənfəət vergisi']")),
    AKSIZ("AKSIZ",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Aksiz vergisi']")),
    NTRSV("NTRSV",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Daşınmaz əmlak üzrə sadələşdirilmiş verginin bəyannaməsi']")),
    ƏDVQR("ƏDVQR",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Qeydiyyata alınmayan qeyri-rezidentə ödənilmiş məbləğə hesablanmış Əlavə dəyər vergisi']")),
    ƏDV("ƏDV",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Əlavə dəyər vergisi']")),
    XSÖMV("XSÖMV",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Xarici subpodratçılardan ödəmə mənbəyində tutulan vergi']")),
    XNGV("XNGV",By.cssSelector("div[class$='vis-select-item vis-select-item-option'][title='Xüsusi notariusun gəlir vergisi']"));

    private final String taxTypes;
    private final By taxTypeLocator;

    TaxCode(String taxTypes, By taxTypeLocator){
        this.taxTypes = taxTypes;
        this.taxTypeLocator = taxTypeLocator;
    }
}
