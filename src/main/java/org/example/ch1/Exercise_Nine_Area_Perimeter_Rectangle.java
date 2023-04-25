package org.example.ch1;

public class Exercise_Nine_Area_Perimeter_Rectangle {
    public static void main(String[] args){
        double width = 5.3;
        double height = 8.6;
        System.out.println(area(width, height));
        System.out.println(perimeter(width, height));
    }

    public static double area(double width, double height){
        return width * height;
    }

    public static double perimeter(double width, double height){
        return 2 * (width + height);
    }
}
