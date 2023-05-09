package org.example.ch3.inBookExercises;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lotter pick (two digits) : ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if(guess == lottery){
            System.out.println("You guessed the number exactly and win big! ");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2){
            System.out.println("You guessed both numbers, but out of order : you won the second largest pot! ");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit1){
            System.out.println("You matched 1 digit : You won the third largest pot!");
        } else {
            System.out.println("Sorry, play again! ");
        }
    }
}
