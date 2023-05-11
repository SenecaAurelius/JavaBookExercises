package org.example.ch9.inBookExercises;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = null;
        m1(date);
        System.out.println(date);
    }

    public static void m1(Date date){
        date = new Date();
    }
}
