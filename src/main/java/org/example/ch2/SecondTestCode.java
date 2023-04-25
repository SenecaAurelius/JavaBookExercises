package org.example.ch2;

import java.util.*;
public class SecondTestCode {
    public static void main(String[] args){
//        int remainingDays = 100 % 7;
//        System.out.println(remainingDays);
//to improve readability Java allows you to put underscores between two digits in a number literal.
//        System.out.println(2 * (5 / 2 + 5 / 2)); // 8
//        System.out.println(2 * 5 / 2 + 2 * 5 / 2);//10
//        System.out.println(2 * (5 / 2));//4
//        System.out.println(2 * 5 / 2);//5
//        System.out.println("25 / 4 is " + 25 / 4);//6
//        System.out.println("25 / 4.0 is " + 25 / 4.0);//6.25
//        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);//1
//        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);//1.5
        //System.out.println(Math.pow(2, 3.5));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius.");


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please input 3 numbers to average : ");
//        double number1 = input.nextDouble();
//        double number2 = input.nextDouble();
//        double number3 = input.nextDouble();
//
//        double average = (number1 + number2 + number3) / 3;
//        System.out.println("The average of the three is : " + average);
//
//        int i , j , k = 2;
//        j = k;
//        i = j;
//        System.out.println(i + " " + j + " " + k);
//
//        double miles = 100;
//        final double KILOMETERS_PER_HOUR = 1.609;
//        double kilometers = miles * KILOMETERS_PER_HOUR;
//        System.out.println(kilometers);
    }


}
