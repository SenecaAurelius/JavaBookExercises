package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class WTwentyThreePointsInARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two points to check if they are inside of a rectangle, centered on point 1,1 with a height of 5 and width of 10 :");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if(x >= -4 && x <= 6 && y <= 3.5 && y >= -1.5){
            System.out.println("Point " + x + ", " + y + " is on or within the rectangle.");
        } else {
            System.out.println("Point " + x + ", " + y + " is not on or within the rectangle");
        }
    }
}
