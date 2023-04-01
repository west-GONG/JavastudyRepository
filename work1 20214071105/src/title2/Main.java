package title2;
public class Main {
    public static void main(String[] args) {
        // 使用普通内部类实现
        myPointInterface dc1 = new myPointInterface() {
            @Override
            public double calculate(Object o1, Object o2) {
                double distance = 0;
                if (o1 instanceof Mpoint && o2 instanceof Mpoint) {
                    Mpoint p1 = (Mpoint) o1;
                    Mpoint p2 = (Mpoint) o2;
                    distance = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
                }
                return distance;
            }
        };
        Mpoint point1 = new Mpoint(0, 0);
        Mpoint point2 = new Mpoint(3, 4);
        System.out.println("Distance between point1 and point2 using regular inner class: " + dc1.calculate(point1, point2));

        // 使用匿名内部类实现
        myPointInterface dc2 = new myPointInterface() {
            @Override
            public double calculate(Object o1, Object o2) {
                double distance = 0;
                if (o1 instanceof Mpoint && o2 instanceof Mpoint) {
                    Mpoint p1 = (Mpoint) o1;
                    Mpoint p2 = (Mpoint) o2;
                    distance = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
                }
                return distance;
            }
        };
        System.out.println("Distance between point1 and point2 using anonymous inner class: " + dc2.calculate(point1, point2));

        // 使用Lambda表达式实现
        myPointInterface dc3 = ((o1, o2) -> Math.sqrt(Math.pow(((Mpoint)o1).getX() - ((Mpoint)o2).getX(), 2) +
                Math.pow(((Mpoint)o1).getY() - ((Mpoint)o2).getY(), 2)));

        System.out.println("Distance between point1 and point2 using Lambda expression: " + dc3.calculate(point1, point2));
        Mpoint p1=new Mpoint(3.3,7.6);
        Mpoint p2 = new Mpoint(7.4,6.7);
        System.out.println(p1.equals(p2));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
