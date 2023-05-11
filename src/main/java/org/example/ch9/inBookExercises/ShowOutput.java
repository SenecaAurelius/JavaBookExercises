package org.example.ch9.inBookExercises;

import java.util.Random;

public class ShowOutput {
    public static void main(String[] args) {
        Random generator = new Random(3);
        System.out.print("From generator 1 : ");
        for(int i = 0; i < 10; i++){
            System.out.print(generator.nextInt(1000) + " ");
        }

        Random generator2 = new Random(3);
        System.out.print("\nFrom generator 2 : ");
        for(int i = 0; i < 10; i++){
            System.out.print(generator2.nextInt(1000) + " ");
        }
        //Can use java.security.SecureRandom instead of random
        //The random class by itself can be predicted by hackers.
    }
}
