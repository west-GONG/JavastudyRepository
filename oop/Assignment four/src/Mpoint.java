import java.util.Scanner;

public class Mpoint {
    double x;
    double y;

    public Mpoint(){
        x=10;
        y=5;
    }

    public Mpoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Mpoint p1=new Mpoint();
        p1.setX(12.3);
        p1.setY(3.4);
        p1.display();
        p1.moveX(2);
        p1.moveY(2);
        p1.display();
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void display(){
        System.out.println("坐标信息为："+"("+x+","+y+")");
    }

    public double moveX(double x1){
        String a=("left");
        String b=("right");
        System.out.println("选择横向左还是右");
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        if(s.equals(a)){
            x=x-x1;
        }
        if(s.equals(b)){
            x=x+x1;
        }
        return x;
    }
    public double moveY(double y1){
        String a=("down");
        String b=("up");
        System.out.println("选择纵向向上还是下");
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        if(s1.equals(a)){
            y=y-y1;
        }
        if(s1.equals(b)){
            y=y+y1;
        }
        return y;
    }
}
