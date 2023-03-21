import java.util.Scanner;

public class Question2 {//用户从键盘输入三条边的长度，程序计算出此三角形面积，并输出。
    public static void main(String[] args) {
        double s;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三角形的三条边长");
        System.out.print("a= ");
        double a=sc.nextInt();
        System.out.print("b= ");
        double b=sc.nextInt();
        System.out.print("c= ");
        double c=sc.nextInt();
        s=getTriangleArea(a,b,c);
    }
    public static double getTriangleArea(double a,double b,double c){
        double s,p;
        if(a+b>c&&a+c>b&&b+c>a)
        {
            System.out.println("构成三角形");
            p=(a+b+c)/2;
            s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("三角形面积为"+s);
        } else {
            s=-1;
            System.out.println("构不成三角形");
        }
        return s;
    }
}
