package homework4;

public class Circle {
    private double r;
    private String color;
    private Mpoint center;

    public Circle() {
        center=new Mpoint();
    }

    public Circle(double r, String color, Mpoint center) {
        this.r = r;
        this.color = color;
        this.center = center;
    }

    public Mpoint getCenter() {
        return center;
    }

    public void setCenter(Mpoint center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public void display() {
        System.out.println("r=" + r + "  color=" + color+" center:"+center.toString());
    }
    public void move(double x,double y){
        //圆的移动实际上就是圆心的移动
        center.move(x,y);
    }
}
