package OPPS;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
        simplify();
    }
    public int getNumerator() {
        return this.numerator;
    }
    public int getDenominator() {
        return this.denominator;
    }


    public void print() {
        System.out.println(this.numerator + "/" + this.denominator);
        // simplify();
    }
    public void increment() {
        this.numerator = this.numerator + this.denominator;
        simplify();
    }
    public void decrement() {
        this.numerator = this.numerator - this.denominator;
        simplify();
    }
    public void add(Fraction f2){
        //First fraction is the function on which function is called
        //Second fraction is the function which is passed as an argument

        this.numerator = this. numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }
    public static Fraction add(Fraction f1, Fraction f2){
        int lcm = f1.denominator * f2.denominator;
        int x = lcm / f1.denominator;
        int y = lcm / f2.denominator;
        int num = x * f1.numerator + (y * f2.numerator);
        Fraction f = new Fraction(num, lcm);
        f.simplify();
        return f;
    }

    // public void add(Fraction f2) {

    //     int lcm = this.denominator * f2.denominator;
    //     int x = lcm / this.denominator;
    //     int y = lcm / f2.denominator;
    //     int num = x * this.numerator + (y * f2.numerator);
    //     this.numerator = num;
    //     this.denominator = lcm;
    //     simplify();
    // }

    public void multiply(Fraction f2) {
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(this.numerator, this.denominator);
        for (int i = 1; i <= smaller; i++) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                gcd = i;
            }
        }
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }
}
