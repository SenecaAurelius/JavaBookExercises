package org.example.ch7.endOfChapterExercises;

import java.util.Arrays;
import java.util.Scanner;

public class I9FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ten digits : ");
        double[] arr = new double[10];
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The max is " + max(arr));
    }

    public static double max(double[] list){
        double max = list[0];
        for(int i = 1; i < list.length; i++){
            if(list[i] > max){
                max = list[i];
            }
        }
        return max;
    }
}
