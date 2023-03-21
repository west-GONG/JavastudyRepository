public class SumOfFractions {
    public static void main(String[] args) {
        int i=1;double SumOfFractions = 0;
        //for结构
        for(i=1;i<=100;i++){
            SumOfFractions+=(double)1/i;
        }
        System.out.println(SumOfFractions);
        //while结构
        while (i<=100){
            SumOfFractions+=(double) 1/i;
            i++;
        }
        System.out.println(SumOfFractions);
        //do-while结构
        do{
            SumOfFractions+=(double) 1/i;
            i++;
        }while (i <=100);
        System.out.println(SumOfFractions);
    }
}
