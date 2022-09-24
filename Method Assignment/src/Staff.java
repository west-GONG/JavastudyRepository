public class Staff {
    String jobNumber;
    String name;
    String sex;
    int age;
    String education;
    String Department;
    int salary;
    String isPartMember;
    public Staff(String jobNumber,String name,String sex,int age,String education,
                 String Department,int salary,String isPartMember){
        super();
        this.jobNumber = jobNumber;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.salary = salary;
        this.isPartMember = isPartMember;
        this.Department = Department;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
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

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department=Department;
    }

    public String getIsPartMember() {
        return isPartMember;
    }

    public void setIsPartMember(String isPartMember) {
        this.isPartMember = isPartMember;
    }
}
