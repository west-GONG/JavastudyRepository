public class Complex {
    private double real;
    //实部
    private double imag;
    //虚部
    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public Complex() {
        this.imag=0;
        this.real=0;
    }

    public Complex(double real,double imag){
        this.real = real;
        this.imag = imag;
    }

    Complex Add(Complex a){//加
        double real2 = a.getReal();
        double image2 = a.getImag();
        double newReal = real + real2;
        double newImage = imag + image2;
        Complex result = new Complex(newReal,newImage);
        return result;
    }

    Complex Sub(Complex a){//减
        double real2 = a.getReal();
        double image2 = a.getImag();
        double newReal = real - real2;
        double newImage = imag - image2;
        Complex result = new Complex(newReal,newImage);
        return result;
    }

    Complex Mul(Complex a) {//乘
        double real2 = a.getReal();
        double image2 = a.getImag();
        double newReal = real*real2 - imag*image2;
        double newImage = imag*real2 + real*image2;
        Complex result = new Complex(newReal,newImage);
        return result;
    }

    Complex Div(Complex a){//除
        double real2 = a.getReal();
        double image2 = a.getImag();
        double newReal = (real*real2 + imag*image2)/(real2*real2 + image2*image2);
        double newImage = (imag*real2 - real*image2)/(real2*real2 + image2*image2);
        Complex result = new Complex(newReal,newImage);
        return result;
    }

    @Override
    public String toString() {
        double a=getReal();
        double b = getImag();
        String strDoubleA= String.valueOf(a);
        String strDoubleB= String.valueOf(b);
        String strDoubleC ="+";
        String strDoubleD = "i";
        StringBuilder sber = new StringBuilder();
        sber.append(strDoubleA).append(strDoubleC).append(strDoubleB).append(strDoubleD);
        String s=sber.toString();
        System.out.println(s);
        return s;
    }
}
