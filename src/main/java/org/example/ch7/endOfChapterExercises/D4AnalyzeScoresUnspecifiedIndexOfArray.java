package org.example.ch7.endOfChapterExercises;


import java.util.Arrays;
import java.util.Scanner;

public class D4AnalyzeScoresUnspecifiedIndexOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter? ");
        int indexes = input.nextInt();
        double[] scores = new double[indexes];

        System.out.println("Please enter the numbers separated by a space : ");
        for (int i = 0; i < indexes; i++) {
            scores[i] = input.nextDouble();
        }

        //while(input.nextInt() > 0){
//          scores[i]
//    }
        System.out.println(Arrays.toString(scores));
        double average = averageNumsInArray(scores);
        aboveOrEqualToAverage(scores, average);
        belowAverage(scores, average);

    }

    public static double averageNumsInArray(double[] list){
        double sum = 0;
        for(int i = 0; i < list.length; i++){
            sum += list[i];
        }
        double average = sum / list.length;
        return average;
    }

    public static void aboveOrEqualToAverage(double[] list, double average){
        int scoresAboveOrEqual = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] >= average){
                scoresAboveOrEqual++;
            }
        }
        System.out.println("The number of scores above or equal to " + average + " is " + scoresAboveOrEqual + ".");
    }

    public static void belowAverage(double[] list, double average){
        int scoresBelow = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] < average){
                scoresBelow++;
            }
        }
        System.out.println("The number of scores below " + average + " is " + scoresBelow + ".");

    }
}
