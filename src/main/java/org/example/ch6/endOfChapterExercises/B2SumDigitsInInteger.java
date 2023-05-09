package org.example.ch6.endOfChapterExercises;

import java.util.Scanner;

public class B2SumDigitsInInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = 0;
        while(num != -1){
            System.out.println("Please enter a number whose digits you would like to sum : (press -1 to exit)");
            num = input.nextLong();
            System.out.println(sumDigits(num));
        }
        System.exit(1);

    }
    public static int sumDigits(long n){
        int number = (int)(n);
        int onesPlace;
        int answer = 0;
        while(number > 0){
            onesPlace = number % 10;
            number = number / 10;
            answer += onesPlace;
        }
        //System.out.println(answer);

        return answer;
    }
}
