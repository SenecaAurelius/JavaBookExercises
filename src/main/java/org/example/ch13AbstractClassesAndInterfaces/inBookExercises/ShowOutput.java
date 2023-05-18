package org.example.ch13AbstractClassesAndInterfaces.inBookExercises;

public class ShowOutput {
    public static void main(String[] args) {
//        Number numberRef = new Integer(0);
//        Double doubleRef = (Double)numberRef;

        //ClassCastException Integer cannot be cast to Double

//        Number[] numberArray = new Integer[2];
//        numberArray[0] = new Double(1.5);
        //ArrayStoreException, trying to store an incorrect type of object into an array of objects.
        //This is an Integer array, not a Number[] array.
        //An ArrayStoreException is a runtime exception in Java that
        // occurs when an attempt is made to store the
        // incorrect type of object into an array of objects

//        Number x = 3;
//        System.out.println(x.intValue());
//        System.out.println(x.doubleValue());

//        Number x = new Integer(3);
//        System.out.println(x.intValue());
//        System.out.println(((Integer) x).compareTo(new Integer(4)));
        //You have to cast x to an Integer to compare it to an Integer???
        //Maybe since it is a referenceVariable of type Number, currently assigned to an Integer. So the Number has to be converted to an Integer to compare it to an Integer

//        Number x = new Integer(3);
//        System.out.println(x.intValue());
//        System.out.println((Integer)x.compareTo(new Integer(4)));
        //The order of operations is incorrect, you have to change it to an Integer before comparison, not after.

    }
}
