package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class REighteenPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of each side of a triangle, separated by a space : ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        if(s1 + s2 < s3 || s2 + s3 < s1 || s3 + s1 < s2){
            System.out.println("Your lengths don't make a triangle! The input is invalid.");
        } else{
            double perimeter = s1 + s2 + s3;
            System.out.println("The perimeter is " + perimeter);
        }
        input.close();

        //(Compute the perimeter of a triangle) Write a program that reads three edges for a
//triangle and computes the perimeter if the input is valid. Otherwise, display that the
//input is invalid. The input is valid if the sum of every pair of two edges is greater
//than the remaining edge
    }
}
