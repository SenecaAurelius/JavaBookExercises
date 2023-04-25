package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;
public class SixMultiplyDigitsInAnInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between 0 and 1000 : ");
        int numberToSeparate = input.nextInt();
        //lots of if statements depending on size of input
        if (numberToSeparate < 10){
            System.out.println(numberToSeparate);
        } else if (numberToSeparate < 100){
            int doubleDigit = numberToSeparate % 10;
            int tripleDigit = ((numberToSeparate - doubleDigit) % 100) / 10;
            System.out.println(doubleDigit * tripleDigit);
        } else if (numberToSeparate < 1000){
            int doubleDigit = numberToSeparate % 10;
            int tripleDigit = ((numberToSeparate - doubleDigit) % 100) / 10;
            int singleDigit = ((numberToSeparate - tripleDigit - doubleDigit) % 1000) / 100;
            int multiplyDigits = doubleDigit * tripleDigit * singleDigit;
            System.out.println(multiplyDigits);
        } else {
            System.out.println("You entered a number that is too large! Try again. ");
        }



//        System.out.println(doubleDigit);
//        System.out.println(tripleDigit);
//        System.out.println(singleDigit);
//        int multiplyDigits = doubleDigit * tripleDigit * singleDigit;
//        System.out.println(multiplyDigits);
    }
}
