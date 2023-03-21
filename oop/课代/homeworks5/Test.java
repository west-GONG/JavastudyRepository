package homeworks5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("aa", "111");
        users[1] = new User("bb", "222");
        users[2] = new User("cc", "333");

        String username, password;
        Scanner sc = new Scanner(System.in);
        System.out.println("用户名：");
        username = sc.nextLine();
        System.out.println("密码：");
        password = sc.nextLine();
       /* User currentuser=null;
        for(User user:users){
            if(user.getUserName().equals(username)) {
                currentuser = user;
                break;
            }
        }
        if(currentuser==null)
            System.out.println("无此用户！");
        else {
            if(!currentuser.getPassword().equals(password))
                System.out.println("密码错误！");
            else
                System.out.println("登录成功！");
        }
*/
       /* for(User u:users)
        {
            if(u.getUserName().equals(username)){
                if(u.getPassword().equals(password)){
                    System.out.println("登录成功");return;
                }else{
                    System.out.println("密码错误");return;
                }
            }
        }
        System.out.println("用户不存在");*/











        Login login=new Login();
        int flag=login.login(username,password);
        if(flag==0)
            System.out.println("无此用户！");
        if(flag==1) System.out.println("密码错误！");
        if(flag==2) System.out.println("登陆成功！");
    }
}


