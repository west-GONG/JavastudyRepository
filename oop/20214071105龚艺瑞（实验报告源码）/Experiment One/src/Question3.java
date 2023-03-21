import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Question3 q = new Question3();
        System.out.println("请输入阶乘求和尾数");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("阶乘和为"+q.sumFactorial(a));
    }
    public long sumFactorial(int a){
        long sum=0;
        for (int i=1;i<=a;i++) {
         sum+=Factorial(i);
        }
        return sum;
    }

    public long Factorial(int a){
        long sum=1;
        for (int i=1;i<=a;i++) {
            sum*=i;
        }
        return sum;
    }
}
