package org.example.ch11.inBookExercises;

public class ShowOutput {
    public static void main(String[] args) {
        Integer[] list1 = {12, 24, 55, 1};
        Double[] list2 = {1.1, 1.4, 1.8};
        int[] list3 = {1, 2, 3};
        printArray(list1);
        printArray(list2);
        //The following doesn't work because it isn't an object
        //printArray(list3);
    }

    public static void printArray(Object[] list){
        for(Object o : list){
            System.out.println(o + " ");
        }
        System.out.println();
    }
}
