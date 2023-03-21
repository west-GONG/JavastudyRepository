package homework4;

public class Mpoint {
    private double x;
    private double y;

    public Mpoint() {

    }

    public Mpoint(double x, double y) {//在方法内部，与成员变量同名的局部变量优先
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void display() {
        System.out.println("(" + this.x + "," + this.y + ")");//(2,4)
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public void move(double x1, double y1) {
        this.x += x1;
        this.y += y1;
    }


}
