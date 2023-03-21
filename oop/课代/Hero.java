package lx21_1;

public class Hero {
    //定义成员变量
    int power=100;
    String name;

    //定义成员方法，行为
    //行走
    public void walk(){
        if(power==0)
            System.out.println(name+"不能行走，已死亡！");
        else
            System.out.println(name+"正在行走...");
    }
    //补血
    public void addPower(int n){
        power+=n;
        if(power>100)power=100;
    }
    //伤害
    public void hurt(){
        power-=10;
        if(power<0)power=0;
    }
    //getName
    public String getName(){
        return name;
    }
    //setName
    public void setName(String name1){
        name=name1;
    }
    //战斗
    public void fight(Hero hero){//有两英雄，this:第一个  hero:第二个
        System.out.println(name+"与"+hero.getName()+"正在战斗中...");
    }
    public void show(){
        System.out.println("name:"+name+"  power:"+power);
    }

}
