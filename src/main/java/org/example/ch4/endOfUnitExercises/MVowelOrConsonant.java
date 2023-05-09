package org.example.ch4.endOfUnitExercises;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class MVowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter to determine if it is a consonant or vowel : ");
        String str = input.nextLine();
        char character = str.toLowerCase().charAt(0);
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            System.out.println(str.charAt(0) + " is a vowel! ");
        } else if(isLetter(character)) {
            System.out.println(str.charAt(0) + " is a consonant! ");
        } else {
            System.out.println("Please check your input and only enter a single alphabetical character. ");
        }
    }
}
