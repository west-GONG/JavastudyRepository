import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    ArrayList<Contacter> contacters=new ArrayList<Contacter>();

    public List<Contacter> getContacters() {
        return contacters;
    }

    public void add(Contacter contacter){
//        if(contacter==null)return;
//        if(findByName(contacter.getName())==null)
            contacters.add(contacter);
//        else
//            System.out.println("对不起，该用户已存在！");
    }

    public void delete(Contacter contacter){
        delete(contacter.getName());
//        Contacter c=findByName(contacter.getName());
//        if(c!=null)
//            contacters.remove(c);
//        else
//            System.out.println("对不起，该联系人不存在！");
    }
    public void delete(String name){
        Contacter c=findByName(name);
        if(c!=null)
            contacters.remove(c);
        else
            System.out.println("对不起，该联系人不存在！");
    }
    public void edit(Contacter contacter){//要修改成的：02  张三 1234  aaaa
        Contacter c=findById(contacter.getId());
        if(c!=null){
            c.setName(contacter.getName());//修改前：02 bbb 456  kkk
            c.setWorkUnit(contacter.getWorkUnit());
            c.setPhone(contacter.getPhone());
        }
    }
    public Contacter findById(String id){
        for(Contacter contacter:contacters) {
            if (contacter.getId().equals(id))
                return contacter;
        }
        return  null;
    }
    public Contacter findByName(String name){
        for(Contacter contacter:contacters)
            if(contacter.getName().equals(name))
                return contacter;
        return  null;
    }
    public  Contacter findByPhoneNumber(String phoneNumber){
        for(Contacter contacter:contacters)
            if(contacter.getPhone().equals(phoneNumber))
                return contacter;
        return  null;
    }
    public  void showAll(){
        System.out.println("------------------------------------------------------------------");
        System.out.println(String.format("%-10s %-20s %-40s","姓名","联系电话","工作单位"));
        for(Contacter contacter:contacters){
            System.out.println(contacter);
        }
        System.out.println("------------------------------------------------------------------");
    }
}
