package org.example.ch3.EndOfChapterExercises;

import java.util.Random;
import java.util.Scanner;
public class NFourteenHeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Will it be heads or tails? ");
        //Could change input to equal heads or tails instead of true or false.
        String strGuess = input.nextLine();
        boolean guess = true;
        if(strGuess.toLowerCase().equals("heads")) {
            guess = true;
        } else if(strGuess.toLowerCase().equals("tails")){
            guess = false;
        }

        Random random = new Random();
        boolean answer = random.nextBoolean();
        if(guess == answer) {
            System.out.println("You are correct! " + answer + " does equal " + guess + "! ");
        }
        else {
            System.out.println("Sucks to suck! " + answer + " does NOT equal " + guess + "! ");
        }
    }
}
