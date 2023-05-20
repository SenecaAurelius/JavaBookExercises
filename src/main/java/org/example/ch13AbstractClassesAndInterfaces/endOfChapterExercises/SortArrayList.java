package org.example.ch13AbstractClassesAndInterfaces.endOfChapterExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList {
    public static void main(String[] args) {
        //On page 559

        sort(new ArrayList<>(Arrays.asList(9 ,6, 3, 1, 9, 8)));
    }

    public static void sort(ArrayList<Number> list){
        //ArrayList<Number> sortedList = new ArrayList<>();
        Number[] arrList = (Number[]) list.toArray();
        //Number min = list.get(0);
        for(int i = 0; i < arrList.length - 1; i++){
            Number currentMin = arrList[i];
            int currentMinIndex = i;

            for(int b = i + 1; b < list.size(); b++){
                if(currentMin.doubleValue() > list.get(b).doubleValue()){
                    currentMin = arrList[b];
                    currentMinIndex = b;
                }
            }

            //swap list[i] with list[currentMinIndex if necessary
            if(currentMinIndex != i){
                arrList[currentMinIndex] = arrList[i];
                arrList[i] = currentMin;
            }

//            sortedList.add(min);
//            min = list.get(i);
        }
        for(Number num : arrList){
            System.out.println(num);
        }
    }
}
