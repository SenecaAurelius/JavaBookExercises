package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class UTwentyOneComputeDayOfWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year, month, and day, separated by a space : ");
        int year = input.nextInt();
        int m = input.nextInt();
        if(m == 1){
            m = 13;
            year -= 1;
        } else if (m == 2){
            m = 14;
            year -= 1;
        }
        int j = year / 100;
        int k = year % 100;

        int q = input.nextInt();

        String str = "";
        int h = (q +  ((26 * (m + 1)) / 10) + k + (k/4) + (j/4) + (5 * j) ) % 7;
        switch(h){
            case 0 : str = "Saturday"; break;
            case 1 : str = "Sunday"; break;
            case 2 : str = "Monday"; break;
            case 3 : str = "Tuesday"; break;
            case 4 : str = "Wednesday"; break;
            case 5 : str = "Thursday"; break;
            case 6 : str = "Friday"; break;
        }
        System.out.println("The day of the week is " + str + ". ");
    }
}
