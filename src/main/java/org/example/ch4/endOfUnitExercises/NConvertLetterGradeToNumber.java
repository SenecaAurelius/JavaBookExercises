package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

public class NConvertLetterGradeToNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char character = '!';
        while (!(character == 'a' || character == 'b' || character == 'c' || character == 'd' || character == 'f')) {
            System.out.println("Please enter a US letter grade (a, b, c, d) : ");
            String str = input.nextLine();
            character = str.toLowerCase().charAt(0);
            if(character == 'a'){
                System.out.println("You earned 4 credits! ");
            } else if(character == 'b'){
                System.out.println("You earned 3 credits! ");
            } else if(character == 'c'){
                System.out.println("You earned 2 credits! ");
            } else if(character == 'd'){
                System.out.println("You earned 1 credit. :( ");
            } else if(character == 'f') {
                System.out.println("Shit u done fucked up... Get your life together please. Did you study at all? Put some hours aside for this class. ");
            } else {
                System.out.println("Please check your input. You can only enter a, b, c, d, or f. \n");
            }
        }
        System.exit(1);

    }
}
