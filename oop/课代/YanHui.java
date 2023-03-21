package homework6;

public class YanHui {
    private int n;
    private int[][] arr;

    public YanHui(int n) {
        this.n = n;
        Init();
        Make();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        Init();
        Make();
    }

    public int[][] getArr() {
        return arr;
    }

    private void Init() {//初始化数组
        arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i]=new int[i+1];
        }
    }

    private void Make() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            if(i==j|| j==0) {
                arr[i][j] = 1;
            }
            else
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
    }

    public  void Print() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

