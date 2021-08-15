package userData;

import java.io.Serializable;

public class LoginData implements Serializable {
    private String userName;
    private String password;

    public LoginData (String userName,String password) {
        this.userName=userName;
        this.password=password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
