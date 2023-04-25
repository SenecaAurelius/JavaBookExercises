package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class ConvertMileToKilometer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a double value in miles : ");
        double miles = input.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println(miles + " miles is " + kilometers + " kilometers");
    }
}
