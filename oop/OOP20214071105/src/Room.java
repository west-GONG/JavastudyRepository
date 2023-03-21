
public class Room {
    private String id;
    //房间编号
    private String type;
    //房间类型
    private String sta;
    //房间状态
    private double price;
    //房间单价


    public Room() {
    }

    public Room(String id, String type, double price, String sta) {
        this.id = id;
        this.type = type;
        this.price=price;
        this.sta = sta;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String isSta() {
        return sta;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
