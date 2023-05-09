package org.example.ch7.endOfChapterExercises;

import java.util.Arrays;

public class G7CountSingleDigits {
    public static void main(String[] args) {
        int[] numbersArr = new int[200];
        for(int i = 0; i < 200; i++){
            numbersArr[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(numbersArr));
        int[] counts = new int[10];
        for(int i = 0; i < numbersArr.length; i++){
            counts[numbersArr[i]]++;
        }
        System.out.println(Arrays.toString(counts));
        for(int i = 0; i < counts.length; i++){
            System.out.println(i + " occurs " + counts[i] + " times.");
        }
        int sumCheck = 0;
        for(int i = 0; i < counts.length; i++){
            sumCheck += counts[i];
        }
        System.out.println(sumCheck + " should equal 200?");
    }
}
