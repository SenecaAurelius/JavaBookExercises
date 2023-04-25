package org.example.ch1;

public class Exercise_Four {

    public static void main(String[] args){
        double a = 1;
        System.out.println("a     a^2   a^3   a^4");
        String lineOne = "";
        String lineTwo = "";
        for(double i = 1; i < 5; i++){
            lineOne += Math.pow(1, i) + "   ";
        }
        System.out.println(lineOne);
        for(double i = 1; i < 5; i++){
            lineTwo += Math.pow(2, i) + "   ";
        }
        System.out.println(lineTwo);
        String lineThree = "";
        for(double i = 1; i < 5; i++){
            lineThree += Math.pow(3, i) + "   ";
        }
        System.out.println(lineThree);
        String lineFour = "";
        for(double i = 1; i < 5; i++){
            lineFour += Math.pow(4, i) + "   ";
        }
        System.out.println(lineFour);

        a = 2;
        System.out.println();

    }
}
