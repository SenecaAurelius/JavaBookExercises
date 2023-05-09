package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

public class EAreaOfARegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of sides to this regular polygon : ");
        double numSides = input.nextDouble();
        System.out.println("Please enter the length of the sides : ");
        double lengthOfSides = input.nextDouble();

        double area = (numSides * lengthOfSides * lengthOfSides) / (4 * Math.tan(Math.PI / numSides));
        System.out.println("The area of the polygon is " + area);
    }
}
