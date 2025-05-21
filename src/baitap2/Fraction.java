package baitap2;

public class Fraction extends MyNumber {
    int numerator;
    int denominator;


    @Override
    MyNumber add(MyNumber Other) {
        Fraction f = new Fraction();
        Fraction o = (Fraction)Other;
        f.denominator = this.denominator * o.denominator;
        f.numerator = this.numerator * o.numerator + this.denominator * o.numerator;
        return f;
    }

    @Override
    MyNumber subtract(MyNumber Other) {
        Fraction f = new Fraction();
        Fraction o = (Fraction)Other;
        f.denominator = this.denominator * o.denominator;
        f.numerator = this.numerator * o.numerator - this.denominator * o.numerator;
        return f;
    }

    @Override
    MyNumber multiply(MyNumber Other) {
        Fraction f = new Fraction();
        Fraction o = (Fraction)Other;
        f.denominator = this.denominator * o.denominator;
        f.numerator = (this.numerator * o.numerator) * (this.denominator * o.numerator);
        return f;
    }

    @Override
    MyNumber divide(MyNumber Other) {
        Fraction f = new Fraction();
        Fraction o = (Fraction)Other;
        f.denominator = this.denominator * o.denominator;
        f.numerator = (this.numerator * o.numerator) / (this.denominator * o.numerator);
        return f;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
