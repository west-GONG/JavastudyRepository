import java.util.HashSet;

public class Lottery36Pick7 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();//创建一个HashSet集合
        while (hs.size() < 7) {//判断集合的长度是不是小于7
            int number = (int) (Math.random() * 36) + 1;
            hs.add(number);
        }
        System.out.println("36选7摇号如下：");
        hs.forEach(s -> System.out.print(s + "\t"));//遍历HashSet集合
    }
}
