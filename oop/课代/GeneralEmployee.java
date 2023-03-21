package homework7;

public class GeneralEmployee extends  Employee {
    private int job;//岗位
    private double jobwage;//岗位工资

    public GeneralEmployee(String num, String name, String sex, int age, String professionaltitle, String educationbackground, String department, boolean partymemeber, int job) {
        super(num, name, sex, age, professionaltitle, educationbackground, department, partymemeber);
        this.job = job;
        setJobwage();
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
        setJobwage();
    }

    public double getJobwage() {
        return jobwage;
    }

    private void setJobwage() {
        switch (job) {
            case 1:
                jobwage = 2000;
                break;
            case 2:
                jobwage = 1800;
                break;
            case 3:
                jobwage = 1500;
                break;
            case 4:
                jobwage = 1200;
                break;
            case 5:
                jobwage = 1000;
                break;
        }
    }

    @Override
    public double salary() {
        return getBasicsalary() + jobwage;
    }

    public void showfInfo() {
        super.showfInfo();
        System.out.println("岗位："+job);
        System.out.println("岗位工资："+jobwage);
    }
}