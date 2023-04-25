package org.example.ch2.endOfChapterExercises;
import java.util.Scanner;
public class TwentyOneCalculateFutureInvestmentValue {
//    (Financial application: calculate future investment value) Write a program that
//reads in investment amount, annual interest rate, and number of years and displays
//the future investment value using the following formula:
//futureInvestmentValue =
//investmentAmount * (1 + monthlyInterestRate)
//numberOfYears*12
// For example, if you enter amount 1000, annual interest rate 3.25%, and number
//of years 1, the future investment value is 1032.98.
//Here is a sample run:
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investment amount :");
        double investment = input.nextDouble();
        System.out.println("Enter annual interest rate in a percentage : ");
        double interest = input.nextDouble();
        System.out.println("Enter the number of years you would like to invest : ");
        double years = input.nextDouble();

        double futureInvestmentValue = investment * Math.pow((1 + interest / 1200), years * 12);
        System.out.println("Your future investment value will be " + futureInvestmentValue + ".");
//        Enter investment amount: 1000.56
//Enter annual interest rate in percentage: 4.25
//Enter number of years: 1
//Future value is $1043.92
    }
}
