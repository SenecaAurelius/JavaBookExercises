package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class FSixComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in feet without the remaining inches : ");
        double feet = input.nextDouble();
        System.out.println("Please enter how many inches remain : ");
        double inches = input.nextDouble();
        double totalInchesTall = (feet * 12) + inches;
        double metersTall = totalInchesTall * 0.0254;

        System.out.println("Please enter how many pounds you weigh : ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.453592;
        double bMI = kilograms / Math.pow(metersTall, 2);
        System.out.println("Your BMI is " + bMI + ". ");
    }
}
