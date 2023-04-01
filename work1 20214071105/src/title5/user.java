package title5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class user {
    private String userName;
    private String password;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public user(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    public  boolean checkUsername(String username) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]\\w{8,20}$");
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    public  boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{6,16}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public  boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+@\\w+(\\.[a-zA-Z])+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
