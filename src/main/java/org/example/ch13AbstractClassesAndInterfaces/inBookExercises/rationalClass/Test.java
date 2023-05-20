package org.example.ch13AbstractClassesAndInterfaces.inBookExercises.rationalClass;

public class Test {
    public static void main(String[] args) {
//        Rational r1 = new Rational(1, 123456789);
//        Rational r2 = new Rational(1, 123456789);
//        Rational r3 = new Rational(1, 123456789);
//        System.out.println("r1 * r2 * r3 is " + r1.multiply(r2.multiply(r3)));

//        Rational r1 = new Rational(-2, 6);
//        System.out.println(r1.getNumerator());
//        System.out.println(r1.getDenominator());
//        System.out.println(r1.intValue());
//        System.out.println(r1.doubleValue());

        Rational r1 = new Rational(-2, 6);
        Object r2 = new Rational(1, 45);
        System.out.println(((Rational)r2).compareTo(r1));


    }
}
