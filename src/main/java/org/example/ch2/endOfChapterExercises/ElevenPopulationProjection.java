package org.example.ch2.endOfChapterExercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class ElevenPopulationProjection {

//    (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
//to enter the number of years and display the population after the number of years.
//Use the hint in Programming Exercise 1.11 for this program. Here is a sample run
//of the program:
//Enter the number of years: 5
//The population in 5 years is 325932969
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To calculate the population, please enter an integer of how many years will pass : ");
        int yearsThatWillPass = input.nextInt();
        double year = 365; double day = 24; double hour = 60; double minute = 60;
        double secPerYear = year * day * hour * minute;
        System.out.println(secPerYear);
        double birthsPerYear = secPerYear / 7; double deathPerYear = -(secPerYear / 13); double immigrantsPerYear = secPerYear / 45;
        System.out.println("Births per year : " + birthsPerYear +
                "\nDeaths per year : " + deathPerYear +
                "\nImmigrants per year : " + immigrantsPerYear);
        double startingPopulation = 312032486;
        //double endingPopulation = startingPopulation + birthsPerYear + deathPerYear + immigrantsPerYear;
        double changePerYear = birthsPerYear + deathPerYear + immigrantsPerYear;
        //System.out.printf("%.9f", endingPopulation);
        System.out.println();
        //System.out.println(new BigDecimal(endingPopulation).toPlainString());
        //System.out.println(String.format("%.12f", endingPopulation));


        System.out.println("The starting population is " + new BigDecimal(startingPopulation).toPlainString());
        for(int i = 1; i < yearsThatWillPass + 1; i++){
            System.out.println("The population in year " + i + " will be : " +
                    new BigDecimal(startingPopulation + (changePerYear)));
            startingPopulation += changePerYear;
        }
    }
}
