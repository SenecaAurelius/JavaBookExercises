package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class AOneSolveQuadraticEquations {
    public static void main(String[] args) {
        //ax^2 + bx + c = 0
        //r1 = (-b + sqrt(b^2 - 4ac)) / 2
        //r2 = (-b - sqrt(b^2 - 4ac)) / 2
        //b^2 - 4ac is the discriminant. if positive, 2 real roots. If 0, one root. If negative, no real roots.
        //if pos : 2 roots, 0 - one root, 0 > "The equation has no real roots"
        //Use Math.pow(x, 0.5) for sqrt(x);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter digits for a, b, and c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if( (Math.pow(b, 2) - (4 * a * c)) > 0){
            double r1 = ( (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2);
            double r2 = ( (-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2);
            System.out.println("The equation has two roots : " + r1 + " and " + r2);

        } else if ( (Math.pow(b, 2) - (4 * a * c)) == 0){
            double r1 = ( (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2);
            double r2 = ( (-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2);
            System.out.println("The equation has one root : " + r1 + " and " + r2);
        } else if ( (Math.pow(b, 2) - (4 * a * c)) < 0){
            System.out.println("The equation has no real roots.");
        }
    }
}
