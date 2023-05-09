package org.example.ch6.inBookExercises;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first integer : ");
        int n1 = input.nextInt();
        System.out.println("Please enter the second integere : ");
        int n2 = input.nextInt();

        System.out.println("The GCD for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
    }

    public static int gcd(int n1, int n2){
        int gcd = 1;
        int k = 2;

        while(k <= n1 && k <=n2){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            k++;
        }
        return gcd;
    }
}
