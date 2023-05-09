package org.example.ch7.endOfChapterExercises;

import java.util.Arrays;
import java.util.Scanner;

public class H8AverageAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 values : ");
//        int[] scores = new int[10];
//        for(int i = 0; i < 10; i++){
//            scores[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(scores));
//        System.out.println("The average is " + average(scores));
        double[] scores = new double[10];
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(scores));
        System.out.println("The average is " + average(scores));

    }

    public static int average(int[] array){
        int average = 0;
        for(int i = 0; i < array.length; i++){
            average += array[i];
        }
        average /= array.length;
        return average;
    }

    public static double average(double[] array){
        double average = 0;
        for(int i = 0; i < array.length; i++){
            average += array[i];
        }
        average /= array.length;
        return average;
    }
}
