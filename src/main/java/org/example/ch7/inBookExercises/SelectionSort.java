package org.example.ch7.inBookExercises;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println(Arrays.toString(list));
        selectionSortHighToLow(list);
        System.out.println(Arrays.toString(list));
    }

    public static void selectionSort(double[] list){
        for(int i = 0; i < list.length - 1; i++){
            //find the min in the list
            double currentMin = list[i];
            int currentMinIndex = i;

            for(int j = i + 1; j < list.length; j++){
                if(currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        //System.out.println(Arrays.toString(list));
    }

    public static void selectionSortHighToLow(double[] list){
        for(int i = 0; i < list.length - 1; i++){
            double currentMax = list[i];
            int currentMaxIndex = i;

            for(int b = i + 1; b < list.length; b++){
                if(currentMax < list[b]){
                    currentMax = list[b];
                    currentMaxIndex = b;
                }
            }
            if(currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
