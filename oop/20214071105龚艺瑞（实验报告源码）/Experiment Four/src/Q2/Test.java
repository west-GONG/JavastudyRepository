package Q2;

public class Test {
    public static void main(String[] args) {
        Shape s1=new circle("粗型","黄色",4);
        s1.draw();
        s1.move("left",4);
        s1.getArea();
        s1.getPerimeter();
        s1.show();
        Shape s2=new triangle("no","green",3,3,4);
        s2.draw();
        s2.move("right",5);
        s2.getArea();
        s2.getPerimeter();
        s2.show();
    }
}
