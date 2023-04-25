package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class FifteenDistanceBetweenTwoPoints {
//    (Geometry: distance of two points) Write a program that prompts the user to enter
//two points (x1, y1) and (x2, y2) and displays their distance. The formula for
//computing the distance is 2(x2 - x1)
//2 + (y2 - y1)
//2
//. Note you can use Math.
//pow(a, 0.5) to compute 2a. Here is a sample run:
//Enter x1 and y1: 1.5 -3.4
//Enter x2 and y2: 4 5
//The distance between the two points is 8.764131445842194
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first point's x coordinate : ");
        double ax = input.nextDouble();
        System.out.println("Please enter the first point's y coordinate : ");
        double ay = input.nextDouble();
        System.out.printf("Please enter the second point's x coordinate : ");
        double bx = input.nextDouble();
        System.out.println("Please enter the second point's y coordinate : ");
        double by = input.nextDouble();

        double distance = Math.pow( (Math.pow((ax - bx), 2) + Math.pow((ay - by), 2)), 0.5 );
        System.out.println("The distance between those two points is : " + distance + ".");
    }
}
