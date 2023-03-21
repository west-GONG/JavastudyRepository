public class Question9 {
    public static void main(String[] args) {
        //定义重载方法Area，分别用来求圆形、三角形和矩形面积。
        Question9 question9 = new Question9();
        System.out.println("圆的面积为"+question9.Area(2));
        System.out.println("矩形的面积为"+question9.Area(2,3));
        question9.Area(3,4,5);
    }
    public double Area(double r){
        double area=Math.PI*r*r;
        return area;
    }
    public double Area(double a,double b){
        double area=a*b;
        return area;
    }
    public void Area(double a, double b,double c) {
        double area,p;
        if(a+b>c&&a+c>b&&b+c>a)
        {
            System.out.println("构成三角形");
            p=(a+b+c)/2;
            area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("三角形面积为"+area);
        } else {
            area=-1;
            System.out.println("构不成三角形");
        }
    }
}
