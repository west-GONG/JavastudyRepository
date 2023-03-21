import java.util.ArrayList;
import java.util.Scanner;

public class customerManger {
    private ArrayList<Customer> customers ;

    public customerManger() {
    }

    public customerManger(ArrayList<Customer> customers) {
        this.customers=customers;
    }

    public  void addCustomer(Customer customer){
            customers.add(customer);
    }

    public  void reviseCustomer(String name,int c){//名字查询，修改
        Scanner sc=new Scanner(System.in);
        for (Customer customer : customers){
            if (customer.getName().equals(name)) {
                switch (c) {
                    case 1 :
                        customer.setName(sc.next());
                        break;
                    case 2 :
                       customer.setIdCard(sc.next());
                        break;
                    case 3 :
                        customer.setPhone(sc.nextLong());
                        break;
                    case 4 :
                        customer.setTime(sc.nextInt());
                        break;
                    default :
                        System.out.println("输入错误");
                }
            }else {
                System.out.println("查找失败");
            }
        }
    }

    public void reviseCustomer(long phone,int c){//手机查询，修改
        Scanner sc=new Scanner(System.in);
        for (Customer customer : customers){
            if (customer.getPhone()==phone) {
                switch (c) {
                    case 1 :
                        customer.setName(sc.next());
                        break;
                    case 2 :
                        customer.setIdCard(sc.next());
                        break;
                    case 3 :
                        customer.setPhone(sc.nextLong());
                        break;
                    case 4 :
                        customer.setTime(sc.nextInt());
                        break;
                    default :
                        System.out.println("输入错误");
                }
            }else {
                System.out.println("查找失败");
            }
        }
    }

    public void deleteCustomers(String name) {
        for (int i=customers.size() - 1; i >= 0; i--){
            Customer customer = customers.get(i);
            if (customer.getName().equals(name)) {
                customers.remove(customer);
                System.out.println("删除成功");
            }
        }
    }

    public void queryCustomers(ArrayList<Customer> customers){
        System.out.println("姓名"+"\t\t"+"身份证号"+"\t\t\t\t\t"+"手机号"+"\t\t\t\t"+"开房时间");
        for (int i = 0; i < customers.size(); i++){
            Customer customer = customers.get(i);
            System.out.println(customer.getName()+"\t\t"+customer.getIdCard()+"\t\t\t"+customer.getPhone() +
                    "\t\t\t\t"+customer.getTime());
        }
    }
}
