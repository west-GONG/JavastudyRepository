package homeworks5;

public class User {
    private String userName;
    private String password;

    public User(String userID, String password) {
        this.userName = userID;
        this.password = password;
    }

    public void showInfo() {//静态方法
        System.out.println("ID:" + this.userName + "  password:" + this.password);
    }

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

}

