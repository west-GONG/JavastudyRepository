import java.util.Scanner;

public class Question1 {//试利用for循环，计算1+3+5+…n,其中n是奇数，要求n从键盘输入。
    public static void main(String[] args) {
        int n=0;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入奇数列最后一个数,需为奇数");
        n=sc.nextInt();
           for (int i=0;i<=n;i++) {
               if(i%2!=0){
                   sum +=i;
               }
           }
        System.out.println("奇数列的和为"+sum);
    }
}
