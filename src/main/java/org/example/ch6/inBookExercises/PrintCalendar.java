package org.example.ch6.inBookExercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 0;
        while(year < 1800){
            System.out.println("Please enter a full year : ");
            year = input.nextInt();
        }
        int month = -1;
        while(month > 12 || month < 1){
            System.out.println("Please enter a month as a number between 1 and 12 : ");
            month = input.nextInt();
        }

        printMonth(year, month);
    }

    public static void printMonth(int year, int month){
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month){
        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("--------------------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month){
        String strMonth = "";
        switch(month){
            case 1 : strMonth = "January"; break;
            case 2 : strMonth = "February"; break;
            case 3 : strMonth = "March"; break;
            case 4 : strMonth = "April"; break;
            case 5 : strMonth = "May"; break;
            case 6 : strMonth = "June"; break;
            case 7 : strMonth = "July"; break;
            case 8 : strMonth = "August"; break;
            case 9 : strMonth = "September"; break;
            case 10 : strMonth = "October"; break;
            case 11 : strMonth = "November"; break;
            case 12 : strMonth = "December"; break;
        }
        return strMonth;
    }

    public static void printMonthBody(int year, int month){
        int startDay = getStartDay(year, month);

        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i = 0;
        for(i = 0; i < startDay; i++){
            System.out.print("    ");
        }
        for(i = 1; i <= numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);

            if((i + startDay) % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int getStartDay(int year, int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month){
        int total = 0;

        for(int i = 1800; i < year; i++){
            if(isLeapYear(i)){
                total = total + 366;
            } else {
                total = total + 365;
            }
        }
        for(int i = 1; i < month; i++){
            total = total + getNumberOfDaysInMonth(year, i);
        }
        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month){
        ArrayList<Integer> monthOf31 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        //monthOf31 = {1, 3, 5, 7, 8, 10, 12};
        ArrayList<Integer> monthOf30 = new ArrayList<>(Arrays.asList(4, 6, 9, 11));
        if(monthOf31.contains((Integer) month)){
            return 31;
        } else if(monthOf30.contains((Integer) month)){
            return 30;
        } else if (month == 2){
            if(isLeapYear(year)){
                return 29;
            } else {
                return 28;
            }
        } else {
            return -1;
        }
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
