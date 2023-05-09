package org.example.ch5.endOfBookExercises;

import java.util.Scanner;

public class P16FactorsOfAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to factor : ");

        int num = input.nextInt();
        int originNum = num;
        String str = "";
        while(num % 2 == 0){
            str += 2 + ", ";
            num = num / 2;
        } while(num % 3 == 0){
            str += 3 + ", ";
            num = num / 3;
        } while(num % 5 == 0){
            str += 5 + ", ";
            num = num / 5;
        } while(num % 7 == 0){
            str += 7 + ", ";
            num = num / 7;
        }
        System.out.println("The factors of " + originNum + " are " + str + ".");
    }
}
