package Q2;

public class triangle extends Shape{
    double a;
    double b;
    double c;

    public triangle(String lineType, String lineColor, double a, double b, double c) {
        super(lineType, lineColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public void draw() {
        System.out.println("正画出一个三角！");
    }

    @Override
    public void move(String a,double b) {
        System.out.println("三角向"+a+"方向移动"+b+"个单位");
    }

    @Override
    public double getArea() {
        double p=(a+b+c)/2;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter=a+b+c;
        return perimeter;
    }

    @Override
    public void show() {
        System.out.println("三角的线型为"+getLineType()+"\n"+"三角的线颜色为"+getLineType() +"\n"+ "三角的面积为"+getArea()+
                "三角的周长为"+getArea());
    }
}
