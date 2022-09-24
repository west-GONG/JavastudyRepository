import java.util.Scanner;

public class staffTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入员工数目");
        int n=sc.nextInt();
        System.out.println("请输入员工信息：工号，姓名，性别，年龄，学历，部门，工资,是否党员");
        Staff[] s=new Staff[3];
        for (int i=0;i<s.length;i++) {
            s[i]=new Staff(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next());
        }
        Staff s1=null;
        for(int i=0;i<s.length;i++) {
            for (int j =0; j < s.length; j++) {
                if(j!=(n-1))
                    if(s[j].getSalary()<s[j+1].getSalary()) {
                        s1=s[j+1];
                        s[j+1]=s[j];
                        s[j]=s1;
                    }
            }
        }
        System.out.println("员工工资排名如下\n工号\t\t姓名\t\t性别\t\t年龄\t\t学历\t\t部门\t\t工资\t\t是否党员");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].getJobNumber()+"\t\t"+s[i].getName()+"\t\t"+s[i].getSex()+"\t\t"+s[i].getAge()+"\t\t"
                    +s[i].getEducation()+"\t\t"+s[i].getDepartment()+"\t\t"+s[i].getSalary()+"\t\t"+s[i].getIsPartMember());
        }
    }
}
