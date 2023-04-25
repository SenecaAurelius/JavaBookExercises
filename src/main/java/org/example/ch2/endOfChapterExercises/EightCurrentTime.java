package org.example.ch2.endOfChapterExercises;

import java.util.Scanner;

public class EightCurrentTime {
    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        System.out.println("Unmodified time is  " + currentHour + ":" +
                currentMinute + ":" + currentSecond + " GMT.");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        long timeToOffset = input.nextLong();
        currentHour += timeToOffset;
        System.out.println("Time with the offset is " + currentHour + ":" +
                currentMinute + ":" + currentSecond + " GMT.");
    }
}
