import java.util.Scanner;

public class menu {
    public static int show() {
        System.out.println("----------------------------------------------");
        System.out.println("**************欢迎来到客房管理系统***************");
        System.out.println("***************** 1.客房添加 ******************");
        System.out.println("***************** 2.客户添加 ******************");
        System.out.println("***************** 3.客房修改 ******************");
        System.out.println("***************** 4.客户修改 ******************");
        System.out.println("***************** 5.客房删除 ******************");
        System.out.println("***************** 6.客户删除 ******************");
        System.out.println("***************** 7.客房显示 ******************");
        System.out.println("***************** 8.客户显示 ******************");
        System.out.println("****************** 9.开房 ********************");
        System.out.println("****************** 10.退房 ********************");
        System.out.println("***************** 0.保存退出 ******************");
        int ch;
        //用于读取输入
        System.out.print("请选择：");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        return ch;
    }
}
