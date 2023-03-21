public class tiger extends Animal{
    public tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void playing() {
        System.out.println(getName() + "一扑一掀一剪正在玩耍");
    }

    @Override
    public void strolling() {
        System.out.println(getName() + "正在缓慢行走溜达");
    }

    @Override
    public void breaking() {
        System.out.println(getName() + "正在趴着休息");
    }

    @Override
    public void happy() {
        System.out.println(getName() + "发出喷喷的鼻音示好，表示很开心");
    }

    @Override
    public void showIform() {
        System.out.println("这只老虎的名字是"+getName()+"岁数是"+getAge());
    }

    @Override
    public void eat(Food food, int a) {
        food.getFood(a);
        System.out.println(getName()+"正在吃着"+food.getName());
    }
}
