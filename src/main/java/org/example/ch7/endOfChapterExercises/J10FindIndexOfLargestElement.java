package org.example.ch7.endOfChapterExercises;

import java.util.Arrays;
import java.util.Scanner;

public class J10FindIndexOfLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers : ");
        double[] arr = new double[10];
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The last index of the largest element is " + indexOfLargestElement(arr));
        System.out.println("The number is " + arr[indexOfLargestElement(arr)] + ".");
    }

    public static int indexOfLargestElement(double[] array){
        int index = 0;
        double max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] >= max){
                index = i;
                max = array[i];
            }
        }
        return index;
    }
}
