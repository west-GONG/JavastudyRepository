public class Employee {
    private String Num;
    private String Name;
    private String Sex;
    private int Age;
    private String ProfessionalTitle;
    private String EducationBackground;
    private String Department;
    private boolean isPartymember;
    private double BasicSalary;
    private double JobWage;

    private Birthday birthday;
    int n=0;
    //创建对象的数量


    public Birthday getBirthday() {
        return new Birthday();
    }

    public String getNum() {
        return Num;
    }

    public String getName() {
        return Name;
    }

    public String getSex() {
        return Sex;
    }

    public int getAge() {
        return Age;
    }

    public String getProfessionalTitle() {
        return ProfessionalTitle;
    }

    public String getEducationBackground() {
        return EducationBackground;
    }

    public String getDepartment() {
        return Department;
    }

    public boolean getIsPartymember() {
        return isPartymember;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public double getJobWage() {
        return JobWage;
    }

    public void setSex(String sex) {
        String s1 = "男";
        String s2 = "女";
        if (s1.equals(sex)) {
            Sex=sex;
        } else if (s2.equals(sex)) {
            Sex = sex;
        }else {
            Sex=null;
            System.out.println("输入错误，请重新输入");
        }
    }

    public void setAge(int age) {
        if (age < 60&&age>20) {
            Age=age;
        }else {
            Age=0;
            System.out.println("输入错误，重新输入");
        }
    }

    public void setProfessionalTitle(String professionalTitle) {
        String s1="初级";
        String s2="中级";
        String s3="高级";
        if (s1.equals(professionalTitle)) {
            ProfessionalTitle = professionalTitle;
            setBasicSalary();
        } else if (s2.equals(professionalTitle)) {
            ProfessionalTitle = professionalTitle;
            setBasicSalary();
        }else if (s3.equals(professionalTitle)){
            ProfessionalTitle = professionalTitle;
            setBasicSalary();
        }else {
            ProfessionalTitle=null;
            System.out.println("输入错误，请重新输入");
        }
    }

    public void setBasicSalary() {
        switch (ProfessionalTitle){
            case "初级":BasicSalary=3000;break;
            case "中级":BasicSalary=4000;break;
            case "高级":BasicSalary=5000;break;
            default:
                System.out.println("error");break;
        }
    }

    public void setJobWage(double jobWage) {
        if(jobWage>=1000&&jobWage<=3000){
            JobWage=jobWage;
        }else {
            JobWage=0;
            System.out.println("输入错误，请重新输入");
        }
    }

    public Employee() {

    }

    public Employee(String num, String name, String sex, int age, String professionalTitle, String educationBackground,
                    String department, boolean isPartymember) {
        this.Num = num;
        this.Name = name;
        this.Sex = sex;
        this.Age = age;
        this.ProfessionalTitle = professionalTitle;
        this.EducationBackground = educationBackground;
        this.Department = department;
        this.isPartymember = isPartymember;
        n++;
    }

    public double actualSalary(){//计算实发工资
        double actualSalary;
        actualSalary=getBasicSalary()+getJobWage();
        return actualSalary;
    }
    public void showInformation(){
        Employee employee=new Employee();
        Birthday birth=employee.new Birthday();
        System.out.println("员工编号\t员工姓名\t员工性别\t员工年龄\t员工职称\t员工学历\t所在部门\t是否党员\n"+getNum()+"\t\t"+
                getName()+"\t\t"+getSex()+"\t\t"+getAge()+"\t\t"+getProfessionalTitle()+"\t\t"+getEducationBackground()+"\t\t"+
                getDepartment()+"\t"+getIsPartymember()+"\t");
    }
    public void showInformation(int a,int b,int c){
        Employee employee=new Employee();
        Birthday birth=employee.getBirthday();
        birth.setBirthday(a, b, c);
        System.out.println("员工编号\t员工姓名\t员工性别\t员工年龄\t员工职称\t员工学历\t所在部门\t是否党员\t员工生日\n"+getNum()+"\t\t"+
                getName()+"\t\t"+getSex()+"\t\t"+getAge()+"\t\t"+getProfessionalTitle()+"\t\t"+getEducationBackground()+"\t\t"+
                getDepartment()+"\t"+getIsPartymember()+"\t"+birth.getBirthday());
    }
    public void showSalary() {
        System.out.println("员工编号"+"\t"+"员工姓名"+"\t"+"员工职称"+"\t"+"基本工资" +"\t"+"岗位工资"+"\t"+"实发工资");
        System.out.println(getNum()+"\t\t"+getName()+"\t\t"+getProfessionalTitle()+"\t\t"+getBasicSalary()+"\t"+
                getJobWage()+"\t"+actualSalary());
    }
        public class Birthday{
            private int year;
            private int month;
            private int day;

            public int getYear() {
                return year;
            }

            public int getMonth() {
                return month;
            }

            public int getDay() {
                return day;
            }

            public void setBirthday(int year, int month, int day) {
                this.year = year;
                this.month = month;
                this.day = day;
            }
            public String getBirthday(){
                int a=getYear();
                int b = getMonth();
                int c = getDay();
                String strA=String.valueOf(a);
                String strB = String.valueOf(b);
                String strC = String.valueOf(c);
                String strD="年";
                String strE="月";
                String strF="日";
                StringBuilder sber = new StringBuilder();
                sber.append(strA).append(strD).append(strB).append(strE).append(strC).append(strF);
                String s=sber.toString();
                System.out.println(s);
                return s;
            }
        }
}
