public class student {
    String sName;
    String Sex;
    short Age;
    float Score;
    boolean isPartyMember;
    public boolean SName(String sName) {
        if (sName=="张三")
        return true;
        else return false;
    }
    public boolean twentyMale(String Sex,short Age){
        if(Sex == "Male"&&Age>=20)
            return true;
        else return false;
    }
    public boolean badBoyPartyMember(){
        if(Score<60&&Sex == "Male"){
            if (isPartyMember)
                return true;
            else return false;
        }
        else return false;
    }
}
