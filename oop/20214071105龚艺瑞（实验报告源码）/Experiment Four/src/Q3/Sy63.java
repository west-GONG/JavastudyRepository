package Q3;

public class Sy63 {
    public static void main(String[] args) {
        // TODO code application logic here
        IFly ifly;
        ifly=new Bird();
        ifly.Fly(); //(1)
        ifly=new Plane();
        ifly.Fly();//(2)
        ifly=new Kite();
        ifly.Fly();
        //上述两条语句中运行结果不一样。
        //因为接口中的方法没有方法体，无具体实现功能。
        //使用了面向对象的多态特性。
        //可以用抽象类
        //一样没有方法体，将抽象类作为父类，方法一样在子类中具体实现。
    }
}
