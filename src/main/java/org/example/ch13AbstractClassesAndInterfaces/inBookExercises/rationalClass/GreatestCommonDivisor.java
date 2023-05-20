package org.example.ch13AbstractClassesAndInterfaces.inBookExercises.rationalClass;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        int n1 = input.nextInt();
        System.out.println("Please enter the second number : ");
        int n2 = input.nextInt();

        int k = 2;
        int gcd = 0;

        while(k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            k++;
        }
        System.out.println("The greatest common divisor to " + n1 + " and " + n2 + " is " +
                gcd);
    }
}
