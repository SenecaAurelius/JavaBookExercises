package org.example.ch5.endOfBookExercises;

public class T20DisplayAllPrimeBetween2And1200 {

    public static void main(String[] args) {
        int count = 4;
        String str = "2 3 5 7 ";
        for(int i = 2; i < 1201; i++){
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0){
                str += i + " ";
                count++;
            }
            if(count >= 8){
                System.out.println(str);
                str = "";
                count = 0;
            }
        }
    }
}
