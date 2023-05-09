package org.example.ch6.endOfChapterExercises;

import java.util.Scanner;

public class E5SortThreeNumbers {
    public static void main(String[] args) {
        displaySortedNumbers(1, 2, 3);
        displaySortedNumbers(3, 2, 1);
        displaySortedNumbers(3, 1, 2);
        displaySortedNumbers(1, 3, 2);
        displaySortedNumbers(2, 1, 3);
        displaySortedNumbers(2, 3, 1);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers, separated by spaces :");
        double one = input.nextDouble();
        double two = input.nextDouble();
        double three = input.nextDouble();
        displaySortedNumbers(one, two, three);

    }
    public static void displaySortedNumbers(double num3, double num2, double num1){
//        double x = num3;
//        double y = num2;
//        double z = num1;
//        double max = z;
//        if(x > max || y > max){
//            if (x > y){
//                max = x;
//            } else {
//                max = y;
//            }
//        }
//        double min = z;
//        if(x < min || y < min){
//            if(x < y){
//                min = x;
//            } else {
//                min = y;
//            }
//        }
//        double mid = x + y + z - max - min;
//        System.out.printf("In order %f %f %f%n", max, mid, min);
        double max = Math.max(num3, Math.max(num2, num1));
        double min = Math.min(num3, Math.min(num2, num1));
        double mid = num3 + num2 + num1 - max - min;
        System.out.printf("In descending order : %f %f %f%n", max, mid, min);

    }
}
