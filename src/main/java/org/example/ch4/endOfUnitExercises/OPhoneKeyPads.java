package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class OPhoneKeyPads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char c = '!';
        while(!isLetter(c)){
            System.out.println("Please enter a number to turn into its corresponding phone keypad number : ");
            String str = input.nextLine();
            c = str.toLowerCase().charAt(0); //instead of typing character, I'm going to use c, so I don't have to type too much.
            if(c == 'a' || c == 'b' || c == 'c'){
                System.out.println("The corresponding number is 2.");
            } else if(c == 'd' || c == 'e' || c == 'f'){
                System.out.println("The corresponding number is 3.");
            } else if(c == 'g' || c == 'h' || c == 'i'){
                System.out.println("The corresponding number is 4.");
            } else if(c == 'j' || c == 'k' || c == 'l'){
                System.out.println("The corresponding number is 5.");
            } else if(c == 'm' || c == 'n' || c == 'o'){
                System.out.println("The corresponding number is 6.");
            } else if(c == 'p' || c == 'q' || c == 'r' || c == 's'){
                System.out.println("The corresponding number is 7.");
            } else if(c == 't' || c == 'u' || c == 'v'){
                System.out.println("The corresponding number is 8.");
            } else if(c == 'w' || c == 'x' || c == 'y' || c == 'z'){
                System.out.println("The corresponding number is 9.");
            } else {
                System.out.println("You have to enter an alphabetical character, like the ones on old phones with buttons.");
            }
        }

    }
}
