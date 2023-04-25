package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class SevenFindTheNumberOfYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number of minutes to determine" +
                " how many years are within that number, along with the remaining days");
        long minutes = input.nextLong();
        long years = minutes / (365 * 24 * 60);
        long days = minutes / 60 / 24 % 365;
        System.out.println(minutes + " minutes contains " + years + " years and " + days + " days!");
    }
}
