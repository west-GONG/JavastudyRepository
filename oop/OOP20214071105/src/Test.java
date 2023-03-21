public class Test {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("*     客房管理系统\t   *");
        System.out.println("*    制作人：龚艺瑞\t   *");
        System.out.println("************************");
        Function f=new Function();
        while(true) {
            int choose=menu.show();
            //选择操作
            f.judge(choose);
            //进一步处理
        }
    }
}
