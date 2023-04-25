package org.example.ch2.endOfChapterExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NineteenAreaOfATriangleWithThreePoints {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        //double num[] = new double[20];
        //String[] strNums;
        System.out.println("Enter the coordinates of three points separated by spaces : ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double s1 = Math.pow(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2), 0.5);
        double s2 = Math.pow(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2), 0.5);
        double s3 = Math.pow(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2), 0.5);

        double s = (s1 + s2 + s3) / 2;

        double area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

        System.out.println("The area of the triangle is " + area);

//        //double x1 = input.nextDouble();
//        strNums = bi.readLine().split(" ");
//        for(int i = 0; i < strNums.length; i++){
//            num[i] = Double.parseDouble(strNums[i]);
//        }
//
//        System.out.println("Printing stored numbers ");
//
//        for(int i = 0; i < strNums.length; i++){
//            System.out.println(num[i]);
//        }

    }
}
