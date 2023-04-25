package org.example.ch2.endOfChapterExercises;
import java.util.Scanner;
public class NineAcceleration {

    //Write a program that prompts the user to enter the starting velocity v0 in meters/
    //second, the ending velocity v1 in meters/second, and the time span t in seconds,
    //then displays the average acceleration.

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your starting velocity? ");
        double startingVelocity = input.nextDouble();
        System.out.println("What is your ending velocity? ");
        double endingVelocity = input.nextDouble();

        System.out.println("How long did it take to reach that ending velocity in seconds? ");
        double time = input.nextDouble();;

        double acceleration = (endingVelocity - startingVelocity) / time;
        System.out.println("The average acceleration  is " + acceleration);

    }
}
