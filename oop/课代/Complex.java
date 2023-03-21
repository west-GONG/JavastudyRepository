package homework6;

public class Complex {
    private double real;
    private double imag;

    public Complex() {
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    //求两个复数的和，结果是复数
    //跟实例无关的成员要定义为静态，跟实例有关的要定义实例
    public Complex add(Complex x) {//求this+x
        return new Complex(x.real + this.real, x.imag + this.imag);//this局部变量
    }

    public Complex sub(Complex x) {
        return new Complex(this.real - x.real, this.imag - x.imag);
    }

    public Complex mul(Complex x) {
        double real = this.real * x.real - this.imag * x.imag;
        double imag = this.imag * x.real + this.real * x.imag;
        return new Complex(real, imag);
    }

    public Complex div(Complex x) {
        Complex complex = this.mul(new Complex(x.real, -x.imag));
        double real = complex.real / (x.real * x.real + x.imag * x.imag);
        double imag = complex.imag / (x.real * x.real + x.imag * x.imag);
        return new Complex(real, imag);
    }

    public String toString() {//toString()是从object类继承来的
        return imag == 0 ? real + "" : imag >= 0 ? this.real + "+" + this.imag + "i" : this.real + "" + this.imag + "i";
    }
}
