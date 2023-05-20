package org.example.ch13AbstractClassesAndInterfaces.endOfChapterExercises;

import org.example.ch13AbstractClassesAndInterfaces.inBookExercises.rationalClass.ShowOutput;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
//        Triangle t1 = new Triangle(2, 2, 2, "Black", false);
//        System.out.println(t1.getArea());
//        System.out.println(t1.getPerimeter());
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the three side lengths, separated by a space : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("What color is the triangle? ");
        String color = input.next();
        System.out.println("Is the triangle filled with that color? (Enter true or false) ");
//        String isFilled = input.next();
        boolean booleanIsFilled = input.nextBoolean();

        Triangle inputTriangle = new Triangle(side1, side2, side3, color, booleanIsFilled);
        System.out.println(inputTriangle.toString());


    }
}
