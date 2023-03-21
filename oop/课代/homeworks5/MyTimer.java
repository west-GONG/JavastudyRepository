package homeworks5;

public class MyTimer {
    private Digit hour;
    private Digit minute;
    private Digit second;

    public MyTimer(){
        hour=new Digit(24);
        minute=new Digit(60);
        second=new Digit(60);
    }

    public Digit getHour() {
        return hour;
    }

    public Digit getMinute() {
        return minute;
    }

    public Digit getSecond() {
        return second;
    }

    public void start(){
        while(true){
            second.increase();
            if(second.getValue()==0){
                minute.increase();
                if(minute.getValue()==0)
                    hour.increase();
            }
            String current=String.format("%02d:%02d:%02d",hour.getValue(),minute.getValue(),second.getValue());//hh:mm:ss

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(current);
        }
    }
}
