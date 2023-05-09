package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

public class W24AlphabeticalOrderOfThreeCountries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your three countries, separated by spaces : ");
        String c1 = input.next();
        String c2 = input.next();
        String c3 = input.next();
        String firstCountry = "";
        String secondCountry = "";
        String thirdCountry = "";
        if(c1.toLowerCase().charAt(0) < c2.toLowerCase().charAt(0)){

            if(c1.toLowerCase().charAt(0) < c3.toLowerCase().charAt(0)){
                firstCountry = c1;

                if(c2.toLowerCase().charAt(0) < c3.toLowerCase().charAt(0)){
                    secondCountry = c2;
                    thirdCountry = c3;
                } else {
                    secondCountry = c3;
                    thirdCountry = c2;
                }
            } else {
                firstCountry = c3;
                if(c1.toLowerCase().charAt(0) < c2.charAt(0)){
                    secondCountry = c1;
                    thirdCountry = c2;
                } else {
                    secondCountry = c2;
                    thirdCountry = c1;
                }
            }


        } else {

            if(c2.toLowerCase().charAt(0) < c3.toLowerCase().charAt(0)){
                firstCountry = c2;
                if(c1.toLowerCase().charAt(0) < c3.toLowerCase().charAt(0)){
                    secondCountry = c1;
                    thirdCountry = c3;
                }
                else {
                    secondCountry = c3;
                    thirdCountry = c1;
                }
            } else {
                firstCountry = c3;
                if(c1.toLowerCase().charAt(0) < c2.toLowerCase().charAt(0)){
                    secondCountry = c1;
                    thirdCountry = c2;
                }
                else {
                    secondCountry = c2;
                    thirdCountry = c1;
                }
            }


        }


        System.out.println("The three countries in alphabetical order are " + firstCountry + ", "
                + secondCountry + ", "
                + thirdCountry + ".");
    }
}
