package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class ComputeTheVolumeOfATriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length of your equilateral triangle : ");
        double length = input.nextDouble();
        double area = (1.73 / 4) * length * length;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
