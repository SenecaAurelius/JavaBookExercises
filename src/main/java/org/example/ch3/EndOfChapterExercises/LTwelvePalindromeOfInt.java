package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class LTwelvePalindromeOfInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 3 digit integer : ");
        int beforeCheck;
//        //int beforeCheck = input.nextInt();
//        do {
//            System.out.println("Please enter an integer between -999 and 999 : ");
//            beforeCheck = input.nextInt();
//        } while(beforeCheck > 999 || beforeCheck < -999);
        beforeCheck = input.nextInt();
        int intToCheck = Math.abs(beforeCheck);
        int d1 = intToCheck % 10;
        int d2 = ((intToCheck - d1) % 100) / 10;
        int d3 = ((intToCheck - d2 - d1) % 1000) / 100;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        if(d1 == d3){
            System.out.println(intToCheck + " is a palindrome. :) ");
        } else {
            System.out.println("You ain't got shit! No palindrome 4 u. ;__; ");
        }



//        (Palindrome integer) Write a program that prompts the user to enter a three-digit
//integer and determines whether it is a palindrome integer. An integer is palindrome
//if it reads the same from right to left and from left to right. A negative integer is
//treated the same as a positive integer. Here are sample runs of this program:
    }
}
