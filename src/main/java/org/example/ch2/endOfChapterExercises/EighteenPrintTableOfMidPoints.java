package org.example.ch2.endOfChapterExercises;

import java.awt.*;
import java.util.ArrayList;

public class EighteenPrintTableOfMidPoints {
//    (Print a table) Write a program that displays the following table. Calculate the
//middle point of two points.
// a b Middle Point
//(0, 0) (2, 1) (1.0, 0.5)
//(1, 4) (4, 2) (2.5, 3.0)
//(2, 7) (6, 3) (4.0, 5.0)
//(3, 9) (10, 5) (6.5, 7.0)
//(4, 11) (12, 7) (8.0, 9.0)
    public static void main(String[] args){
//        HashMap<Double, Double> points = new HashMap<>();
//        points.put(0., 0.);
//        points.put(2., 1.);
//        for(Map.Entry point : points.entrySet()){
//            System.out.println(point.getKey() + " : " + point.getValue());
//        }
        ArrayList<PointObject> points = new ArrayList<>();
        PointObject point1 = new PointObject(0, 0, 2, 1);
        PointObject point2 = new PointObject(1, 4, 4, 2);
        PointObject point3 = new PointObject(2, 7, 6, 3);
        PointObject point4 = new PointObject(3, 9, 10, 5);
        PointObject point5 = new PointObject(4, 11, 12, 7);
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point5);
        System.out.println("Point A : Point B : Middle Point");
        for(PointObject point : points){
            System.out.println(point.printPointsAndMidPoint());
        }
        //System.out.println();
    }
}
