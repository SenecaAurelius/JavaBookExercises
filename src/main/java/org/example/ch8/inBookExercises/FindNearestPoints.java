package org.example.ch8.inBookExercises;

import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of points : ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];

        System.out.println("Please enter " + numberOfPoints + " points : ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0;
        int p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        //compute distance for every two points
        for (int i = 0; i < points.length; i++) {
            for (int b = i + 1; b < points.length; b++) {
                double distance = distance(points[i][0], points[i][1], points[b][0], points[b][1]);
                //finds distance

                if (shortestDistance > distance) {
                    p1 = i; //update p1
                    p2 = b; //update p2
                    shortestDistance = distance; //update distance
                }
            }
        }

        System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
                points[p2][0] + ", " + points[p2][1] + ")");
    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 -x1) + (y2 - y1) * (y2 - y1));
    }

}
