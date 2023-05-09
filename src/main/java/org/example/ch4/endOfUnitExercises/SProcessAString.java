package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

public class SProcessAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string : (We will return to you it's length in characters, including spaces, and the last character you entered)");
        String str = input.nextLine();
        System.out.println("Length : " + str.length() + ", Last character : " + str.charAt(str.length() - 1));

    }
}
