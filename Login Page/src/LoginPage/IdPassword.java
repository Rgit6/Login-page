package LoginPage;
import java.util.HashMap;
public class IdPassword {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    public IdPassword() {
        //get user id and password seperatly
        //using the seperate varaible in the welcome page to say "HELLO "NAME" "
        logininfo.put("rohit", "yes");
        logininfo.put("Bro", "PASSWORD");
        logininfo.put("BroCode", "abc123");
        logininfo.put("Codetamil", "roxy");
    }
    public HashMap getLoginInfo()
    {
        return logininfo;
    }

}
