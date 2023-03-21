import java.util.Scanner;

public class ExceptionAll {//异常处理类
    //            在使用 nextInt() 输入非法整数时，异常被捕，但缓存区的内容并没有被读取出来
    //            直接导致了下一次循环 nextInt() 直接读取了缓存中的非法整数，再次触发异常被捕获，由此导致死循环。
    //            所以，在异常捕获那一块应该将缓存清空，以进行下一次阻塞输入
    public static int main(int ch){//主类功能选择中，异常处理
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                ch=sc.nextInt();
                break;
            }catch(Exception e) {//捕获任何类型的异常
                System.out.print("[ "+sc.nextLine()+" ] 不是合法的整数\n请重新输入：");
            }
        }
        while (ch <0||ch >6){
            System.out.print("不合法的输入！请重新输入：");
            while(true) {
                try {
                    ch=sc.nextInt();
                    break;
                }catch(Exception e) {//捕获任何类型的异常
                    System.out.print("[ "+sc.nextLine()+" ] 不是合法的整数\n请重新输入：");
                }
            }
            if(ch>=0 && ch<=6){
                System.out.println("操作成功！");
                break;
            }
        }
        return ch;
    }

    public static double money(double mon){
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                mon=sc.nextDouble();
                break;
            }catch(Exception e) {//捕获任何类型的异常
                System.out.print("[ "+sc.nextLine()+" ] 不是合法的数字！\n请重新输入：");
            }
        }
        while (mon<0){
            System.out.println("数据不合法，请重新输入（非负数）：");
            while(true) {
                try {
                    mon=sc.nextDouble();
                    break;
                }catch(Exception e) {//捕获任何类型的异常
                    System.out.print("[ "+sc.nextLine()+" ] 不是合法的数字！\n请重新输入：");
                }
            }
            if(mon>=0){
                System.out.println("-----操作成功！-----");
                break;
            }
        }
        return mon;
    }

    public static int num(int n){
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                n=sc.nextInt();
                break;
            }catch(Exception e) {//捕获任何类型的异常
                System.out.print("[ "+sc.nextLine()+" ] 不是合法的数字！\n请重新输入：");
            }
        }
        while (n <0){
            System.out.print("不合法的输入！请重新输入：");
            while(true) {
                try {
                    n=sc.nextInt();
                    break;
                }catch(Exception e) {//捕获任何类型的异常
                    System.out.print("[ "+sc.nextLine()+" ] 不是合法的整数\n请重新输入：");
                }
            }
        }
        return n;
    }

    public static int ch(int c){
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                c=sc.nextInt();
                break;
            }catch(Exception e) {//捕获任何类型的异常
                System.out.print("[ "+sc.nextLine()+" ] 不是合法的数字！\n请重新输入：");
            }
        }
        while (c <1||c >2){
            System.out.print("不合法的输入！请重新输入：");
            while(true) {
                try {
                    c=sc.nextInt();
                    break;
                }catch(Exception e) {//捕获任何类型的异常
                    System.out.print("[ "+sc.nextLine()+" ] 不是合法的整数\n请重新输入：");
                }
            }
        }
        return  c;
    }
}
