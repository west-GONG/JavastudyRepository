package gyr.study.design;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address schoolAddress = new Address("大庆","黑龙江八一农垦大学");
        Student student = new Student("张三",10,schoolAddress);
        Student student1 = student.clone();
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student == student1);
        student.setName("李四");
        student.getSchoolAddress().setCity("哈尔滨");
        student.getSchoolAddress().setStreet("哈尔滨工业大学");
        System.out.println(student);
        System.out.println(student1);

        Student student2 = new Student(student);
        student2.setName("王五");
        student2.getSchoolAddress().setStreet("西大直街");
        System.out.println(student2);
    }
}
