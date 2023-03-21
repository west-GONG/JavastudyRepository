import java.util.ArrayList;

public class openCloseManger {
    private ArrayList<openClose>openCloses=new ArrayList<openClose>();

    public openCloseManger() {
    }

    public openCloseManger(ArrayList<openClose> openCloses) {
        this.openCloses = openCloses;
    }

    public void open(openClose openClose){
        openCloses.add(openClose);
    }

    public void close(String num) {
        for (int i=openCloses.size() - 1; i >= 0; i--){
            openClose openClose=openCloses.get(i);
            if (openClose.getNum().equals(num)){
                openCloses.remove(openClose);
                System.out.println("退房成功");
            }
        }
    }
}
