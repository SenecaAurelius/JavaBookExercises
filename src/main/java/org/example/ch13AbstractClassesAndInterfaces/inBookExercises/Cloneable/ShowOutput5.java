package org.example.ch13AbstractClassesAndInterfaces.inBookExercises.Cloneable;

import java.util.ArrayList;

public class ShowOutput5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("New York");
        ArrayList<String> list1 = list;
        ArrayList<String> list2 = (ArrayList<String>)(list.clone());
        list.add("Atlanta");
        System.out.println(list == list1);
        System.out.println(list == list2);

        System.out.println("List is " + list);
        System.out.println("List1 is " + list1);
        System.out.println("List2.get(0) is " + list2.get(0));
        System.out.println("List2.size() is " + list2.size());
    }
}
