import javax.swing.*;

public class Triangle extends shapes{
    double edg1,edg2,edg3;
    public Triangle(double edg1, double edg2, double edg3){
        this.edg1 = edg1;
        this.edg2 = edg2;
        this.edg3 = edg3;
    }
    public Triangle(JLabel labName1) {
    }
    public double perimeterCalculation(){
        double s = (edg1 + edg2 + edg3) / 2;
        return (Math.sqrt(s*(s-edg1)*(s-edg2)*(s-edg3)));
    }
    public double areaCalculation(){
        return (edg1 + edg2 + edg3);
    }
}
