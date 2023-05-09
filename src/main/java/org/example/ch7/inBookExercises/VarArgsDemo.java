package org.example.ch7.inBookExercises;

public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(506, 3, 500, 2, 56.5);
        printMax(new double[]{30, 4, 1, 2, 3});
    }

    public static void printMax(double...numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed.");
            return;
        }

        double result = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
