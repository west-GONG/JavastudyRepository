package Q3;

public class Plane implements IFly{
    double length;
    double width;
    double height;
    String color;
    double load;//载重量
    void Launch(){//起飞
        System.out.println("plane is launching...");
    }
    void Landing(){// 降落
        System.out.println("plane is landing...");
    }

    @Override
    public void Fly() {
        System.out.println("plane is flying...");
    }

}
