package org.example.ch5.inBookExercises;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        int guess = input.nextInt();

        while(guess != number){
            if(guess < number){
                System.out.println("You guessed too low! Guess higher! ");
            } else {
                System.out.println("You guessed too high! Guess lower! ");
            }
            guess = input.nextInt();
        }
        System.out.println("Yes! The number is " + number + "! ");
        System.exit(1);
    }
}
