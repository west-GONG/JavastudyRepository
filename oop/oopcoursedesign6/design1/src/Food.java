public class Food implements Ifood{
    private String name;
    private int amount;
    @Override
    public void getFood(int amount) {
        this.amount -= amount;
    }

    @Override
    public void addFood(int amount) {
        this.amount += amount;
    }

    public void showAmount() {
        System.out.println(getName()+"现在数目为"+getAmount());
    }

    public Food(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
