package org.example.ch7.inBookExercises;

public class TestArrayReversal {
    public static void main(String[] args) {
        int[] list = new int[10];
        for(int i = 0; i < list.length; i++){
            int rand = (int)(Math.random() * 100);
            list[i] = rand;
        }
        //System.out.println(list);
        int sum = 0;
        for(int i = 0; i < list.length; i++){
            sum += list[i];
            System.out.println(list[i]);
        }
        System.out.println(sum + ", here is the sum.");

        int[] result = new int[list.length];
//        int j;
        for(int i = 0, j = result.length - 1; i < list.length; i++, j--){
            result[j] = list[i];
        }
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
