import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double s;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三角形的三条边长");
        System.out.println("a= ");
        double a=sc.nextInt();
        System.out.println("b= ");
        double b=sc.nextInt();
        System.out.println("c= ");
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
