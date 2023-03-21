package homeworks5;

public class Login {
    User[] users = new User[3];
    public Login() {
        users[0] = new User("aa", "111");
        users[1] = new User("bb", "222");
        users[2] = new User("cc", "333");
    }
    public User findUser(String username){
        for (User user : users) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }
    public int login(String username,String password){
        User currentuser = findUser(username);
        if (currentuser == null)
            return 0;
        else if (!currentuser.getPassword().equals(password))
            return 1;
        else
            return 2;
    }
}
