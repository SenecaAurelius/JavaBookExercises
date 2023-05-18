package org.example.ch13AbstractClassesAndInterfaces.inBookExercises;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ShowOutput2 {



    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1997, 5, 25);
        System.out.println(calendar);
        System.out.println(calendar.get(calendar.YEAR));
        System.out.println(calendar.get(calendar.MONTH));
        System.out.println(calendar.get(calendar.DATE));
        System.out.println(calendar.get(calendar.HOUR));
        System.out.println(calendar.get(calendar.MINUTE));
        System.out.println(calendar.get(calendar.SECOND));

        System.out.println(calendar.get(calendar.YEAR));
        System.out.println(calendar.get(calendar.MONTH));
        System.out.println(calendar.get(calendar.DATE));
        System.out.println(calendar.get(calendar.HOUR));
        System.out.println(calendar.get(calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }

}
