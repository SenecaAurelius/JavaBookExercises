package org.example.ch13AbstractClassesAndInterfaces.endOfChapterExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(10);
        list2.add(555);
        average(list1);
        average(list2);
    }

    public static void average(ArrayList<Integer> list){
        int sum = 0;
        for(Integer num : list){
            sum += num;
        }
        int average = sum / list.size();
        System.out.println(average);
    }
}
