package org.example.ch5.endOfBookExercises;

public class D4InchesToCentiTable {
    public static void main(String[] args) {

        int count = 0;
        double inches = 1;
        double centimeters = inches * 2.54;
        while(count < 10){
            System.out.println("Inches : " + inches + " Centimeters : " + centimeters);
            inches++;
            centimeters = inches * 2.54;
            count++;
        }
        System.exit(1);

    }
}
