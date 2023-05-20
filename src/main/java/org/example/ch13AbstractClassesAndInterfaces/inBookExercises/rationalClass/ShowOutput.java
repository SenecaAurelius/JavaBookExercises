package org.example.ch13AbstractClassesAndInterfaces.inBookExercises.rationalClass;

public class ShowOutput {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, -2);
        System.out.println(r1.add(r2));

        // a/b + c/d ==
        // a/b + c/d == (ad + bc) / bd;
    }
}
