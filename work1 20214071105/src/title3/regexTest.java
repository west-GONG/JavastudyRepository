package title3;

import java.util.Scanner;

public class regexTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字字符串");
        String input=scan.nextLine();
        if (input.matches("^-?\\d+(\\.\\d+)?$")) {
            if (input.contains(".")) {
                System.out.println("小数");
            } else {
                System.out.println("整数");
            }
        } else {
            System.out.println("不是数字");
        }
    }
}
