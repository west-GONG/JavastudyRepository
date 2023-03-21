public class Question4 {
    public static void main(String[] args) {
        int a=0;
        System.out.println("求出从公元开始到公元3000之内的所有闰年");
        for(int i=1;i<=3000;i++){
            if((i%4==0 && i%100!=0)||i%400==0){
                a++;
            }
        }
        System.out.println("从公元开始到公元3000之内的所有闰年总数为"+a);
    }
}
