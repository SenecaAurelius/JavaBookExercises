package org.example.ch10.inBookExercises;
import java.util.Scanner;

import static java.lang.Long.reverse;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string to check : ");
        String s = input.nextLine();

        System.out.println("Ignoring nonalphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));

    }
    public static boolean isPalindrome(String s){
        //Create a new string by eliminating nonalphanumeric chars
        String s1 = filter(s);
        //Create a new string that is the reversal of s1
        String s2 = reverse(s1);
        System.out.println(s2);
        //Check if the reversal is the same as the original string
        return s2.equals(s1);
    }

    public static String filter(String s){

        //create the string builder
        StringBuilder stringBuilder = new StringBuilder();
        //Examine each char in the string to skip alphanumeric char
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }


}
