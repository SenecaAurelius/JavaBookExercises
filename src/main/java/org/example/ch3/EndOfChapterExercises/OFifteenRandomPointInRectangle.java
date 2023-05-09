package org.example.ch3.EndOfChapterExercises;

import java.util.Random;

public class OFifteenRandomPointInRectangle {
    public static void main(String[] args) {
//        (Random point) Write a program that displays a random coordinate in a rectangle.
//         The rectangle is centred at (0, 0) with width 50 and height 150.
        //-25 - 25 width x axis
        //-75-75 height.

        //Random r = new Random();
        //int low = 10;
        //int high = 100;
        //int result = r.nextInt(high-low) + low;

//        Random random = new Random();
//        int xLow = -25;
//        int xHigh = 26;
//        int x = random.nextInt(xHigh - xLow) + xLow;
//
//        int yLow = -75;
//        int yHigh = 76;
//        int y = random.nextInt(yHigh - yLow) + yLow;


        for(int i = 0; i < 100; i++){
            Random random = new Random();
            int xLow = -25;
            int xHigh = 26;
            int x = random.nextInt(xHigh - xLow) + xLow;

            int yLow = -75;
            int yHigh = 76;
            int y = random.nextInt(yHigh - yLow) + yLow;
            System.out.println("{" + x + ", " + y + "} is your random point within the rectangle. ");
        }
        //System.out.println("{" + x + ", " + y + "} is your random point within the rectangle. ");
    }
}
