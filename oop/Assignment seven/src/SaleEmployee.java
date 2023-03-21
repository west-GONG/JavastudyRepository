public class SaleEmployee extends staff{
    double personsaleamount;
    double deductrate;//提成比例

    public SaleEmployee(String num, String name, String sex, int age,String professionaltitle,String educationbackground,
                        String departyember,String ispartymember,double personsaleamount,double deductrate){
        super(num,name,sex,age,professionaltitle,educationbackground,departyember,ispartymember);
        this.personsaleamount = personsaleamount;
        this.deductrate = setDeductrate(deductrate);
    }
    public double getPersonsaleamount() {
        return personsaleamount;
    }

    public double getDeductrate() {
        return deductrate;
    }

    public double setDeductrate(double deductrate) {
        this.deductrate = deductrate;
        return deductrate;
    }

    @Override
    public double getSalary() {
        return getBasicSalary()+getPersonsaleamount()*getDeductrate();
    }
}
