import java.util.ArrayList;
import java.util.Scanner;

public class roomManger {
    private ArrayList<Room> rooms=new ArrayList<Room>();

    public roomManger() {
    }

    public roomManger(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room){
            rooms.add(room);
    }

    public void reviseRoom(String id,int c){//修改房间的信息
        Scanner sc = new Scanner(System.in);
        for (Room room : rooms) {
            if (room.getId().equals(id)) {
                switch (c){
                    case 1:
                        room.setId(sc.next());
                        break;
                    case 2 :
                        room.setType(sc.next());
                        break;
                    case 3 :
                        room.setPrice(sc.nextDouble());
                        break;
                    case 4 :
                        room.setSta(sc.next());
                        break;
                    default :
                        System.out.println("输入错误");
                }
            }else {
                System.out.println("查找失败");
            }
        }
    }

    public void deleteRooms(String id) {//删除房间
        for (Room room:rooms) {
            if (room.getId().equals(id)){
                rooms.remove(room);
                System.out.println("删除成功");
            }
        }
    }

    public void queryRooms(ArrayList<Room> rooms){
        System.out.println("房间编号"+"\t\t"+"房间类型"+"\t\t"+"房间价格"+"\t\t"+"房间状态");
        for (int i=0;i<rooms.size();i++){
            Room r=rooms.get(i);
            System.out.println(r.getId()+"\t\t\t"+r.getType()+"\t\t\t"+r.getPrice()+"\t\t\t"+r.isSta());
        }
    }
}
