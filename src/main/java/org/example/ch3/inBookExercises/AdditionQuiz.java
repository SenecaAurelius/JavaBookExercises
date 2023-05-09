package org.example.ch3.inBookExercises;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args){
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + "? ");

        int answer = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
        int correctAnswer = number1 + number2;
        System.out.println(correctAnswer + " is the correct answer. ");
    }
}
