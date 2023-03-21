public class Circle {
    double a;//圆半径
    double b;
    double perimeter;
    double area;
    int Center[]=new int [2];

    public Circle(){
        a=2;
        b=5;
    }

    public Circle(double a,double b){
        this.a = a;
        this.b = b;
    }

    public void move(int x,int y){
        Center[0]+=x;
        Center[1]+=y;
    }
    public static void main(String[] args) {
        Circle o=new Circle();
        o.setA(6);
        o.setB(3);
        o.perimeter();
        o.area();
        o.move(-20,30);
        o.display();
    }
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double perimeter(){
        double c=3.14;
        perimeter=2*a*c;
        System.out.println("圆的周长为"+perimeter);
        return perimeter;
    }
    public double area(){
        double c=3.14;
        area=c*a*a;
        System.out.println("圆的面积为"+area);
        return area;
    }
    public void display(){
        System.out.println("圆的半径为："+a+"圆的颜色信息为："+b+"\n"+"圆的周长为："+perimeter+"圆的面积为："+area
        +"\n"+"圆中心为"+Center[0]+","+Center[1]);
    }
}
