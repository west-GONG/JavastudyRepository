import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class integerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数当输入0时结束");
        LinkedList elements = new LinkedList(); //用一个链表List用来接收元素
        while(sc.hasNext()){ //循环：当有下一个元素的时候
            int element = sc.nextInt(); //获得下一个元素并作为整数
            if(element==0){//如果等于0，就是输入结束
                break; //退出while循环
            }else{
                elements.add(element); //否则放入集合中
            }
        }
        Integer[] intArray = (Integer[]) elements.toArray(new Integer[0]);//循环结束后，将集合转为数组
        System.out.println(Arrays.asList(intArray));
        int max = intArray[0];
        int min = intArray[0];
        double sum = 0;
        double average = 0;
        for(int i=0;i<intArray.length;i++) {
            if (intArray[i]>max) {
                max = intArray[i];
            }
            if (intArray[i]<min) {
                min = intArray[i];
            }
        }
        System.out.println(max+"是所有输入值中的最大值!");
        System.out.println(min+"是所有输入值中的最小值!");
    }
}