public class Saler extends Employee{
     double DeductRate=0.05;
     double PersonSaleAmount;
     double JobWage=200;
    public Saler() {

    }

    public Saler(String num, String name, String sex, int age, String professionalTitle, String educationBackground,
                 String department, boolean isPartymember,double personSaleAmount) {
        super(num, name, sex, age, professionalTitle, educationBackground,department,isPartymember);
        PersonSaleAmount = personSaleAmount;
    }

    public double getDeductRate() {
        return DeductRate;
    }

    public double getPersonSaleAmount() {
        return PersonSaleAmount;
    }

    @Override
    public double getJobWage() {
        return JobWage;
    }

    @Override
    public double actualSalary() {
        double actualSaleAmount=getBasicSalary()+getJobWage()+getDeductRate()*getPersonSaleAmount();
        return actualSaleAmount;
    }

    @Override
    public void showSalary() {
        System.out.println("员工编号"+"\t"+"员工姓名"+"\t"+"员工职称"+"\t"+"基本工资" +"\t"+"岗位工资"+"\t"+"提成比例"+"\t"+
                "个人销售额"+"\t"+"实发工资");
        System.out.println(getNum()+"\t\t"+getName()+"\t\t"+getProfessionalTitle()+"\t\t"+getBasicSalary()+"\t"+
                getJobWage()+"\t"+getDeductRate()+"\t"+getPersonSaleAmount()+"\t\t"+actualSalary());
    }
}
