package org.example.ch7.inBookExercises;

public class TestErrors {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 4};
        for(int i = 0, j = list.length - 1; i < j; i++, j--){
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
