package org.example.ch9.inBookExercises;

public class Notes {
    public static void main(String[] args) {
//        System.out.println(factorial(9));
//        System.out.println(factorial(11));
//        System.out.println(factorial(20));
//        System.out.println(factorial(5));
//
        for(int i = 1; i < 21; i++){
            System.out.println(i + " : " + factorial(i));
        }
    }

    public static long factorial(int n){
        long result = 1;
        for(long i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    /*If you want all classes to share some data, then use static variables. Also known as class variables.
    *A getter is also an accessor
    *A setter is also known as a mutator
    *
    *
    *
    *
    *
    * */
}
