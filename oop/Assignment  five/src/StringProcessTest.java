import java.util.Scanner;

public class StringProcessTest {
    public static void main(String[] args) {
        StringProcess sp=new StringProcess();
        Scanner str=new Scanner(System.in);
        System.out.println("请输入一串字符");
        String s= str.nextLine();
        System.out.println("判断是否为对称字符串:"+sp.symmetric(s));
        System.out.println("请输入一段文段包含单词:");
        String s1=str.nextLine();
        System.out.println("将文段翻转后得到:"+sp.reverseStr(s1));
        System.out.println("请输入一串字符串，数字可有可无");
        String s2 = str.nextLine();
        sp.getNumber(s2);
        System.out.println("请输入一串纯数字字符串:");
        String s3 = str.nextLine();
        sp.number(s3);
    }
}
