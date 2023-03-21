import java.util.Scanner;

public class staffTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入普通员工的人数");
        int number1=sc.nextInt();
        GeneralEmployee[] generalEmployee = new GeneralEmployee[number1];
        System.out.println("输入销售员工的人数");
        int number2=sc.nextInt();
        SaleEmployee[] saleEmployee = new SaleEmployee[number2];
        int a;
        do{
            System.out.println("欢迎使用员工工资管理系统");
            System.out.println("0-退出         1-普通员工");
            System.out.println("2-销售员工    3-打印工资表");
            System.out.println("输入选项");
            a=sc.nextInt();
            switch (a){
                case 1:
                    for(int i = 0; i <generalEmployee.length; i++){
                        System.out.println("请输入第"+(i+1)+"个员工编号:");
                        String num = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工姓名:");
                        String name = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工性别:");
                        String sex = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工年龄:");
                        int age = sc.nextInt();
                        System.out.println("请输入第"+(i+1)+"个员工职称:");
                        String professionaltitle= sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工学历:");
                        String educationbackground= sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工所在部门:");
                        String departyember= sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工是否党员:");
                        String ispartymember= sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工岗位等级:");
                        int jobwageRank= sc.nextInt();
                        GeneralEmployee generalEmployees=new GeneralEmployee(num,name,sex,age,professionaltitle,educationbackground,
                                departyember,ispartymember,jobwageRank);
                        generalEmployee[i]=generalEmployees;
                    }break;
                case 2:
                    for(int i = 0; i <saleEmployee.length; i++){
                        System.out.println("请输入第"+(i+1)+"个员工编号:");
                        String num = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工姓名:");
                        String name = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工性别:");
                        String sex = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工年龄:");
                        int age = sc.nextInt();
                        System.out.println("请输入第"+(i+1)+"个员工职称:");
                        String professionaltitle= sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工学历:");
                        String educationbackground= sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工所在部门:");
                        String departyember= sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工是否党员:");
                        String ispartymember= sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工销售额:");
                        double personsaleamount= sc.nextDouble();
                        System.out.println("请输入第"+(i+1)+"个员工销售额提成比例:");
                        double deductrate= sc.nextDouble();
                        SaleEmployee saleEmployees=new SaleEmployee(num,name,sex,age,professionaltitle,educationbackground,
                                departyember,ispartymember,personsaleamount,deductrate);
                        saleEmployee[i]=saleEmployees;
                    }break;
                case 3:
                    for (int i = 0; i < generalEmployee.length;i++){
                        System.out.println("员工姓名:" + generalEmployee[i].getName() + "\t\t" + "员工薪资:" + generalEmployee[i].getSalary());
                    }
                    for (int i = 0; i < saleEmployee.length;i++){
                        System.out.println("员工姓名:" + saleEmployee[i].getName() + "\t\t" + "员工薪资:" + saleEmployee[i].getSalary());
                    }break;
                case 0:
                    break;
                default:
                    System.out.println("您的输入有误!请重新输入");
            }
        }while(a!=0);
    }
}
