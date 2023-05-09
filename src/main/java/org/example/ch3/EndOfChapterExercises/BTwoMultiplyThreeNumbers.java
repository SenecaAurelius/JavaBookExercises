package org.example.ch3.EndOfChapterExercises;
import java.util.Scanner;
public class BTwoMultiplyThreeNumbers {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        int correctAnswer = number1 * number2 * number3;
        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " * " + number2 + " * " + number3 + "? ");
        int userAnswer = input.nextInt();
        if(userAnswer == correctAnswer){
            System.out.println("Correct! " + correctAnswer + " is the answer!");
        } else {
            System.out.println("Incorrect! " + correctAnswer + " was the answer. Please try again.");
        }
    }
}
