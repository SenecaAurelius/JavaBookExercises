package org.example.ch13AbstractClassesAndInterfaces.inBookExercises.Cloneable;

import java.util.ArrayList;
import java.util.Arrays;

public class ShowOutput2 {
    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5));
        ArrayList<Double> list2 = (ArrayList<Double>)list1.clone();
        ArrayList<Double> list3 = list1;
        list2.add(4.5);
        list3.remove(1.5);

        System.out.println("list1 is " + list1);
        System.out.println("list2 is " + list2);
        System.out.println("list3 is " + list3);
    }
}
