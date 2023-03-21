package homeworks5;

public class StringProcessing {
    public static String reverse(String str){
        String newstr="";
        for (int i = str.length()-1; i >= 0; i--) {
            newstr+=str.charAt(i);
        }
        return newstr;
    }
//1、判断一个字符串是否对称？
    public static boolean symmetry(String str){
        if(str==null) return false;
        return str.equals(reverse(str));
    }
//2、编写一个程序，将一段文本中的各个单词的字母顺序翻转\
    public static String reverseAllWords(String str){
        String[] words=str.split(" ");
        String newstr="";
        for (int i = 0; i < words.length; i++) {
              newstr+=reverse(words[i])+" ";
        }
        return newstr;
    }
//3、统计字符串中数字的个数
//4、给定一个由数字组成的字符串，如:“1239586838923173478943890234092”，统计每个数字出现的次数
    public static int[] digitTimes(String str){
        int[] a=new int[10];
        for (int i = 0; i < str.length(); i++) {
            int ch=str.charAt(i);
            a[ch-48]++;
        }
        return a;
    }
}
