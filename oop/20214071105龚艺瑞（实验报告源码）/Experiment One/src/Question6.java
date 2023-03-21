public class Question6 {
    //试编写一程序，输出从1-1000之间，所有可以被7整除，又可以被3整除的数。
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=1000;i++) {
            if(i%3==0||i%7==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("1-1000之间，所有可以被7整除，又可以被3整除的数一共有"+count);
    }
}
