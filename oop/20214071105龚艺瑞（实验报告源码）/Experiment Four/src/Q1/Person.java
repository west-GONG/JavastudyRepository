package Q1;

public class Person {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return "姓名: " + name + "\t年龄: " + age;
    }
}
