package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class ThreeConvertMetersIntoFeet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for meters : ");

        double meters = input.nextDouble();
        double feet = meters * 3.2786;
        System.out.println(meters + " meters is " + feet + " feet.");
    }
}
