package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class FiveCalculateTips {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the total bill : ");
        double bill = input.nextDouble();

        System.out.println("Please enter the percentage you would like to tip : ");
        double tippingPercentage = input.nextDouble() / 100;
        double finalTotal = bill + (bill * tippingPercentage);

        System.out.println("Your " + bill + " bill with a " + tippingPercentage + " gratuity would cost " + finalTotal);
    }
}
