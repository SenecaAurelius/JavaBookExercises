package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class TwelveRunwayLength {
//    (Physics: finding runway length) Given an airplane’s acceleration a and take-off
//speed v, you can compute the minimum runway length needed for an airplane to
//take off using the following formula:
//length = v2
//2a
// Write a program that prompts the user to enter v in meters/second (m/s) and the
//acceleration a in meters/second squared (m/s2
//), then, displays the minimum runway length. Here is a sample run:
//Enter speed and acceleration: 60 3.5
//The minimum runway length for this airplane is 514.286
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the speed in Meters/Second, and acceleration in Meters/Second Squared respectively : ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = (Math.pow(speed, 2)) / 2 * acceleration;

        System.out.println("The minimum runway length for this airplane is " + length + ".");
    }
}
