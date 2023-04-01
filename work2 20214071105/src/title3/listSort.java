package title3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=100; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);//使用shuffle方法将列表中的元素随机排序
        List<Integer> selectedNumbers = numbers.subList(0, 10);
        Collections.sort(selectedNumbers);
        System.out.println(selectedNumbers);
    }
}
