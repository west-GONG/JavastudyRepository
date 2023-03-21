package lx21_1;

public class Test {
    public static void main(String[] args) {
//模板

        String s = new String("lasasdl");//构造方法

        Employee e1 = new Employee();
        e1.age = 25;
        e1.eno = "01";
        e1.name = "张三";
        e1.sex = "男";

        // e1.introduce();
        Employee e2 = new Employee();
        e2.eno = "02";
        e2.name = "李四";
        e2.sex = "女";
        e2.age = 22;


        // e2.introduce();
        Employee abc = new Employee();
        abc.eno = "03";
        abc.name = "王五";
        abc.sex = "男";
        abc.age = 28;
        // e3.introduce();

        //定义数组管理员工
        Employee[] employees = new Employee[3];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = abc;

        for (Employee e : employees)
            e.introduce();

//        DataProcessing dp=new DataProcessing();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Arrays.toString(dp.lottery36_7()));
//        }
//        for(int x:dp.lottery36_7())
//            System.out.print(x+" ");
        /*Hero hero1=new Hero();
        hero1.setName("黛安娜");
        hero1.show();
        Hero hero2=new Hero();
        hero2.setName("亚索");
        hero2.show();
        hero1.hurt();
        hero1.show();
        hero2.show();
        hero2.walk();*/


        /*DataProcessing dp=new DataProcessing();
        //输出1-100间的所有素数
        for (int i =1; i < 100; i++) {
            if(dp.isPrime(i))
                System.out.print(i+" ");
        }
        System.out.println();
        String s="  Process  finished   with   exit   code   ";
        System.out.println(dp.wordsOfSentence(s));
        dp.yhsj(10);*/
    }
}
