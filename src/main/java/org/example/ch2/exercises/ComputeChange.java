package org.example.ch2.exercises;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(("Enter an amount in double, for example 11.56 :"));
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println("Dollars : " + numberOfOneDollars);
        System.out.println("Quarters : " + numberOfQuarters);
        System.out.println("Dimes : " + numberOfDimes);
        System.out.println("Nickles : " + numberOfNickles);
        System.out.println("Pennies : " + numberOfPennies);
    }
}
