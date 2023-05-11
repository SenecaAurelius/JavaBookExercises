package org.example.ch8.inBookExercises;

public class ShowOutputTest {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        for(int i = arr.length - 1; i >= 0; i--){
            for(int b = arr[i].length - 1; b >= 0; b--){
                System.out.print(arr[i][b] + " ");

            }
            System.out.println();
        }
    }
}
