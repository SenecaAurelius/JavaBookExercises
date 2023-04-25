package org.example.ch1;

public class Exercise_Eight_Area_Perimeter_Circle {

    public static void main(String[] args){
        System.out.println(perimeter(6.5));
        System.out.println(area(6.5));

    }

    public static double perimeter(double radius){
        double pi = 3.14159;
        double perimeter = 2 * radius * pi;
        return perimeter;
    }

    public static double area(double radius){
        double pi = 3.14159;
        double area = radius * radius * pi;
        return area;
    }


}
