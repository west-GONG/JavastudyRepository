package Q1;

public class Student extends Person{
    private String school;

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String getInfo() {
        return "姓名:" + name + "\t年龄:" + age + "\t所在学校:" + school;
    }

}
