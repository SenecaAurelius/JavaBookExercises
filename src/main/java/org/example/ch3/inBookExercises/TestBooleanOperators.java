package org.example.ch3.inBookExercises;

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int number = input.nextInt();
        if (number % 2 == 0 && number % 3 == 0){
            System.out.println(number + " is divisible by 2 AND 3.");
        }
        if(number % 2 == 0 || number % 3 == 0){
            System.out.println(number + " is divisible by 2 OR 3.");
        }
        if (number % 2 == 0 ^ number % 3 == 0){
            System.out.println(number + " is divisible by 2 or 3, BUT NOT BOTH.");
        }
    }
}
