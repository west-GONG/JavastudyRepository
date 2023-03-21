public class dolphin extends Animal{
    public dolphin(String name,int age) {
        super(name, age);
    }

    @Override
    public void playing() {
        System.out.println(getName()+"在水面翻腾玩耍");
    }

    @Override
    public void strolling() {
        System.out.println(getName()+"在水面摇摆闲逛溜达");
    }

    @Override
    public void breaking() {
        System.out.println(getName()+"在水面漏出肚皮休息");
    }

    @Override
    public void happy() {
        System.out.println(getName()+"开心地跳出水面");
    }

    @Override
    public void showIform() {
        System.out.println("这只小海豚的名字是"+getName()+"岁数是"+getAge());
    }

    @Override
    public void eat(Food food,int a) {
        food.getFood(a);
        System.out.println(getName()+"正在吃着"+food.getName());
    }
}
