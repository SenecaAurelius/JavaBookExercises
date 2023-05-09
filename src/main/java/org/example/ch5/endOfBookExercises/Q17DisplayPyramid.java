package org.example.ch5.endOfBookExercises;

import java.util.Scanner;

public class Q17DisplayPyramid {
    public static void main(String[] args) {

        //Need to finish
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of lines you want : ");
        int numLines = input.nextInt();

        for(int i = 1; i <= numLines; i++){
            int offsetNums = numLines - 1;
            for(int j = 0; j < offsetNums; j++){
                System.out.print("    ");
            }
            for(int leftSideNums = numLines - offsetNums; leftSideNums >= 2; leftSideNums--){
                System.out.printf("%4d", leftSideNums);
            }
            for(int rightSideNums = 1; rightSideNums < numLines - offsetNums + 1; rightSideNums++){
                System.out.printf("%4d", rightSideNums);
            }
            System.out.println();
        }



//        String str = "1";
//        for(int i = 1; i < numLines + 1; i++){
//            if(i == 1){
//                System.out.println(str);
//                continue;
//            }
//            //str += i + "\n";
//            str = i + str + i;
////            for(int j = 1; j < numLines + 1; j++){
////                str = j + str + j;
////            }
//            System.out.println(str);
//        }

    }
}
