package org.example.ch13AbstractClassesAndInterfaces.inBookExercises;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("The current time is " + new Date());
        System.out.println("YEAR : " + calendar.get(calendar.YEAR));
        System.out.println("MONTH : " + calendar.get(calendar.MONTH));
        System.out.println("DATE : " + calendar.get(calendar.DATE));
        System.out.println("HOUR : " + calendar.get(calendar.HOUR));
        System.out.println("HOUR_OF_DAY : " + calendar.get(calendar.HOUR_OF_DAY));
        System.out.println("MINUTE : " + calendar.get(calendar.MINUTE));
        System.out.println("SECOND : " + calendar.get(calendar.SECOND));
        System.out.println("DAY_OF_WEEK : " + calendar.get(calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH : " + calendar.get(calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR : " + calendar.get(calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH : " + calendar.get(calendar.WEEK_OF_MONTH));
        System.out.println("AM_PM : " + calendar.get(calendar.AM_PM));

//        System.out.println("The current time is " + new Date());
//        System.out.println("YEAR : " + calendar.get(Calendar.YEAR));
//        System.out.println("MONTH : " + calendar.get(Calendar.MONTH));
//        System.out.println("DATE : " + calendar.get(Calendar.DATE));
//        System.out.println("HOUR : " + calendar.get(Calendar.HOUR));
//        System.out.println("HOUR_OF_DAY : " + calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println("MINUTE : " + calendar.get(Calendar.MINUTE));
//        System.out.println("SECOND : " + calendar.get(Calendar.SECOND));
//        System.out.println("DAY_OF_WEEK : " + calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println("DAY_OF_MONTH : " + calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println("DAY_OF_YEAR : " + calendar.get(Calendar.DAY_OF_YEAR));
//        System.out.println("WEEK_OF_MONTH : " + calendar.get(Calendar.WEEK_OF_MONTH));
//        System.out.println("AM_PM : " + calendar.get(Calendar.AM_PM));

        Calendar calendar1 = new GregorianCalendar(1997, 11, 25);
        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("December 25, 1997 was a " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);

        //To obtain the number of days in a month, use calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("There are " + calendar.getActualMaximum(calendar.DAY_OF_MONTH) + " days in this month.");
    }
}
