package org.example.ch7.inBookExercises;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarySearch(list, 4);
        int j = binarySearch(list, 11);
        int k = binarySearch(list, 12);
        int l = binarySearch(list, 1);
        int m = binarySearch(list, 3);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
    }

    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        int mid = (low + high) / 2;

        while(low <= high){
            if(key < list[mid]){
                high = mid - 1;
            } else if(list[mid] == key){
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
