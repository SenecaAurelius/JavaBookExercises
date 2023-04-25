package org.example.ch2;

import java.util.Scanner;

public class TestCode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius : ");
        double radius = input.nextDouble();
        System.out.println(area(radius));
        
    }

    public static double area(double radius){
        return radius * radius * 3.14159;
    }
}
