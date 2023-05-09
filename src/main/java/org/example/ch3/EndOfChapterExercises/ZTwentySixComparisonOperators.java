package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class ZTwentySixComparisonOperators {
    public static void main(String[] args) {
//(Use the &&, || and ^ operators) Write a program that prompts the user to enter
//an integer and determines whether it is divisible by 4 and 5, whether it is divisible
//by 4 or 5, and whether it is divisible by 4 or 5 but not both. Here is a sample run of
//this program:

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        double inputNumber = input.nextDouble();

        if(inputNumber % 4 == 0 && inputNumber % 5 == 0){
            System.out.println("The number is divisible by 4 and 5.");
        } else if(inputNumber % 4 == 0 ^  inputNumber % 5 == 0){
            System.out.println("The number is divisible by 5 or 4, but not both. Using ^ sign.");
            if(inputNumber % 4 == 0){
                System.out.println("The number is divisible by 4.");
            } else {
                System.out.println("The number is divisible by 5.");
            }
        } else if(inputNumber % 4 == 0 || inputNumber % 5 == 0){
            if(inputNumber % 4 == 0){
                System.out.println("The number is divisible by 4.");
            } else {
                System.out.println("The number is divisible by 4.");
            }
        } else {
            System.out.println("The number is not divisible by 4 or 5.");
        }
    }
}
