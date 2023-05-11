package org.example.ch8.inBookExercises;

public class ShowOutputTest2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][0];
        }
        System.out.println(sum);
    }
}
