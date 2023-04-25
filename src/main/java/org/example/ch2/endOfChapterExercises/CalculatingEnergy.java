package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class CalculatingEnergy {

//    Science: calculating energy) Write a program that calculates the energy needed
//to heat water from an initial temperature to a final temperature. Your program
//should prompt the user to enter the amount of water in kilograms and the initial
//and final temperatures of the water. The formula to compute the energy is
// Q = M * (finalTemperature – initialTemperature) * 4184
// where M is the weight of water in kilograms, initial and final temperatures are in
//degrees Celsius, and energy Q is measured in joules. Here is a sample run:
//Enter v0, v1, and t: 5.5 50.9 4.5
//The average acceleration is 10.0889
//Enter the amount of water in kilograms: 55.5
//Enter the initial temperature: 3.5
//Enter the final temperature: 10.5
//The energy needed is 1625484.0

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of water to heat in kilograms : ");
        double waterInKilos = input.nextDouble();;
        System.out.println("Please enter the starting and ending temperatures in degrees celsius repectively : ");
        double startingTemp = input.nextDouble();
        double endingTemp = input.nextDouble();
        double energyNeeded = waterInKilos * (endingTemp - startingTemp) * 4184;
        System.out.println("The energy needed to heat " + waterInKilos + " water to that temperature is " + energyNeeded);
    }
}
