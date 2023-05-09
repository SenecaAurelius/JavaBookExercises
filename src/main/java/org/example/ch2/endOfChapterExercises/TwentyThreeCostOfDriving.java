package org.example.ch2.endOfChapterExercises;
import java.util.Scanner;
public class TwentyThreeCostOfDriving {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance : ");
        double distance = input.nextDouble();
        System.out.println("Enter the miles per gallon of the vehicle :");
        double mPH = input.nextDouble();
        System.out.println("Enter the price per gallon : ");
        double pricePerGallon = input.nextDouble();

        double totalCostOfDriving = (distance / mPH) * pricePerGallon;
        System.out.println("The cost of driving is $" + totalCostOfDriving);
    }
}
