public class SaleManager extends Saler{
    double totalSales;
    double commissionPercentage=0.05;

    public double getTotalSales() {
        return totalSales;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public SaleManager() {

    }

    public SaleManager(String num, String name, String sex, int age, String professionalTitle, String
            educationBackground, String department, boolean isPartymember, double personSaleAmount,
                       double totalSales) {
        super(num, name, sex, age, professionalTitle, educationBackground, department, isPartymember, personSaleAmount);
        this.totalSales = totalSales;
    }

    @Override
    public double actualSalary() {
        double actualSales=getBasicSalary()+getJobWage()+getDeductRate()*getDeductRate()+getCommissionPercentage()*getTotalSales();
        return actualSales;
    }

    @Override
    public void showSalary() {
        System.out.println("员工编号"+"\t"+"员工姓名"+"\t"+"员工职称"+"\t"+"基本工资" +"\t"+"岗位工资"+"\t"+"提成比例"+"\t"+
                "个人销售额"+"\t"+"经理提成比例"+"\t"+"管理部门总销售额"+"\t"+"实发工资");
        System.out.println(getNum()+"\t\t"+getName()+"\t\t"+getProfessionalTitle()+"\t\t"+getBasicSalary()+"\t"+
                getJobWage()+"\t"+getDeductRate()+"\t"+getPersonSaleAmount()+"\t\t"+getCommissionPercentage()+"\t\t"+
                getTotalSales()+"\t\t\t"+actualSalary());
    }
}
