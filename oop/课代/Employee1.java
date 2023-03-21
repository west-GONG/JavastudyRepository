package homework7;

public abstract class Employee {
    //编号(num)、姓名(name)、性别（sex）、年龄（age）、职称（professionaltitle）、学历(educationbackground)、
    // //所在部门（department）、是否党员（ispartymember）
    private String num;
    private String name;
    private String sex;
    private int age;
    private String professionaltitle="初级";
    private String educationbackground;
    private  String department;
    private boolean partymemeber;
    private double basicsalary;

    public Employee(String num, String name, String sex, int age, String professionaltitle, String educationbackground, String department, boolean partymemeber) {
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.professionaltitle = professionaltitle;
        this.educationbackground = educationbackground;
        this.department = department;
        this.partymemeber = partymemeber;
        setBasicsalary();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfessionaltitle() {
        return professionaltitle;
    }

    public void setProfessionaltitle(String professionaltitle) {
        this.professionaltitle = professionaltitle;
        setBasicsalary();
    }

    public String getEducationbackground() {
        return educationbackground;
    }

    public void setEducationbackground(String educationbackground) {
        this.educationbackground = educationbackground;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isPartymemeber() {
        return partymemeber;
    }

    public void setPartymemeber(boolean partymemeber) {
        this.partymemeber = partymemeber;
    }

    public double getBasicsalary() {
        return basicsalary;
    }

    private void setBasicsalary() {
        switch (professionaltitle){
            case "初级":basicsalary=3000;break;
            case "中级":basicsalary=4000;break;
            case "高级":basicsalary=5000;break;
        }
    }
    public abstract double salary();
    public void showfInfo(){
        System.out.println("编号："+num);
        System.out.println("姓名："+name);
        System.out.println("性别："+sex);
        System.out.println("年龄："+age);
        System.out.println("职称："+professionaltitle);
        System.out.println("学历："+educationbackground);
        System.out.println("部门："+department);
        System.out.println("实发工资："+salary());
        System.out.println("基本工资："+basicsalary);
    }
}
