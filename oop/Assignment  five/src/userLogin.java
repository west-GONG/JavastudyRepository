import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class userLogin {
    static Scanner sc = new Scanner(System.in);
    static HashSet<User> set = new HashSet<>();
    public static void main(String[] args) {
        while(true) {
            showMenu("****欢迎使用用户注册系统****","1.注册","2.登录","3.退出","请选择您的操作：");
            String i = sc.next();
            switch(i) {
                case "1":
                    UserRegister();
                    break;
                case "2":
                    userLog();
                    break;
                case "3":
                    System.out.println("正在退出系统，请稍后》》》");
                    System.out.println("功成退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("暂时没有您选择的功能呢,请重新输入：");
                    break;
            }
        }
    }

    /**
     * 显示菜单
     */
    private static void showMenu(String...menus) {
        for(String menu :menus) {
            System.out.println(menu);
        }
    }
    /**
     * 注册
     */
    private static void UserRegister() {
        System.out.println("*****欢迎新用户注册*****");
        boolean sr = false;
        System.out.println("请输入您要注册用户名：");
        String userName = sc.next();
        System.out.println("请输入您的密码：");
        String userPassWord = sc.next();
        //将用户名和密码存储到 变量中
        sr = set.add(new User(userName,userPassWord));
        // sr 的初始化赋值就是false ！ 不等于的意思 负负得正  if（！sr）这个条件就是判断用户名是否相同
        if(!sr) {
            System.out.println("用户名已经被注册！！！请重新输入");
        }else {
            System.out.println("恭喜您，注册成功！！！");
        }

        operation();
    }
    /**
     * 登录
     */
    private static void userLog() {
        System.out.println("*****欢迎登录本系统****");
        User user3 = new User();
        while(true) {
            System.out.println("请输入您的登录用户名：");
            String userNameLog = sc.next();
            System.out.println("请输入您的登录密码：");
            String userPassWordLog = sc.next();
            User user = new User(userNameLog,userPassWordLog);
            boolean sr = set.contains(user);
            if(!sr) {
                System.out.println("用户名不存在,请重新输出");
            }else {
                Iterator<User> iterator = set.iterator();
                while(iterator.hasNext()) {
                    User user2 = iterator.next();
                    //	判断输入的控制台与登录时的用户名与密码相等
                    if(user2.getUserName().equals(userNameLog) && user2.getUserPassWord().equals(userPassWordLog)) {
                        System.out.println("登录成功，欢迎"+userNameLog+"使用本系统");
                        operation();
                    }
                }
                System.out.println("登录失败，密码错误");
            }
        }
    }
    /**
     * 判断是否继续操作
     */
    private static void operation() {
        System.out.println("是否继续操作? \t是:否");
        String bool = sc.next();
        if(bool.equals("是")) {
            //	继续操作就进入登录循环
            userLog();
        }else if(bool.equals("否")){
            System.out.println("正在退出请稍后》》》");
            System.out.println("成功退出");
            System.exit(0);
        }else{
            System.out.println("暂时还未开通此功能，请重新输入：");
        }
    }
}
