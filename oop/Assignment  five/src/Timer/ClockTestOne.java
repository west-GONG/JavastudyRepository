package Timer;

import java.util.Timer;
import java.util.TimerTask;

public class ClockTestOne {
    private DisPlay hour = new DisPlay(24);
    //1、用类 Timer.DisPlay 的对象来
    private DisPlay minute = new DisPlay(60);
    //   构成类 Timer.ClockTestOne 的成员变量；
    private DisPlay second = new DisPlay(60);//2、三个 Timer.DisPlay 的对象通过 Timer.ClockTestOne
    Timer time = new Timer(); //   来联系彼此，保证了彼此的独立性；

    public void start(){
//        while (true){
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                second.increase();
                if(second.getValue() == 0) {
                    minute.increase();
                    if (minute.getValue() == 0) {
                        hour.increase();
                    }
                }
                System.out.printf("%02d:%02d:%02d\n",
                        hour.getValue(),minute.getValue(),second.getValue());
            }
        },1000,1000);  //延迟 1秒 执行，并不停每隔 1秒 执行一次
    }

    public static void main(String[] args){
        ClockTestOne clock = new ClockTestOne();
        clock.start();
    }

}
