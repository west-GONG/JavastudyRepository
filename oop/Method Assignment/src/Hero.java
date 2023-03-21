public class Hero {
    String name;
    int power=100;
    public void Walking() {//行走方法
        if (power==0) {
            System.out.println("不能行走，英雄已死亡！");
        } else {
            System.out.println("此英雄，正在前进......");
        }
    }
    public int Blood(int n) {//补血方法
        int nPower=0;
        if(power!=100){
            nPower=n+power;
            if (nPower>=100 ) {nPower = 100;}
        }else {
            System.out.println("血量已满!");
        }
        return nPower;
    }
    public int Harm(int n){//伤害方法,n为伤害次数
        int attackValue=10;
        int nPower = 0;
        for(int i=0;i<=n;i++){
            power-=attackValue;
        }
        if (power<=0) {
            power=0;
        }
        nPower=power;
        System.out.println("现在血量是"+nPower);
        return nPower;
    }

    public String getName(String name) {//获取名字方法
        return name;
    }

    public String setName(String name1) {//修改名字方法
        name=name1;
        return name;
    }

    public void Fight(String name,String name1){//战斗方法
        System.out.println(name+"正在与"+name1+"战斗中!");
    }
}
