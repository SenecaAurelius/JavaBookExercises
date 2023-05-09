package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class EFiveFindFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer corresponding to the weekday : (Sunday is 0, Monday is 1, etc)");
        int currentDay = input.nextInt();
        System.out.println("Enter the number of days that you would like to pass : ");
        int futureDay = input.nextInt();
        String day = "";
        switch(currentDay){
            case 0 : day = "Sunday"; break;
            case 1 : day = "Monday"; break;
            case 2 : day = "Tuesday"; break;
            case 3 : day = "Wednesday"; break;
            case 4 : day = "Thursday"; break;
            case 5 : day = "Friday"; break;
            case 6 : day = "Saturday"; break;
        }
        futureDay = ((futureDay % 7) + currentDay) % 7;
        String strFutureDay = "";
        switch(futureDay){
            case 0 : strFutureDay = "Sunday"; break;
            case 1 : strFutureDay = "Monday"; break;
            case 2 : strFutureDay = "Tuesday"; break;
            case 3 : strFutureDay = "Wednesday"; break;
            case 4 : strFutureDay = "Thursday"; break;
            case 5 : strFutureDay = "Friday"; break;
            case 6 : strFutureDay = "Saturday"; break;
        }
        System.out.println("Today is " + day + " and the future day is " + strFutureDay + ". ");

    }
}
