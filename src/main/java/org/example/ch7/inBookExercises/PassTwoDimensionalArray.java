package org.example.ch7.inBookExercises;
import java.util.Scanner;
public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 13; i++){
            sum += i;
        }
        System.out.println(sum + " here is the sum of the first 12 digits. ");
        int[][] m = getArray();
        System.out.println("\nSum of all elements is " + sum(m));
    }

    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][4];
        System.out.println("Please enter " + m.length + " rows and " + m[0].length + " columns : ");
        for(int i = 0; i < m.length; i++){
            for(int b = 0; b < m[i].length; b++){
                m[i][b] = input.nextInt();
            }
        }
        return m;
    }

    public static int sum(int[][] m){
        int total = 0;
        for(int row = 0; row < m.length; row++){
            for(int column = 0; column < m[row].length; column++){
                total += m[row][column];
            }
        }
        return total;
    }

}
