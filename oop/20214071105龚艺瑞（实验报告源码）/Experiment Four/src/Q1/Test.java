package Q1;

public class Test {
    public static void main(String[] args) {
        Person p1;
        Student s1,s2;
        Teacher t1;
        p1=new Person();
        s1=new Student();
        t1=new Teacher();
        p1=s1;
        t1=s1;
        s1=s2;
        t1=p1;
        s1=p1;
        s2=(Student)p1;
    }
    //第一条语句实现子类的对象赋值给父类的应用，而最后一条语句实现父类的对象赋值给子类的应用。
    //六条赋值语句，只有第一、六条可以实现，因为之间为继承关系，同时符合向下转型，向上转型原则，
    // 而第二条和第三条都不符合多态基本的条件：继承。
    //第四条和第五条这是不符合转型原则，向下转型，但是无第六条语句的强制转化，需要与提供的类型不一导致错误。
}
