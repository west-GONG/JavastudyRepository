public class openClose {
    private String num;
    //开房编号
    private String[] name;
    //房间姓名

    public openClose(String num, String[] name) {
        this.num = num;
        this.name = name;
    }

    public openClose() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
