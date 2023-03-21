import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        String fun, id,name, workUnit, phone;
        addressBook.add(new Contacter("1","李龙威","18392837122","黑龙江八一农垦大学信电学院"));
        addressBook.add(new Contacter("2","刘桂阳","12732382326","东北石油大学石油工程学院"));
        addressBook.add(new Contacter("3","盛永生","17372938236","哈尔滨工程大学"));
        addressBook.add(new Contacter("4","高  军","13836961798","黑龙江八一农垦大学信电学院"));
        addressBook.add(new Contacter("5","于成江","18745679236","东北石油大学"));

        boolean isShowMenu = true;
        while (isShowMenu) {
            System.out.println("--------------------------------------");
            System.out.println("1 显示所有联系人      2 添加联系人");
            System.out.println("3 删除联系人          4 修改联系人");
            System.out.println("5 按姓名查询          6 按号码查询\"");
            System.out.println("0 退出");
            System.out.println("--------------------------------------");
            System.out.println("请输入功能编号(0-6)：");
            fun = sc.next();
            switch (fun) {
                case "1": {
                    addressBook.showAll();
                    break;
                }
                case "2": {
                    System.out.println("ID：");
                    id = sc.next();
                    System.out.println("姓名：");
                    name = sc.next();
                    System.out.println("号码：");
                    phone = sc.next();
                    System.out.println("单位：");
                    workUnit = sc.next();
                    addressBook.add(new Contacter(id,name, phone, workUnit));
                    break;
                }
                case "3": {
                    System.out.println("姓名：");
                    name = sc.next();
                    if (addressBook.findByName(name) != null)
                        addressBook.delete(name);
                    else
                        System.out.println("对不起，该联系人不存在！");
                    break;
                }
                case "4": {//修改联系人
                    System.out.println("输入要修改的联系人编号：");
                    id = sc.next();
                    Contacter contacter = addressBook.findById(id);
                    if (contacter != null) {
                        boolean ismodify;
                        System.out.println("姓名(Y/N)?");
                        name = sc.next().toUpperCase().equals("Y")?sc.next():contacter.getName();
                        System.out.println("电话(Y/N)?");
                        phone = sc.next().toUpperCase().equals("Y")?sc.next():contacter.getPhone();
                        System.out.println("单位(Y/N)?");
                        workUnit = sc.next().toUpperCase().equals("Y")?sc.next():contacter.getWorkUnit();
                        addressBook.edit(new Contacter(id,name,phone,workUnit));
                    } else {
                        System.out.println("对不起，此用户不存在！");
                    }
                    break;
                }
                case "5": {//按姓名查询
                    System.out.println("输入联系人姓名：");
                    name = sc.next();
                    Contacter contacter = addressBook.findByName(name);
                    if (contacter != null) {
                        System.out.println(contacter);
                    } else
                        System.out.println("对不起，无此联系人！");
                    break;
                }
                case "6": {//按号码查询
                    System.out.println("输入电话号码：");
                    phone = sc.next();
                    Contacter contacter = addressBook.findByPhoneNumber(phone);
                    if (contacter != null) {
                        System.out.println(contacter);
                    } else
                        System.out.println("对不起，无此联系人！");
                    break;
                }
                case "0": {
                    System.out.println("谢谢使用，再见！");
                    isShowMenu = false;
                    break;
                }

            }
        }
    }
}
