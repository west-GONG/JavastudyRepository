public class peacock extends Animal{
    public peacock(String name, int age) {
        super(name, age);
    }

    @Override
    public void playing() {
        System.out.println(getName()+"正在拍打舒展翅膀玩耍");
    }

    @Override
    public void strolling() {
        System.out.println(getName()+"正在缓慢行走溜达");
    }

    @Override
    public void breaking() {
        System.out.println(getName()+"正站在枝头休息");
    }

    @Override
    public void happy() {
        System.out.println(getName()+"展翅高鸣叫表示自己很开心");
    }

    @Override
    public void showIform() {
        System.out.println("这只孔雀的名字是"+getName()+"岁数是"+getAge());
    }

    @Override
    public void eat(Food food, int a) {
        food.getFood(a);
        System.out.println(getName()+"正在吃着"+food.getName());
    }
}
