package org.example.ch13AbstractClassesAndInterfaces.inBookExercises.Cloneable;

import java.util.Date;

public class ShowOutput4 {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = date;
        Date date2 = (Date)(date.clone());
        System.out.println(date == date1);
        System.out.println(date == date2);
        System.out.println(date.equals(date2));
    }
}
