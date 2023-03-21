package Q2;

public class rectangle extends Shape{
    double a;
    double b;

    public rectangle(String lineType, String lineColor, double a, double b) {
        super(lineType, lineColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("正画出一个矩形！");
    }

    @Override
    public void move(String a, double b) {
        System.out.println("矩形向"+a+"方向移动"+b+"个单位");
    }

    @Override
    public double getArea() {
        double area;
        area=a*b;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter=2*(a+b);
        return perimeter;
    }

    @Override
    public void show() {
        System.out.println("矩形的线型为"+getLineType()+"\n"+"矩形的线颜色为"+getLineType() +"\n"+ "矩形的面积为"+getArea()+
                "矩形的周长为"+getArea());
    }
}
