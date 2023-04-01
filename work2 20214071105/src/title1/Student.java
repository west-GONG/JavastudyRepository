package title1;

public class Student {
    private String id;        // 学号
    private String name;      // 姓名
    private String gender;    // 性别
    private String major;     // 专业
    private int grade;        // 年级

    public Student(String id, String name, String gender, String major, int grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.major = major;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public int getGrade() {
        return grade;
    }

}
