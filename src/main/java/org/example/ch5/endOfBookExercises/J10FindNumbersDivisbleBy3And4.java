package org.example.ch5.endOfBookExercises;

public class J10FindNumbersDivisbleBy3And4 {
    public static void main(String[] args) {
        final int TEN_PER_LINE = 10;
        String str = "";
        int count = 0;
        for(int i = 100; i < 1001; i++){
            if(i % 3 == 0 || i % 4 == 0){
                count++;
                str += i + " ";
            }
            if(count == TEN_PER_LINE){
                System.out.println(str);
                str = "";
                count = 0;
            }
            if(i == 1000){
                System.out.println(1000);
            }
        }
        System.out.println(1000 % 4 == 0);
    }
}
