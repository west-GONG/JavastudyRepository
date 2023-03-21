

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Function {//功能类

    public static void judge(int c) {
        switch (c) {
            case 1:
                //收入录入
                fun1_Add(false);
                break;
            case 2:
                //支出录入
                fun1_Add(true);
                break;
            case 3:
                //收支查询
                fun3_Query();
                break;
            case 4:
                //记录删除
                fun4_Delect();
                break;
            case 5 :
                //修改金额
                fun5_Set(false);
                break;
            case 6 :
                //修改信息
                fun5_Set(true);
                break;
            case 0:
                //保存退出
            default:
                fun0_Exit();
        }
    }

    public static void fun0_Exit() {
        System.out.println("-----操作成功，谢谢使用！-----");
        System.exit(0);
    }

    /*功能1.收入录入（diff标志位为false）*/
    /*功能2.支出录入（diff标志位为true）*/
    public static void fun1_Add(boolean diff) {
        double money=0;
        String date;
        String info;
        Scanner sc = new Scanner(System.in);
        /*输入金额*/
        if (diff) {
            System.out.println("执行支出录入过程，请输入支出金额（不用写负号）：");
        } else {
            System.out.println("执行收入录入过程，请输入收入金额：");
        }
        money=ExceptionAll.money(money);

        /*输入说明信息*/
        System.out.println("请输入记录的说明信息：");
        info= sc.next();

        /*获取录入日期*/
        Date d = new Date();
        //根据当前的默认毫秒值创建日期对象,
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //设置日期格式
         date = sdf.format(d);
         //获取当前系统时间
        /*确认输入*/
        if (String.valueOf(money).length() <= 6) {
            //根据金额长度不同自动调整表格列宽
            System.out.println("金额\t\t操作日期\t\t\t\t说明信息");
            if (diff) {
                System.out.println("-" + money + "\t" + date + "\t\t" + info);
            } else {
                System.out.println("+" + money + "\t" + date + "\t\t" + info);
            }
            System.out.println("------------------------------------------------");
        } else {
            System.out.println("金额\t\t\t操作日期\t\t\t\t说明信息");
            if (diff) {
                System.out.println("-" + money + "\t" + date + "\t" + info);
            } else {
                System.out.println("+" + money + "\t" + date + "\t" + info);
            }
            System.out.println("------------------------------------------------");
        }
        /*录入信息*/
        if (diff) {
            money = -money;
        }
        Record.addNode(money, date, info);
        System.out.println("信息已成功录入！");
    }

    public static void fun3_Query() {
        int count= Record.getNonum();
        int[] num=new int[count];
        double[] money=new double[count];
        String[] date=new String[count];
        String[] info=new String[count];
        /*用数组分别接收所有的记录*/
        Record.printList(num, money, date, info);
        /*打印*/
        System.out.println("编号\t金额\t\t\t操作日期\t\t\t\t说明信息");
        for(int i=0;i<count;i++)
        {
            if(String.valueOf(money[i]).length()<=7) {
                if(money[i]>0){
                    System.out.println(num[i]+"\t"+money[i]+"\t\t"+date[i]+"\t"+info[i]);
                } else{
                    System.out.println(num[i]+"\t"+money[i]+"\t\t"+date[i]+"\t"+info[i]);
                }
            }
            else {
                if(money[i]>0){
                    System.out.println(num[i]+"\t"+money[i]+"\t"+date[i]+"\t"+info[i]);
                } else{
                    System.out.println(num[i]+"\t"+money[i]+"\t"+date[i]+"\t"+info[i]);
                }
            }
        }
        System.out.println("当前余额："+ Record.getAllMoney());
    }

    public static void fun4_Delect() {
        System.out.println("请输入要删除的记录编号：");
        int num=0;
        num=ExceptionAll.num(num);
        if(Record.delectNode(num)) {
            System.out.println("删除"+num+"号记录成功！");
        } else{
            System.out.println("删除失败！没有找到编号记录！");
        }
    }

    public static void fun5_Set(boolean diff) {
        int num=0;
        double newMoney=0;
        String newIfo=null;
        int ch=0;
        Scanner sc = new Scanner(System.in);
        if (diff) {
            System.out.println("执行修改说明信息操作，请输入要修改的信息内容：");
            newIfo= sc.next();
            System.out.println("请输入要修改的记录编号：");
            num=ExceptionAll.num(num);
        }else {
            System.out.println("执行修改金额操作，请输入要修改的金额：");
            newMoney=ExceptionAll.money(newMoney);
            System.out.println("请输入选择修改的类型，1为修改为支出，2为修改为收入");
            ch=ExceptionAll.ch(ch);
            System.out.println("请输入要修改的记录编号：");
            num = ExceptionAll.num(num);
        }
        if (diff){
            if (Record.setNode(num,newIfo)){
                System.out.println("修改"+num+"号记录成功！");
            }else {
                System.out.println("修改失败！没有找到编号记录！");
            }
        }else {
            if (Record.setNode(num,newMoney,ch)){
                System.out.println("修改"+num+"号记录成功！");
            }else {
                System.out.println("修改失败！没有找到编号记录！");
            }
        }
    }
}
