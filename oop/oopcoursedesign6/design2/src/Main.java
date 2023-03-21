
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("*   个人收支管理系统\t   *");
        System.out.println("*    制作人：龚艺瑞\t   *");
        System.out.println("*    课程设计第六组\t   *");
        System.out.println("************************");
        while(true) {
            int choose=show();
            //选择操作
            Function.judge(choose);
            //进一步处理
        }
    }

    public static int show() {
        System.out.println("----------------------------------------------");
        System.out.println("当前总金额：["+ Record.getAllMoney()+"] 欢迎使用~");
        System.out.println("***************** 1.收入录入 *******************");
        System.out.println("***************** 2.支出录入 *******************");
        System.out.println("*************** 3.收支情况查询 ******************");
        System.out.println("*************** 4.收支情况删除 ******************");
        System.out.println("***************** 5.修改金额 ********************");
        System.out.println("***************** 6.修改信息 ********************");
        System.out.println("***************** 0.保存退出 *******************");
        int ch=0;
        //用于读取输入
        System.out.print("请选择：");
        return ExceptionAll.main(ch);
    }
}
