package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;
public class FourConvertSquareMeterIntoPing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in square meters : ");

        double squareMeters = input.nextDouble();
        double ping = squareMeters * 0.3025;

        System.out.println(squareMeters + " square meters is " + ping + " ping.");

    }
}
