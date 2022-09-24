import java.util.Scanner;

public class DataProcessing {
    public static void main(String[] args) {
        DataProcessing o=new DataProcessing();
        o.yangHuiTriangle(12);
        o.Prime(27);
        o.Factorial(10);
        o.sumFactorial(2,10);
        o.Compare(1.56,1.78);
        o.Statistic();
    }
    public int Prime(int n) {//判断一个正整数是否为素数
        for (int i=2;i<=n;i++) {
            if (n % i == 0) {
                break;
            }
            if(i==n){
                System.out.println(n+"为素数");
            }else {
                System.out.println(n+"不为素数");
            }
        }
        return n;
    }

    public int Factorial(int n) {//求n的阶乘
        int f = 1;
        for (int i=1; i<=n;i++) {
            f *= i;
        }
        System.out.println("n的阶乘为"+f);
        return f;
    }

    public long sumFactorial(int n, int m) {//求n到m的阶乘和
        long sum = 0;
        long s;
        for(int i=n;i<=m;i++){
            s=1;
            for(int j=1;j<=i;j++){
                s*=j;
            }
            sum+=s;
        }
        System.out.println("n到m的阶乘和为"+sum);
        return sum;
    }

    public double Compare(double a, double b){//比较两个double型数据的较大值
        double c=Math.max(a, b);
        System.out.println("较大数为"+c);
        return c;
    }

    public int Statistic() {//统计英语句子中单词个数
        int word  = 0;//统计单词数
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++) {
            char c  = str.charAt(i);//获取当前字符
            if(i==(str.length()-1) && (c>='a'&&c<='z' || c>='A'&&c<='Z')){
                word++;
            }
            if(c>='a'&&c<='z' || c>='A'&&c<='Z'){
                continue;
            } else {
                word++;
            }
        }
        System.out.println("句子中单词个数为"+word);
        return word;
    }
    public void yangHuiTriangle(int n){//输出(x+y)n展开式的系数（即杨辉三角）,n为次数及行数
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
