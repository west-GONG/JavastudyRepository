

public class student {
    String name;
    int age;
    public static void main(String[] args) {
        student one = new student();
        one.age=0;
        one.name=null;
        one.getAge(20);
        one.getName("张三");
        one.speak();
        one.changeAge(18);
        one.changeName("李四");
        one.speak();

    }
    public void speak(){
        System.out.println("我是学生，叫"+name+"今年"+age+"岁！");
    }
    public void changeName(String name1){
        name =name1;
    }
    public void changeAge(int age1){
        age=age1;
    }
    public String getName(String name2){
        name = name2;
        return name;
    }
    public int getAge(int age2){
        age = age2;
        return age;
    }
}
