package org.example.ch7.endOfChapterExercises;

import java.util.Arrays;
import java.util.Scanner;

public class C3CountOccurrencesOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 integers separated by a space : ");
        int[] numsList = new int[10];
        for (int i = 0; i < 10; i++) {
            numsList[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numsList));
        countChars(numsList);
        displayCounts(countChars(numsList));
    }

    public static int[] countChars(int[] list) {
        int[] oneToFiftyCounts = new int[50];
        for (int i = 0; i < list.length; i++) {
            oneToFiftyCounts[list[i] - 1]++;
//            int count = 1;
//            for(int b = i + 1; b < list.length; b++){
//                if(list[b] == list[i]){
//                    count++;
//                }
        }
        return oneToFiftyCounts;
    }

    public static void displayCounts(int[] counts){
        for(int i = 0; i < counts.length; i++){
            if(counts[i] == 0){
                continue;
            }
            if(counts[i] > 1){
                System.out.println((i + 1) + " occurs " + counts[i] + " times.");

            } else {
                System.out.println((i + 1) + " occurs " + counts[i] + " time.");

            }
        }
    }
}
