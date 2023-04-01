package title2;
import java.util.ArrayList;
import java.util.Scanner;

public class stringlist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String inputString;
        while (true) {
            System.out.print("请输入字符串：");
            inputString = scanner.nextLine();
            list.add(inputString);
            if (inputString.equals("")) {
                break;
            }
            System.out.println("您输入的字符串是：" + inputString);
        }
        scanner.close();
        System.out.println("list集合为：");
        list.forEach(System.out::println);
        list.removeIf(s1->s1.length()>=5);
        System.out.println("修改后的集合为:");
        list.forEach(System.out::println);
    }
}
