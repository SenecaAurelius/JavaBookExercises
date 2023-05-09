package org.example.ch5.inBookExercises;

import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data = -1;
        int sum = 0;

        Scanner input = new Scanner(System.in);

         do {
            System.out.print("Please enter an integer : (Program ends when you enter 0) ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("The sum is " + sum);
    }
}
