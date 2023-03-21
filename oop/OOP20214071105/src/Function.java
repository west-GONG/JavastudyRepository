import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    private ArrayList<Customer> customers=new ArrayList<>();
    private customerManger customerManger=new customerManger( customers);

    private ArrayList<Room>rooms=new ArrayList<>();
    private roomManger roomManger = new roomManger(rooms);

    private ArrayList<openClose>openCloses=new ArrayList<>();

    private openCloseManger openCloseManger=new openCloseManger();
    public void judge(int c) {
        switch (c) {
            case 1:
                //客房添加
                fun1_Add(false);
                break;
            case 2:
                //客户添加
                fun1_Add(true);
                break;
            case 3:
                //客房修改
                fun2_set(false);
                break;
            case 4:
                //客户修改
                fun2_set(true);
                break;
            case 5 :
                //客房删除
                fun3_Delete(false);
                break;
            case 6 :
                //客户删除
                fun3_Delete(true);
                break;
            case 7 :
                fun4_Query(false);
                break;
            case 8 :
                fun4_Query(true);
                break;
            case 9 :
                fun5_open();
                break;
            case 10 :
                fun6_close();
                break;
            case 0:
                //保存退出
            default:
                fun0_Exit();
        }
    }
    public  void fun0_Exit() {
        System.out.println("-----操作成功，谢谢使用！-----");
        System.exit(0);
    }

    public  void fun1_Add(boolean diff){
        Scanner sc = new Scanner(System.in);
        if (diff) {
            System.out.println("现执行客户添加操作");
            Customer customer=new Customer();
            System.out.println("请输入客户名字");
            customer.setName(sc.next());
            System.out.println("请输入第客户身份证");
            customer.setIdCard(sc.next());
            System.out.println("请输入第客户手机号");
            customer.setPhone(sc.nextLong());
            System.out.println("请输入客户开房时长");
            customer.setTime(sc.nextInt());
            customerManger.addCustomer(customer);
            System.out.println("姓名"+"\t\t"+"身份证号"+"\t\t\t\t\t"+"手机号"+"\t\t\t\t"+"开房时间");
            System.out.println(customer.getName()+"\t\t"+customer.getIdCard()+"\t\t\t"+customer.getPhone() +
                    "\t\t\t\t"+customer.getTime());
            System.out.println("*******************************************************");
            System.out.println("是否继续添加");
        }else {
            System.out.println("现执行客房添加操作");
            Room room = new Room();
            System.out.println("请输入房间id");
            room.setId(sc.next());
            System.out.println("请输入房间类型");
            room.setType(sc.next());
            System.out.println("请输入房间价格");
            room.setPrice(sc.nextDouble());
            System.out.println("请输入房间状态");
            room.setSta(sc.next());
            roomManger.addRoom(room);
            System.out.println("房间编号"+"\t\t"+"房间类型"+"\t\t"+"房间价格"+"\t\t"+"房间状态");
            System.out.println(room.getId()+"\t\t\t"+room.getType()+"\t\t\t"+room.getPrice()+"\t\t\t"+room.isSta());
            System.out.println("*******************************************************");
            System.out.println("是否继续添加");
        }
        System.out.println("信息添加成功");
    }

    public  void fun2_set(boolean diff){
        Scanner sc = new Scanner(System.in);
        if (diff) {
            System.out.println("现执行客户修改操作,选择要进行查询的类型，1-姓名---2-电话");
            int a = sc.nextInt();
            switch (a){
                case 1 :
                    System.out.println("请输入要查询的名字");
                    String name = sc.next();
                    System.out.println("请输入要修改的信息");
                    System.out.println("1-姓名，2-身份证号，3-手机号，4-开房时长");
                    int c=sc.nextInt();
                    switch (c) {
                        case 1 :
                            System.out.println("请输入要修改的姓名");
                            customerManger.reviseCustomer(name,c);
                            break;
                        case 2 :
                            System.out.println("请输入要修改的身份证号");
                            customerManger.reviseCustomer(name,c);
                            break;
                        case 3 :
                            System.out.println("请输入要修改的电话");
                            customerManger.reviseCustomer(name,c);
                            break;
                        case 4 :
                            System.out.println("请输入要修改的开房时间");
                            customerManger.reviseCustomer(name,c);
                            break;
                        default :
                            System.out.println("输入错误");
                    }
                    break;
                case 2 :
                    System.out.println("请输入要查询的电话号码");
                    long phone= sc.nextLong();
                    System.out.println("请输入要修改的信息");
                    System.out.println("1-姓名，2-身份证号，3-手机号，4-开房时长");
                    int b= sc.nextInt();
                    switch (b) {
                        case 1 :
                            System.out.println("请输入要修改的姓名");
                            customerManger.reviseCustomer(phone,b);
                            break;
                        case 2 :
                            System.out.println("请输入要修改的身份证号");
                            customerManger.reviseCustomer(phone,b);
                            break;
                        case 3 :
                            System.out.println("请输入要修改的电话");
                            customerManger.reviseCustomer(phone,b);
                            break;
                        case 4 :
                            System.out.println("请输入要修改的开房时间");
                            customerManger.reviseCustomer(phone,b);
                            break;
                        default :
                            System.out.println("输入错误");
                    }
                    break;
                default :
                    System.out.println("输入错误重新输入");
            }
        }else {
            System.out.println("现执行客房修改操作，请输入要查询的房间编号");
            String id = sc.next();
            System.out.println("请输入要修改的信息");
            System.out.println("1-编号，2-类型，3-单日价格，4-状态");
            int c= sc.nextInt();
            switch (c){
                case 1:
                    System.out.println("请输入修改的房间编号");
                    roomManger.reviseRoom(id,c);
                    break;
                case 2 :
                    System.out.println("请输入修改的房间类型");
                    roomManger.reviseRoom(id,c);
                    break;
                case 3 :
                    System.out.println("请输入修改的房间的单日价格");
                    roomManger.reviseRoom(id,c);
                    break;
                case 4 :
                    System.out.println("请输入修改的房间的状态");
                    roomManger.reviseRoom(id,c);
                    break;
                default :
                    System.out.println("输入错误");
            }
        }
        System.out.println("信息修改成功");
    }

    public  void fun3_Delete(boolean diff) {
        Scanner sc = new Scanner(System.in);
        if (diff) {
            System.out.println("执行客户删除操作,请输入客户姓名");
            String name = sc.next();
            customerManger.deleteCustomers(name);
        }else {
            System.out.println("执行客房删除操作,请输入客房编号");
            String id = sc.next();
            roomManger.deleteRooms(id);
        }
    }

    public  void fun4_Query(boolean diff){
        if (diff) {
            customerManger.queryCustomers(customers);
        }else {
            roomManger.queryRooms(rooms);
        }
    }

    public  void fun5_open(){
        openClose openClose=new openClose();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开房编号");
        String num=sc.next();
        System.out.println("请输入开房人数");
        int a=sc.nextInt();
        String[] names = new String[a];
        for (Room room:rooms){
            if (room.getId().equals(num)) {
                openClose.setNum(num);
                System.out.println("请修改房间状态");
                fun2_set(false);
                System.out.println("请输入开房人姓名");
                for (int i=0;i<names.length; i++){
                    names[i] = sc.next();
                }
                openClose.setName(names);
                openCloseManger.open(openClose);
            }
        }
        System.out.println("无房间信息，请新建房间信息");
        fun1_Add(false);
        openClose.setNum(num);
        System.out.println("请输入开房人姓名");
        for (int i=0;i<names.length; i++){
            names[i] = sc.next();
        }
        openClose.setName(names);
        openCloseManger.open(openClose);
    }

    public  void fun6_close(){
        Scanner sc = new Scanner(System.in);
        System.out.println("执行退房操作，输入退房编号");
        String num = sc.next();
        openCloseManger.close(num);
    }
}
