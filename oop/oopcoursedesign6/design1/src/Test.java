public class Test {
    public static void main(String[] args) {
        Feeder f1=new Feeder("龚");
        f1.speak();
        Food o1=new Food("肉",30);
        Food o2 = new Food("豚粮",20);
        Food o3 = new Food("虎粮",25);
        Food o4 = new Food("孔雀粮",40);
        Animal d=new dolphin("Bill",4);
        d.showIform();
        d.playing();
        d.strolling();
        f1.feed(d,o1,4);
        d.breaking();
        o1.showAmount();
        o1.addFood(7);
        o1.showAmount();
        Animal p=new peacock("Otur",4);
        p.showIform();
        p.playing();
        p.strolling();
        f1.feed(p,o4,10);
        p.breaking();
        o4.showAmount();
        o4.addFood(40);
        o4.showAmount();
        Animal t=new tiger("小黄",10);
        t.showIform();
        t.playing();
        t.strolling();
        f1.feed(t,o1,10);
        t.breaking();
        f1.feed(t, o3, 10);
        o1.showAmount();
        o3.showAmount();
        o1.addFood(30);
        o3.addFood(40);
        o1.showAmount();
        o3.showAmount();
    }
}
