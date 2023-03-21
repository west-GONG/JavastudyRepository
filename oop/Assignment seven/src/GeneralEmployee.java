public class GeneralEmployee extends staff{
    double jobwage=1000;
    int jobwageRank=5;

    public GeneralEmployee(String num, String name, String sex, int age, String professionaltitle,
                           String educationbackground, String departyember,String ispartymember,int jobwageRank){
        super(num,name,sex,age,professionaltitle,educationbackground,departyember,ispartymember);
        this.jobwage = setJobwage(jobwageRank);
        this.jobwageRank = jobwageRank;
    }

    public double getJobwageRank() {
        return jobwageRank;
    }

    public void setJobwageRank(int jobwageRank) {
        this.jobwageRank = jobwageRank;
    }

    public double setJobwage(double jobwageRank) {
        if (jobwageRank==1) {
            this.jobwage=2000;
        }
        if (jobwageRank==2) {
            this.jobwage = 1800;
        }
        if (jobwageRank==3) {
            this.jobwage=1500;
        }
        if (jobwageRank==4) {
            this.jobwage=1200;
        }
        if (jobwageRank==5) {
            this.jobwage=1000;
        }
        return this.jobwage;
    }

    public double getJobwage() {
        return jobwage;
    }

    @Override
    public double getSalary() {
      return getBasicSalary()+getJobwage();
    }
}
