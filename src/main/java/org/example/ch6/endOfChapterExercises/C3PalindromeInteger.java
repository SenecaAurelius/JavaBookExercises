package org.example.ch6.endOfChapterExercises;

public class C3PalindromeInteger {
    public static void main(String[] args) {

        System.out.println(reverse(12321));
        System.out.println(reverse(111111));
        System.out.println(reverse(123));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(111111));
        System.out.println(isPalindrome(123));

    }
    public static int reverse(int number){
        //int reverse = 0;
        int checker = number;
        String reverse = "";
        while(checker > 0){
            reverse += "" + (checker % 10);
            checker = checker / 10;
//            System.out.println(checker + " here is the number.");
//            System.out.println(reverse + " here is the reverse.");
        }
        return Integer.parseInt(reverse);

    }
    public static boolean isPalindrome(int number){

        if(reverse(number) == number){
            return true;
        } else {
            return false;
        }
    }
}
