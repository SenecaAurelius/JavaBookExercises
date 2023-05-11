package org.example.ch9.endOfChapterExercises;

import java.util.Date;

public class C3UseDateClass {
    public static void main(String[] args) {
        Date date1 = new Date(10000);
        Date date2 = new Date(100000);
        Date date3 = new Date(1000000);
        Date date4 = new Date(10000000);
        Date date5 = new Date(100000000);
        Date date6 = new Date(1000000000);
        Date[] dateArr = {date1, date2, date3, date4, date5, date6};
        for(int i = 0; i < dateArr.length; i++){
            System.out.println(dateArr[i].toString());
        }
//        Date date7 = new Date(10000000000); integer numbers are too large!
//        Date date8 = new Date(100000000000);

        System.out.println(date1.toString());
    }
}
