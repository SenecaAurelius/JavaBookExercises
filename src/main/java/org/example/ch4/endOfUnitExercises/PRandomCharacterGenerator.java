package org.example.ch4.endOfUnitExercises;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PRandomCharacterGenerator {
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++){
//            Random random = new Random();
//            int randomChar = random.nextInt(65, 123);
            //int randomChar = (int)( (Math.random() * 188) - 65);
            int randomChar = ThreadLocalRandom.current().nextInt(65, 123);
            while(randomChar > 90 && randomChar < 98 ){
                randomChar = ThreadLocalRandom.current().nextInt(65, 123);
            }
            System.out.print(Math.abs(randomChar) + " : ");
            char c = (char)randomChar;
            System.out.println(c);
        }

    }
}
