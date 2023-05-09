package org.example.ch6.endOfChapterExercises;

public class A1PentagonalNumbers {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i < 101; i++){
            System.out.printf("%7d", getPentagonalNumber(i));
            count++;
            if(count > 9){
                System.out.println();
                count = 0;
            }
        }
//        System.out.println(getPentagonalNumber(1));
//        System.out.println(getPentagonalNumber(2));
//        System.out.println(getPentagonalNumber(3));
    }

    public static int getPentagonalNumber(int n){
        int pentagonalNumber = n * ((3 * n) - 1)/ 2;
        return pentagonalNumber;
    }
}

