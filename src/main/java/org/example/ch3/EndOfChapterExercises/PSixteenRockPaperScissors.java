package org.example.ch3.EndOfChapterExercises;

import java.util.Random;
import java.util.Scanner;

public class PSixteenRockPaperScissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer corresponding to Rock - 0, Paper - 1, Scissors - 2 : ");
        int choice = input.nextInt();
        //Random random = new Random();
        int computerChoice = (int) (Math.random() * 3);
        String strChoice;
        String strComputerChoice;
        if(choice == 0){
            strChoice = "Rock";
        } else if (choice == 1){
            strChoice = "Paper";
        } else {
            strChoice = "Scissors";
        }

        if(computerChoice == 0){
            strComputerChoice = "Rock";
        } else if (computerChoice == 1){
            strComputerChoice = "Paper";
        } else {
            strComputerChoice = "Scissors";
        }
        String win = "You win! " + strChoice + " beats " + strComputerChoice;
        String lose = "You lose! " + strComputerChoice + " beats " + strChoice;
        String draw = "Draw! " + strChoice + " draws against " + strComputerChoice;
        if(choice == 0){
            if(computerChoice == 1){
                System.out.println(lose);
            } else if(computerChoice == 2){
                System.out.println(win);
            } else {
                System.out.println(draw);
            }
        }
        else if (choice == 1){
            if(computerChoice == 0){
                System.out.println(win);
            } else if(computerChoice == 2){
                System.out.println(lose);
            } else {
                System.out.println(draw);
            }
        }
        else if (choice == 2){
            if(computerChoice == 0){
                System.out.println(lose);
            } else if(computerChoice == 2){
                System.out.println(draw);
            } else {
                System.out.println(win);
            }
        }
    }
}
