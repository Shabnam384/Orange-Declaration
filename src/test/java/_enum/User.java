package _enum;

public enum User {
    ZIYA("+994501000074"),
    RASMIYYA("+994501000075"),
    KAMRAN("+994501000071");

    private final String loginNumber;
    private final String password = "1";

    public String getPassword(){
        return password;
    }
    public String getLoginNumber(){
        return loginNumber;
    }
    User(String loginNumber){
        this.loginNumber = loginNumber;
    }
}
