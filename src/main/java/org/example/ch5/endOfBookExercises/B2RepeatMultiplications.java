package org.example.ch5.endOfBookExercises;

import java.util.Scanner;

public class B2RepeatMultiplications {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        int count = 0;
        int correctAnswers = 0;
        while(count < 5){
            int randNum1 = (int)(Math.random() * 13);
            int randNum2 = (int)(Math.random() * 13);
            System.out.println("What is " + randNum1 + " * " + randNum2 + "?");
            int answer = input.nextInt();
            if(answer == (randNum1 * randNum2)){
                correctAnswers++;
            }
            count++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("You got " + count + " answers correct, and completed the quiz in "
                + ((endTime - startTime) / 1000) + " seconds.");
    }
}
