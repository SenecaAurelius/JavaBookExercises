package org.example.ch9.endOfChapterExercises;

import java.util.Random;

public class D4UseRandom {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for(int i = 0; i < 1000; i++){
            System.out.println(random.nextInt(101));
        }
    }
}
