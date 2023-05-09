package org.example.ch3.EndOfChapterExercises;

import java.util.Scanner;

public class MThirteenComputeTaxesASecondTime {
    public static void main(String[] args) {
        //psvm
        /*
        *
        * NEEDS HEAVY TESTING
        *
        *
        * */



        Scanner input = new Scanner(System.in);

        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of household)" +
                "Enter your filing status : ");
        int status = input.nextInt();

        System.out.println("Enter the taxable income : ");
        double income = input.nextDouble();

        double tax = 0;
        int upwardBound10 = 0, upwardBound15 = 0, upwardBound25 = 0, upwardBound28 = 0, upwardBound33 = 0;

        if(status == 0){ //single filers
            upwardBound10 = 8350;
            upwardBound15 = 33950;
            upwardBound25 = 82250;
            upwardBound28 = 171550;
            upwardBound33 = 372950;

        } else if (status == 1){ //jointly or qualifying widower
            upwardBound10 = 16700;
            upwardBound15 = 67900;
            upwardBound25 = 137050;
            upwardBound28 = 208850;
            upwardBound33 = 372950;
            //
        } else if (status == 2){
            upwardBound10 = 8350;
            upwardBound15 = 33950;
            upwardBound25 = 68525;
            upwardBound28 = 104425;
            upwardBound33 = 186475;

        } else if (status == 3){
            upwardBound10 = 11950;
            upwardBound15 = 45500;
            upwardBound25 = 117450;
            upwardBound28 = 190200;
            upwardBound33 = 372950;

        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

//        upwardBound10 = 8350;
//            upwardBound15 = 33950;
//            upwardBound25 = 82250;
//            upwardBound28 = 171550;
//            upwardBound33 = 372950;

        if(income <= upwardBound10){
            tax = income * 0.10;
        } else if(income <= upwardBound15){
            tax = upwardBound10 * 0.10 + (income - upwardBound10) * 0.15;
        } else if (income <= upwardBound25){
            tax = upwardBound10 * 0.10 + (upwardBound15 - upwardBound10) * 0.15 + (income - upwardBound15) * 0.25;
        } else if (income <= upwardBound28){
            tax = upwardBound10 * 0.10 + (upwardBound15 - upwardBound10) * 0.15 + (upwardBound25 - upwardBound15) * 0.25 + (income - upwardBound25) * 0.28;
        } else if (income <= upwardBound33){
            tax = upwardBound10 * 0.10 + (upwardBound15 - upwardBound10) * 0.15 + (upwardBound25 - upwardBound15) * 0.25 +
                    (upwardBound28 - upwardBound25) * 0.28 + (income - upwardBound28) * 0.33;
        } else {
            tax = upwardBound10 * 0.10 + (upwardBound15 - upwardBound10) * 0.15 + (upwardBound25 - upwardBound15) * 0.25 +
                    (upwardBound33 - upwardBound28) * 0.28 + (upwardBound33 - upwardBound28) * 0.33 + (income - upwardBound33) * 0.35;
        }
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
