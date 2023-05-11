package org.example.ch9.endOfChapterExercises;

import java.util.GregorianCalendar;

public class E5UseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println(calendar.getTime());
        //System.out.println(calendar.get);
        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.getTime());
    }
}
