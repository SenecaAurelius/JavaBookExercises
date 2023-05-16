package org.example.ch10.inBookExercises;

public class TestWrapperClasses {
    public static void main(String[] args) {
        Integer a = new Integer("23");
        Integer b = new Integer(23);
        Integer c = Integer.valueOf("23");
        Integer d = Integer.parseInt("23", 8);
        Double e = new Double(1);
        Double f = Double.valueOf("23.45");
        //Integer g = (Integer.valueOf("23.4")).intValue();
        Double h = (Double.valueOf("23.4")).doubleValue();
        Integer i = (Double.valueOf("23.4")).intValue();
        String s = (Double.valueOf("23.4")).toString();
        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println(Integer.parseInt("11", 16));


    }
}
