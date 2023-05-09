package org.example.ch5.endOfBookExercises;

public class F6SquareMetersToPing {
    public static void main(String[] args) {
        //1 ping == 3.305
        double ping = 10;
        double squareMeters = ping * 3.305;

        double squareMetersTwo = 30;
        double pingTwo = squareMetersTwo / 3.305;
        int count = 0;
        System.out.println("Ping  :  Square Meters  | Square Meters  :  Ping  ");
        while(count < 15){
            System.out.println(ping + "    " + squareMeters + " | " + squareMetersTwo + "    " + pingTwo);
            ping += 5;
            squareMeters = ping * 3.305;
            squareMetersTwo += 5;
            pingTwo = squareMetersTwo / 3.305;
            count++;
        }
    }
}
