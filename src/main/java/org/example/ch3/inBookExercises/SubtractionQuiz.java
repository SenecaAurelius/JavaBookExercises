package org.example.ch3.inBookExercises;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args){
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        if(number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
            System.out.println("We swapped the numbers because number two was " + number1 + " and number one was + " + number2 + ". ");
        }
        System.out.println("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        int correctAnswer = number1 - number2;
        if(number1 - number2 == answer){
            System.out.println("You are correct! " + number1 + " - " + number2 + " is " + correctAnswer + ". ");
        } else {
            System.out.println("Incorrect! ");
            System.out.println(number1 + " - " + number2 + " is " + correctAnswer + ". ");
        }

    }
}
