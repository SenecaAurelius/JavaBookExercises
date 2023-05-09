package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class ThirtyFourCompareCost {
    public static void main(String[] args) {
//Suppose you shop for rice in two different packages.
//You would like to write a program to compare the cost. The program prompts the
//user to enter the weight and price of each package and displays the one with the
//better price. Here is a sample run:
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight and cost of item 1 respectively : ");
        double weight = input.nextDouble();
        double price = input.nextDouble();
        System.out.println("And now please enter the weight and cost of item 2, again, respectively : ");
        double weightB = input.nextDouble();
        double priceB = input.nextDouble();

        double costPerUnit = price/weight;
        double costPerUnitB = priceB/weightB;
        if(costPerUnit < costPerUnitB){
            System.out.println("The first item is cheaper at " + costPerUnit + " dollars/units to " + costPerUnitB);
        } else if (costPerUnit == costPerUnitB){
            System.out.println("The items' price to weight ratios are the same. " + costPerUnitB + " : " + costPerUnit);
        }else {
            System.out.println("The second item is cheaper at " + costPerUnitB + " dollars/units to " + costPerUnit);

        }
    }
}
