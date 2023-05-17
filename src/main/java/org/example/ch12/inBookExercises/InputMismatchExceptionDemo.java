package org.example.ch12.inBookExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Please enter an integer : ");
                int num = input.nextInt();

                //display result
                System.out.println("The number entered is " + num);
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again. An integer is required.");
                input.nextLine(); //discard input
            }
        } while(continueInput);
    }

}
