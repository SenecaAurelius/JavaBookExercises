package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class QSeventeenCostOfShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight of your package : ");
        double weight = input.nextDouble();
        double cost = 0;
        if(weight > 20){
            System.out.println("The package cannot be shipped.");
        } else if(weight <= 2 && weight > 0){
            cost = 2.5;
        } else if(weight <= 4){
            cost = 4.5;
        } else if(weight <= 10){
            cost = 7.5;
        } else {
            cost = 10.5;
        }
        System.out.println("The cost to ship a package weighing " + weight + " is " + cost);

        //(Cost of shipping) A shipping company uses the following function to calculate the
        //cost (in dollars) of shipping based on the weight of the package (in pounds).
        //c(w) = d
        //2.5, if 0 6 w 6 = 2
        //4.5, if 2 6 w 6 = 4
        //7.5, if 4 6 w 6 = 10
        //10.5, if 10 6 w 6 = 20
        // Write a program that prompts the user to enter the weight of the package and
        //display the shipping cost. If the weight is greater than 20, display a message “the
        //package cannot be shipped.”
    }
}
