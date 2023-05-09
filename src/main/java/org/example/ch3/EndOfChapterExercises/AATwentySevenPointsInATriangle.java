package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class AATwentySevenPointsInATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers, separated by a space, to determine if a point is within a triangle : ");
        double x = input.nextDouble();
        double y = input.nextDouble();
//The right-angle point is placed at (0, 0), and the other two points
//are placed at (200, 0) and (0, 100). W
        double Ax = 0;
        double Ay = 0;
        double Bx = 200;
        double By = 0;
        double Cx = 0;
        double Cy = 100;

        double area = (Ax * (By - Cy) + Bx * (Cy -Ay) + Cx * (Ay - By)) / 2;
        System.out.println("The area of the triangle we are checking is " + area);

        double areaA = (x * (By - Cy) + Bx * (Cy -y) + Cx * (y - By)) / 2; // missing A
        double areaB = (Ax * (y - Cy) + x * (Cy -Ay) + Cx * (Ay - y)) / 2; // missing B
        double areaC = (Ax * (By - y) + Bx * (y -Ay) + x * (Ay - By)) / 2; // missing C
//pab, pac, pbc
        if((Math.abs(areaA) + Math.abs(areaB) + Math.abs(areaC)) == Math.abs(area)) {
            System.out.println("The point (" + x + ", " + y + ") is inside/on the triangle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is not inside/on the triangle.");
        }
//        Area A = [ x1(y2 – y3) + x2(y3 – y1) + x3(y1-y2)]/2
    }
}
