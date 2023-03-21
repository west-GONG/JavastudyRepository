import java.util.Random;
import java.util.Scanner;

public class Question8 {//猜数游戏
    public static void main(String[] args){
        Random random = new Random();
        int n = random.nextInt(100)+1;      //随机生成1-100之间的随机数
        Scanner sc = new Scanner(System.in);
        while (true){                   //通过循环使猜到之前一直运行下去
            System.out.println("请输入你猜的数字：");
            int a = sc.nextInt();
            if (a>n){                        //猜的数比随机生成的数大时
                System.out.println("sorry，您猜大了!");
            }else if (a<n){               //猜的数比随机生成的数小时
                System.out.println("sorry，您猜小了!");
            }else {
                System.out.println("恭喜您，答对了");
                break;
            }
        }
    }
}
