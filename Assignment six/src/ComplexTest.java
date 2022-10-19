public class ComplexTest {
    public static void main(String[] args) {
        Complex a=new Complex(2,4);
        Complex b=new Complex(1,1);
        Complex result;
        result=a.Add(b);
        result.toString();
        result=a.Sub(b);
        result.toString();
        result=a.Mul(b);
        result.toString();
        result=a.Div(b);
        result.toString();
    }
}
