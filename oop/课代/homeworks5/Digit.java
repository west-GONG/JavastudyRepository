package homeworks5;

public class Digit {
    private int value;//记录当前值
    private int limit;//上限值

    public Digit(int limit){//构造方法
        this.limit=limit;
    }

    public int getValue() {
        return value;
    }

    public int getLimit() {
        return limit;
    }

    public void increase(){
        value++;
        if(value==limit)
            value=0;
    }
}
