public class Test {
    public static void main(String[] args) {
        Employee e1=new Employee("001","龚","男",20,"高级",
                "本科","开发部",false);
        e1.setJobWage(2000);
        e1.setProfessionalTitle("高级");
        e1.showInformation();
        e1.showInformation(2003,1,24);
        e1.actualSalary();
        e1.showSalary();
        Saler s1=new Saler("001","艺","男",20,"中级",
                "本科","销售部",true,20000);
        s1.setProfessionalTitle("中级");
        s1.actualSalary();
        s1.showSalary();
        SaleManager m1=new SaleManager("001","艺","男",20,"中级",
                "本科","销售部",true,20000,40000);
        m1.setProfessionalTitle("中级");
        m1.actualSalary();
        m1.showSalary();
    }
}
