public class SmartPhone extends Phone{
   private String headShot;
   public void game(){
       System.out.println("play game");
   }
public SmartPhone(String headShot){
       this.headShot = headShot;
}
    public String getHeadShot() {
        return headShot;
    }

    @Override
    public void phoneNumber() {
        super.phoneNumber();
        System.out.println("显示头像"+getHeadShot());
    }
}
