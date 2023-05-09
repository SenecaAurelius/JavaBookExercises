package org.example.ch7.endOfChapterExercises;

public class B2ComparingNumbers {
    public static void main(String[] args) {
        int[] numList = {18, 19, 2, 20, 24, 12, 4, 2, 7, 15, 16, 10};
        compareToLastNum(numList);
        int[] numList2 = {18, 129, -2, 210, 924, 10, 4, 2, 7, 15, 16, 10};
        compareToLastNum(numList2);
    }

    public static void compareToLastNum(int[] list){
        int lastInt = list[list.length - 1];
        for(int i = 0; i < list.length; i++){
            if(list[i] > lastInt){
                System.out.println(list[i] + " is Greater Than " + lastInt);
            } else if(list[i] == lastInt){
                System.out.println(list[i] + " is Equal To " + lastInt);
            } else{
                System.out.println(list[i] + " is Less Than " + lastInt);
            }
        }
    }
}
