package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

public class U22CheckSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first string : ");
        String str1 = input.nextLine();
        System.out.println("Please enter the second string : ");
        String str2 = input.nextLine();

        if(str1.indexOf(str2) != -1){
            System.out.println("String 2 : " + str2 + ", is inside of String 1 : " + str1 + ".");
        } else if (str2.indexOf(str1) != -1){
            System.out.println("String 1 : " + str1 + ", is inside of String 2 : " + str2);
        } else {
            System.out.println("Neither of the strings reside inside the other.");
        }
    }
}
