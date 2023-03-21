package Q3;

public class Bird implements IFly{
    String kind;//种类
    String color;//颜色
    void Walk(){
        System.out.println("Bird is walking...");
    }
    void Shout(){
        System.out.println("Bird is Shouting...");
    }

    @Override
    public void Fly() {
        System.out.println("Bird is flying...");
    }

}
