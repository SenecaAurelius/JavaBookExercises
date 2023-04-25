package org.example.ch1;

public class Exercise_Twelve_Avg_Spd_KM {
    public static void main(String[] args){

        Double distance = 24 * 1.6;
        double time = 3600 + (40 * 60) + 35;
        System.out.println((distance / time) * 60 * 60);


        System.out.print("If a runner runs 24 miles in 1 hour, 40 minutes and 35 seconds, his average speed in kilometers per hour is: ");
        System.out.println(24 * 1.6 * 60 / 100.583333);
    }
}
