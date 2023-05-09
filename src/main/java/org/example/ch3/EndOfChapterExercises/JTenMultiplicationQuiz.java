package org.example.ch3.EndOfChapterExercises;
import java.util.Scanner;
public class JTenMultiplicationQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = (int) (Math.random() * 1000);
        int secondNumber = (int) (Math.random() * 1000);
        int answer = firstNumber * secondNumber;
        System.out.println("What is " + firstNumber + " * " + secondNumber + "? ");
        int userAnswer = input.nextInt();
        if(userAnswer == answer){
            System.out.println("You are correct! " + firstNumber + " * " + secondNumber + " = " + answer + "!");
        } else {
            System.out.println("Sorry! You are incorect! " + firstNumber + " * " + secondNumber + " = " + answer + "!");
        }

//        Listing 3.3, SubtractionQuiz.java, randomly generates
//a subtraction question. Revise the program to randomly generate a multiplication
//question with two integers less than 1000.
    }
}
