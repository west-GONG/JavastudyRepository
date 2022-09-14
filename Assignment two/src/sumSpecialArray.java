import java.util.Scanner;

public class sumSpecialArray {
    public static void main(String[] args) {
        double n = 2.0, m = 1.0, num, sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入求和项");
        int i = sc.nextInt();
        for (int j = 1; j <=i; j++) {
            num = n / m;
            sum += num;
            n = n + m;
            m = n - m;
        }
        System.out.println("前i项和为" + sum);
    }
}
