package org.example.ch6.endOfChapterExercises;

public class D4ReverseInteger {
    public static void main(String[] args) {
        reverse(1234);
        reverse(19991);
        reverse(50011);
        reverse(13579);
        reverse(97531);
    }

    public static void reverse(int number){
        String reverse = "";
        while(number > 0){
            reverse += "" + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);
    }

}
