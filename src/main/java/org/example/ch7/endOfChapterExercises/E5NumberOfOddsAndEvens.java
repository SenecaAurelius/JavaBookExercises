package org.example.ch7.endOfChapterExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E5NumberOfOddsAndEvens {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers to put into the array : ");
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The number of odd numbers : " + countOdds(arr));
        System.out.println("The number of even numbers : " + countEvens(arr));
    }

    public static int countEvens(int[] list){
        int evenCount = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int countOdds(int[] list){
        int oddCount = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] % 2 != 0){
                oddCount++;
            }
        }
        return oddCount;
    }
}
