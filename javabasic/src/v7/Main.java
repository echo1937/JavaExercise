package v7;

/**
 * Created by Eric on 2/15/2016.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5, 6)).print();
        a.print();
        b.print();
        in.close();
    }

}

class Fraction {
    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;

    }

    private int a;
    private int b;

    public double toDouble() {
        double ret = this.a / this.b;
        return ret;
    }


    public Fraction plus(Fraction r) {
        int aa = this.a * r.b + this.b * r.a;
        int bb = this.b * r.b;
        Fraction tmp = new Fraction(aa, bb);
        return tmp;
    }

    public Fraction multiply(Fraction r) {
        int aa = this.a * r.a;
        int bb = this.b * r.b;
        Fraction tmp = new Fraction(aa, bb);
        return tmp;
    }

    public void print() {
        int gcdNum = gcd(this.a, this.b);
        Fraction reduct = new Fraction(this.a / gcdNum, this.b / gcdNum);
        if (reduct.b == 1) {
            System.out.println(reduct.a);
        } else {
            System.out.println(reduct.a + "/" + reduct.b);
        }

    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else return gcd(b, a % b);
    }
}