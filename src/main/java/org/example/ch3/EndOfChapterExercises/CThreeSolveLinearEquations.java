package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class CThreeSolveLinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a, b, c, d, e, and f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        if(!(a*d - b*c == 0)){
            double det = ((a) * (d) - (b) * (c));
            double x = ((d) * (e) - (b) * (f)) / det;
            double y = ((a) * (f) - (c) * (e)) / det;
            System.out.println("x = " + x + ", y = " + y);
        }
        else {
            System.out.println("The equation has no solution.");
        }

    }
}
