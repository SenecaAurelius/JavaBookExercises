package org.example.ch5.inBookExercises;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer : (End program with 0)");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0){
            sum += data;
            System.out.println("Please enter an integer : (End program with 0)");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
