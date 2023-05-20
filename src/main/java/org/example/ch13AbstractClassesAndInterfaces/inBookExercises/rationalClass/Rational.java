package org.example.ch13AbstractClassesAndInterfaces.inBookExercises.rationalClass;

import static org.example.ch6.inBookExercises.GreatestCommonDivisorMethod.gcd;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;


    //This class is immutable, because there are no setter methods. Once the private longs numerator and denominator are established, they stay that way.
    //Performing any operation between two Rational objects, always returns a new rational object, rather than changing either of the old ones.

    //String and other number wrapper classes are also immutable.

    //Construct a rational with default params
    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator){
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    public static long gcd(long n, long d){
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);

        int gcd = 1;


        for(int k = 1;k <= n1 && k <= n2; k++){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            k++;
        }
        return gcd;
    }

    public long getNumerator(){
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    // a/b + c/d == (ad + bc) / bd;

    public Rational add(Rational secondRational){
        long n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    // a/b - c/d == (ad - bc) / bd;

    public Rational subtract(Rational secondRational){
        long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    // a/b * c/d == ac/bd;

    public Rational multiply(Rational secondRational){
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    // a/b / c/d == ad/bc;

    public Rational divide(Rational secondRational){
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public String toString(){
        if (denominator == 1){
            return numerator + "";
        }
        else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object other){
        if ((this.subtract((Rational) (other))).getNumerator() == 0){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int intValue(){
        return (int)doubleValue();
    }

    @Override
    public float floatValue(){
        return (float)doubleValue();
    }

    @Override
    public double doubleValue(){
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue(){
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational o){
        if (this.subtract(o).getNumerator() > 0){
            return 1;
        }
        else if (this.subtract(o).getNumerator() < 0){
            return -1;
        }
        else {
            return 0;
        }
    }


}
