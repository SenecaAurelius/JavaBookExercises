package org.example.ch3.EndOfChapterExercises;
import java.util.Scanner;
public class INineIBSNCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first 9 digits of the IBSN : ");
        String iBSN = input.nextLine();
        //String d1, d2, d3, d4, d5, d6, d7,d8, d9;
        Integer dd1 = Integer.parseInt(iBSN.substring(0, 1));
        Integer dd2 = Integer.parseInt(iBSN.substring(1, 2));
        Integer dd3 = Integer.parseInt(iBSN.substring(2, 3));
        Integer dd4 = Integer.parseInt(iBSN.substring(3, 4));
        Integer dd5 = Integer.parseInt(iBSN.substring(4, 5));
        Integer dd6 = Integer.parseInt(iBSN.substring(5, 6));
        Integer dd7 = Integer.parseInt(iBSN.substring(6, 7));
        Integer dd8 = Integer.parseInt(iBSN.substring(7, 8));
        Integer dd9 = Integer.parseInt(iBSN.substring(8, 9));

        int lastDigit = (dd1 * 1 + dd2 * 2 + dd3 * 3 + dd4 * 4 + dd5 * 5 + dd6 * 6 + dd7 * 7 + dd8 * 8 + dd9 * 9) % 11;
        if(lastDigit == 10){
            System.out.println(iBSN + "X");
        } else {
            System.out.println(iBSN + lastDigit);
        }

//        (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
//          d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
    }
}
