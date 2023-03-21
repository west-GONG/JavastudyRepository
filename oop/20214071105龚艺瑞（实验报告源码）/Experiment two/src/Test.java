public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("001","龚","男",20,"高级",
                "本科","开发部",false);
        employee1.setJobWage(2000);
        employee1.setProfessionalTitle("高级");
        employee1.showInformation();
        employee1.showInformation(2003,1,24);
        employee1.actualSalary();
        employee1.showSalary();
    }
}
