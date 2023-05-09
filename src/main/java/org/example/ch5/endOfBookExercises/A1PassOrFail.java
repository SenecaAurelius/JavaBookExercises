package org.example.ch5.endOfBookExercises;

import java.util.Scanner;

public class A1PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a grade on a scale of 1-100 : (enter -1 to exit)");
        int grade = input.nextInt();
        while(grade != -1) {
            if (grade >= 60) {
                System.out.println("You pass the exam!");
            } else {
                System.out.println("You did NOT pass the exam...");
            }
            System.out.println("Would you like to enter another grade? (enter -1 to exit)");
            grade = input.nextInt();
        }
        System.exit(1);
    }
}
