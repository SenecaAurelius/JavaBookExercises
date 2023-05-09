package org.example.ch4.endOfUnitExercises;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class TCheckSSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a SSN to check : ");
        String social = input.nextLine();
        boolean isGood = false;

        if(social.charAt(3) != '-' && social.charAt(6) != '-'){
            System.out.println("That is an invalid social.");
            System.exit(1);
        }

        for(int i = 0; i < social.length(); i++){

            if(i == 3 || i == 6){
                continue;
            }
            if(!isDigit(social.charAt(i))){
                System.out.println("That is an invalid social.");
                System.exit(1);
                break;
            }
        }

        System.out.println(social + " seems to be a valid social! ");

    }
}
