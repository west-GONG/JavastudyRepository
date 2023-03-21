package Q2;

public class circle extends Shape{
    double r;

    public double getR() {
        return r;
    }

    public circle(String lineType, String lineColor, double r) {
        super(lineType, lineColor);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("正画出一个圆！");
    }

    @Override
    public void move(String a, double b) {
        System.out.println("圆向"+a+"方向移动"+b+"个单位");
    }

    @Override
    public double getArea() {
        double area;
        area=Math.PI*r*r;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = Math.PI * r*4;
        return perimeter;
    }

    @Override
    public void show() {
        System.out.println("圆的线型为"+getLineType()+"\n"+"圆的线颜色为"+getLineType() +"\n"+ "圆的面积为"+getArea()+
                "圆的周长为"+getArea());
    }
}
