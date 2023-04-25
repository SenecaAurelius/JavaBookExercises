package org.example.ch1;

import java.math.BigDecimal;

public class Exercise_Eleven_Population_Projection {
    public static void main(String[] args){
        double year = 365;
        double day = 24;
        double hour = 60;
        double minute = 60;
        double secPerYear = year * day * hour * minute;
        System.out.println(secPerYear);
        double birthsPerYear = secPerYear / 7;
        double deathPerYear = -(secPerYear / 13);
        double immigrantsPerYear = secPerYear / 45;
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
        for(int i = 1; i < 6; i++){
            System.out.println("The population in year " + i + " will be : " +
                    new BigDecimal(startingPopulation + (changePerYear)));
            startingPopulation += changePerYear;
        }

    }
//    public static void main(String[] args) {
//        System.out.println("If the current population is 312,032,486, projection of the population for the next five years would go as follows:" );
//        System.out.println(312032486 + 365 * 24 * 60 * 60 * (1.0 / 7 - 1.0 / 13 + 1.0 / 45));
//        System.out.println(312032486 + 2 * 365 * 24 * 60 * 60 * (1.0 / 7 - 1.0 / 13 + 1.0 / 45));
//        System.out.println(312032486 + 3 * 365 * 24 * 60 * 60 * (1.0 / 7 - 1.0 / 13 + 1.0 / 45));
//        System.out.println(312032486 + 4 * 365 * 24 * 60 * 60 * (1.0 / 7 - 1.0 / 13 + 1.0 / 45));
//        System.out.println(312032486 + 5 * 365 * 24 * 60 * 60 * (1.0 / 7 - 1.0 / 13 + 1.0 / 45));
//    }

//    If the current population is 312,032,486, projection of the population for the next five years would go as follows:
//3.148125827032967E8
//3.175926794065934E8
//3.203727761098901E8
//3.231528728131868E8
//3.2593296951648355E8
}
