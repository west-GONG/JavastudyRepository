public class yangHuiTriangle {
    private int n;
    int[][] array;

    public int getN() {
        return n;
    }
    public void yangHuiTriangle(int n) {
        this.n = n;
    }
    public void yangHuiTriangle(){

    }
    public void Init(){//初始化数组
        n=getN();
        this.array = new int[n][n];
    }
    public int[][] Make(){//生成杨辉三角
        for(int i=0;i<array.length;i++) {
            array[i]=new int[i+1];
        }
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                if(j==0 || i==j) {
                    array[i][j]=1;
                }else {
                    array[i][j]=array[i-1][j]+array[i-1][j-1];
                }
            }
        }
        return array;
    }
    public void Print() {//输出杨辉三角
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        //第二种方法等腰三角
       /* int rows =getN();
        for (int i = 0; i < rows; i++) {
            int number = 1;
            // 打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }*/
    }
}
