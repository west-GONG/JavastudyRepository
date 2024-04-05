package gyr.study.design;

import java.util.Objects;

//原型模式设计时（深浅拷贝），需要实现cloneable接口并重写Object类的clone（）方法
//浅拷贝没有对其中的类类型的对象构成成员进行重新实例化，导致对类型对象进行重新赋值，原对象与拷贝对象的类类型成员的值保持一样
public class Student implements Cloneable{
    private String name;
    private int age;
    //非基本数据（类类型）
    private Address schoolAddress;
    public Student() {
    }

    public Student (Student student){
        this.name = student.name;
        this.age = student.age;
        this.schoolAddress = student.schoolAddress;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Address schoolAddress) {
        this.name = name;
        this.age = age;
        this.schoolAddress = schoolAddress;
    }

    public Address getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(Address schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(schoolAddress, student.schoolAddress);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolAddress=" + schoolAddress +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, schoolAddress);
    }

    //浅拷贝
//    @Override
//    protected Student clone() throws CloneNotSupportedException {
//        return (Student) super.clone();
//    }

        @Override
    protected Student clone() throws CloneNotSupportedException {
        //深拷贝
        Student student =  (Student) super.clone();
        Address schoolAddress = student.getSchoolAddress().clone();
        student.setSchoolAddress(schoolAddress);
        return  student;
    }
}
