package lx21_1;

import java.util.Random;

public class DataProcessing {
    /**
     * 功能：定义一个方法，判断一个正整数是否是素数。
     * 返回值：有 boolean
     * 参数：有，1，int
     */
    public boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return  false;
        }
        return true;
    }

//    定义方法求n!
//    定义方法求n!+(n+1)!+…+m!，其中n、m均为正整数，且n≤m。
//    定义方法求两个double型数据的较大值。
//    定义方法统计英语句子中单词的个数。
    /**
     * String类
     */
    public int wordsOfSentence(String sentence){
        String[] words=sentence.trim().split(" +");//正则表达式
        for(String s:words) System.out.println(s);
        return words.length;
    }
//    定义方法，用于输出(x+y)n展开式的系数（即杨辉三角）。
    public void yhsj(int n){
       //使用参差数组存储数据
        //声明参差数组
        int[][] arr=new int[n][];
        //为每一行分配内存空间
        for (int i = 0; i < n; i++) {
            arr[i]=new int[i+1];
        }
        //给数组元素赋值
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==0||j==i)
                    arr[i][j]=1;
                else
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        //输出数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     * 功能：模拟随机生成一注36选7彩票
     * 返回值：有，int[]
     * 参数：无
     */
    public int[] lottery36_7(){
        int[] arr=new int[7];
        Random random=new Random();
        int x;
        for (int i = 0; i < 7; ) {
            x=random.nextInt(36)+1;
            boolean isExist=false;
            for (int j = 0; j < i; j++) {
                if(arr[j]==x){
                    isExist=true;
                    break;
                }
            }
            if(!isExist){
                arr[i]=x;
                i++;
            }
        }
        return arr;
    }
}
