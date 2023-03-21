package Q2;

public abstract class Shape{
    String lineType;
    //线型
    String lineColor;
    //线条颜色
    public String getLineType() {
        return lineType;
    }

    public String getLineColor() {
        return lineColor;
    }

    public Shape(String lineType, String lineColor) {
        this.lineType = lineType;
        this.lineColor = lineColor;
    }

    public abstract void draw();//绘制

    public abstract void move(String a,double b);//移动

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void show();
}
