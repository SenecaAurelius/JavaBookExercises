package org.example.ch10.inBookExercises;

public class ShowOutput3StringBuilderStuff {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");

        s1.append(" is fun");
        System.out.println(s1);
        s1.append(s2);
        System.out.println(s1);
        s1.insert(2, "is fun");
        System.out.println(s1);
        s1.insert(1, s2);
        System.out.println(s1);
        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        System.out.println(s1.delete(1, 3));
        System.out.println(s1.reverse());
        System.out.println(s1.replace(1, 3, "Computer"));
        System.out.println(s1.substring(1, 3));
        System.out.println(s1.substring(2));

//        StringBuilder stringBuilder = new StringBuilder("Hello Earl");
//        stringBuilder.delete(0, 3);
//        System.out.println(stringBuilder.reverse());
//
//        StringBuilder strBuilder = new StringBuilder("Earl Earl");
//        strBuilder.delete(6, 8);
//        System.out.println(strBuilder.reverse());
//
//        StringBuilder strBuilt = new StringBuilder("Piper's Tea");
//        strBuilt.deleteCharAt(0);
//        System.out.println(strBuilt.reverse());
    }
}
