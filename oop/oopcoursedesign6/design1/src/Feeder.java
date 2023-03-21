public class Feeder {
    private String name;

    public void speak(){
        System.out.println("欢迎来到动物园,希望你玩的开心！");
        System.out.println("我是饲养员"+getName());
    }

    public void feed(Animal a,Food f,int b){
        a.eat(f,b);
        a.happy();
    }

    public Feeder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
