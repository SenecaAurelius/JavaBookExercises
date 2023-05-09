package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class YTwentyFiveIntersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 4 points, x, y, x2, y2, x3, y3, and x4, y4 : ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        //(y -y2)ax - (x - x2)ay = (y - y2)x - (x - x2)y;

//        if(!(a*d - b*c == 0)){
//            double det = ((a) * (d) - (b) * (c));
//            double x = ((d) * (e) - (b) * (f)) / det;
//            double y = ((a) * (f) - (c) * (e)) / det;
//            System.out.println("x = " + x + ", y = " + y);
//        }
    }
}
