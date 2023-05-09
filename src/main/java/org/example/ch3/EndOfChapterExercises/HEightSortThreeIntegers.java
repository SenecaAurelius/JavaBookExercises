package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class HEightSortThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three intergers to sort, each separated by a space : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1 > num2){
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if(num1 > num3){
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if(num2 > num3){
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Here are the ordered numbers : " + num1 + ", " + num2 + ", " + num3 + ".");
    }
}
