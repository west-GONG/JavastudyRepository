package Timer;

public class DisPlay {
    private int value = 0;
    private int limit = 0;      //普通成员变量
    private static int step;    //类变量，广属于类而不专属于任何一个对象

    public DisPlay(int limit){
        this.limit = limit;
    }

    public void increase(){
        value++;
        if(value == limit){
            value = 0;
        }
    }

    public int getValue(){
        return  value;
    }

    public static void TestStatic(){    //类函数
        System.out.println("运行了类函数");
    }
}
