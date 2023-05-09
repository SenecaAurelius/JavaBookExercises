package org.example.ch3.EndOfChapterExercises;
import java.util.Scanner;
public class ThirtyFiveOddOrEven {
    public static void main(String[] args) {
//(Even or odd number) Write a program that prompts the user to enter an integer and
//displays whether the integer is an odd number or not. Here are the sample runs:
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer, and we will determine if it is odd or even :");
        double num = input.nextDouble();
        if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}
