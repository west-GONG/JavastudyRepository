package Q3;

public class Kite implements IFly{
    double length;
    double width;
    double height;
    String color;

    @Override
    public void Fly() {
        System.out.println("kite is flying...");
    }
}
