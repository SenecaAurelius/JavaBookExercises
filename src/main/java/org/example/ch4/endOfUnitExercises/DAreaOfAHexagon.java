package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

public class DAreaOfAHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of a side of the hexagon : ");
        double sideLength = input.nextDouble();
        double area = (6 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is " + area);
    }
}
