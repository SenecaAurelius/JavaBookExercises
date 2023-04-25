package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class FourteenBMICalculator {
//    (Health application: computing BMI) Body Mass Index (BMI) is a measure of
//health on weight. It can be calculated by taking your weight in kilograms and
//dividing, by the square of your height in meters. Write a program that prompts the
//user to enter a weight in pounds and height in inches and displays the BMI. Note
//one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a
//sample run:
//Compute BMI
//Enter weight in pounds: 95.5
//Enter height in inches: 50
//BMI is 26.8573
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height in inches : ");
        double inches = input.nextDouble();
        double metersTall = inches * 0.0254;
        System.out.println("Please enter your weight in pounds : ");
        double poundsHeavy = input.nextDouble();
        double kilogramsHeavy = poundsHeavy * 0.45359237;
        double BMI = kilogramsHeavy / Math.pow(metersTall, 2);
        System.out.println("Your BMI based on " + inches + " inches tall and " + metersTall + " meters tall is " + BMI + ".");
    }
}
