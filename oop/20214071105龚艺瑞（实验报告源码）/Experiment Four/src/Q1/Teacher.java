package Q1;

public class Teacher extends Person{
    String ProfessionalTitle,EducationBackground;

    public String getProfessionalTitle() {
        return ProfessionalTitle;
    }

    public void setProfessionalTitle(String ProfessionalTitle) {
        this.ProfessionalTitle = ProfessionalTitle;
    }

    public String getEducationBackground() {
        return EducationBackground;
    }

    public void setEducationBackground(String EducationBackground) {
        this.EducationBackground = EducationBackground;
    }
    @Override
    public String getInfo() {
        return "姓名:" + name + "\t年龄:" + age + "\t职称:" + ProfessionalTitle+"\t学历："+EducationBackground;
    }

}
