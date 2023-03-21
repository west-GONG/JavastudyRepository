public abstract class staff {
   private String num;
   private String name;
   private String sex;
   private int age;
   private String professionaltitle="初级";
   private String educationbackground;
   private String department;
   private String ispartymember;
   private double basicSalary;

   public  staff(){

   }

   public staff(String num, String name, String sex, int age,String professionaltitle,String educationbackground,
                String departyember,String ispartymember) {
       this.num = num;
       this.name = name;
       this.sex = sex;
       this.age = age;
       this.professionaltitle = professionaltitle;
       this.basicSalary=setBasicSalary();
       this.educationbackground=educationbackground;
       this.department = department;
       this.ispartymember = ispartymember;
   }
    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getProfessionaltitle() {
        return professionaltitle;
    }

    public String getEducationbackground() {
        return educationbackground;
    }

    public String getDepartment() {
        return department;
    }

    public String getIspartymember() {
        return ispartymember;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public String setProfessionaltitle(String Professionaltitle){
       this.professionaltitle=professionaltitle;
       return professionaltitle;
    }
    public void setBasicSalary(double basicSalary){
       this.basicSalary=basicSalary;
    }
    public double setBasicSalary() {
       String s1="初级";
       String s2="中级";
       String s3="高级";
        if(s1.equals(professionaltitle)){
           setBasicSalary(3000);
        }
        if(s2.equals(professionaltitle)){
            setBasicSalary(4000);
        }
        if (s3.equals(professionaltitle)){
            setBasicSalary(5000);
        }
        return this.basicSalary;
    }

    public abstract double getSalary();
}
