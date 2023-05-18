package org.example.ch13AbstractClassesAndInterfaces.inBookExercises;

import java.util.Date;

public class ShowOutput3 {
    public static void main(String[] args) {
        System.out.println(new Integer(3).compareTo(new Integer(5)));
        System.out.println("ABC".compareTo("ABC"));
        Date date1 = new Date(2023, 5, 1);
        Date date2 = new Date(2022, 5, 15);
        System.out.println(date1.compareTo(date2));
    }
}
