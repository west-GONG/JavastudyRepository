public class Contacter {
    private String id;
    private String name;
    private String workUnit;
    private String phone;
    public Contacter(String id,String name, String phone, String workUnit) {
        this.id=id;
        this.name = name;
        this.workUnit = workUnit;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-10s %-20s %-40s",id,name,phone,workUnit);
    }
}
