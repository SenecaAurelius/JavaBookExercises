package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class ThirtyOneCurrencyExchange {
    public static void main(String[] args) {
//(Financials: currency exchange) Write a program that prompts the user to enter
//the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
//to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
//Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. dollars
//or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. Here
//are the sample runs:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 to convert USD to RMB, or 1 to convert RMB to USD : ");
        int choice = input.nextInt();

        if(choice == 0){
            System.out.println("What is the amount of USD you would like to convert to RMB? ");
            double amountToConvert = input.nextDouble();
            double conversionRate = 6.91;
            double convertedAmount = amountToConvert * conversionRate;
            System.out.println("You changed " + amountToConvert + " to " + convertedAmount + ". ");

        } else if (choice == 1){
            System.out.println("What is the amount of RMB you would like to convert to USD? ");
            double amountToConvert = input.nextDouble();
            double conversionRate = .14467;
            double convertedAmount = amountToConvert * conversionRate;
            System.out.println("You changed " + amountToConvert + " to " + convertedAmount + ". ");
        }
    }
}
