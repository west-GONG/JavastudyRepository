
public class Customer {
    private String name;
    private String idCard;
    private long phone;

    private int time;

    public Customer() {
    }

    public Customer(String name, String idCard, long phone, int time) {
        this.name = name;
        this.idCard = idCard;
        this.phone = phone;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getIdCard() {
        return idCard;
    }

    public long getPhone() {
        return phone;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
