public class Phone {
    private String brand;
    private String model;

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public Phone() {
    }
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void sendMessage(){

    }

    public void call(){

    }

    public void phoneNumber() {
        System.out.println("来电为11888898");
    }
}
