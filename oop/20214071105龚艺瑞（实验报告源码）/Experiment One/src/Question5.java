import java.util.Scanner;

public class Question5 {
    //某收费站按如下方法收费：自行车免费，摩托车2元，小汽车5元，大客车与货车8元，货柜车12元，
    // 编写一个程序，按车辆的不同型号计算通过此收费站所应征收的费用。
    public static void main(String[] args) {
        Question5 q = new Question5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入自行车的数量");
        int bicycle=scanner.nextInt();
        q.bicycle(bicycle);
        System.out.println("自行车免费");
        System.out.println("请输入摩托车的数量");
        int motorcycle=scanner.nextInt();
        System.out.println("摩托车的费用为"+q.motorcycle(motorcycle));
        System.out.println("请输入小汽车的数量");
        int car= scanner.nextInt();
        System.out.println("小汽车费用为"+q.car(car));
        System.out.println("请输入大客车及货车的数量");
        int bus= scanner.nextInt();
        int truck= scanner.nextInt();
        System.out.println("大客车及货车的费用为"+q.bus_truck(bus,truck));
        System.out.println("请输入货柜车的数量");
        int containerTruck= scanner.nextInt();
        System.out.println("货柜车的费用为"+q.containerTruck(containerTruck));
        System.out.println("总费用为"+(q.bicycle(bicycle)+q.motorcycle(motorcycle)+q.car(car)+q.bus_truck(bus,truck)+
                q.containerTruck(containerTruck)));
    }
    public int bicycle(int n){
       int cost=0;
       return cost;
    }
    public int motorcycle(int n) {
        int cost = n*2;
        return cost;
    }
    public int car(int n){
        int cost = n*5;
        return cost;
    }
    public int bus_truck(int n,int m){
        int cost=(m+n)*8;
        return cost;
    }
    public int containerTruck(int n) {
        int cost =n*12;
        return cost;
    }
}
