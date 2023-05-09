package org.example.ch3.EndOfChapterExercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VTwentyTwoPointInACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a point, separated by a space : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distanceFromCenter = Math.pow( (Math.pow((x - 0), 2) + Math.pow((y - 0), 2)), 0.5);
        if(distanceFromCenter < 10){
            System.out.println("Point (" + x + ", " + y + ") is in the circle.");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is NOT in the circle.");
        }
    }
}
