import LoginPage.IdPassword;
import LoginPage.PageLogin;

public class Main {
    public static void main(String[] args) {
        IdPassword IDP= new IdPassword();
        PageLogin PL = new PageLogin(IDP.getLoginInfo());

    }
}