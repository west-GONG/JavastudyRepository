package title5;
import java.util.Scanner;

public class userTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请按照以下顺序输入");
        System.out.println("----------------------");
        System.out.println("用户名：");
        String s1= sc.next();
        System.out.println("密码：  ");
        String s2= sc.next();
        System.out.println("确认密码：");
        String s3= sc.next();
        System.out.println("Email:  ");
        String s5 = sc.next();
        System.out.println("----------------------");
        user user1= new user(s1,s2,s5);
        if(user1.checkUsername(s1)&&user1.checkPassword(s2)&&user1.checkEmail(s5)) {
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配不成功");
        }
    }
}
