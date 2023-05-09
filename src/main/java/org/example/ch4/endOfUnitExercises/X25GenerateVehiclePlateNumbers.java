package org.example.ch4.endOfUnitExercises;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class X25GenerateVehiclePlateNumbers {
    public static void main(String[] args) {
        //Random random = new Random();
        //random.nextInt(65, 123);
        //int randomNumber = ThreadLocalRandom.current().nextInt(65, 123);

        for(int i = 0; i < 11; i++){
            String str = "";
            for(int j = 0; j < 3; j++){
                int randomNumber = ThreadLocalRandom.current().nextInt(65, 123);
                while(randomNumber > 90 && randomNumber < 97){
                    randomNumber = ThreadLocalRandom.current().nextInt(65, 123);
                }
                str += (char) randomNumber;
            }
            //System.out.println(str);
            for(int j = 0; j < 4; j++){
                int randomNumber = ThreadLocalRandom.current().nextInt(0, 9);
                str += randomNumber;
            }
            System.out.println(str);
        }
    }
}
