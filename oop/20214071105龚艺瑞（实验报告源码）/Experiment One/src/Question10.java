import java.util.Scanner;

public class Question10 {
    //实现输出杨辉三角，行数通过控制台输入。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入杨辉三角的行数：");
        int n = sc.nextInt();
        int [][]a = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    a[i][j]=1;
                }else {
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
