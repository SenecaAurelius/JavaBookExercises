package org.example.ch5.endOfBookExercises;

public class K11FindNumbersDivisibleBy3And4ButNotBoth {
    public static void main(String[] args) {
        final int NUM_PER_LINE = 10;
        int count = 0;
        String str = "";
        for(int i = 100; i < 1001; i++){
            if(i % 4 == 0 ^ i % 3 == 0){
                str += i + " ";
                count++;
            }

            if(count == NUM_PER_LINE){
                System.out.println(str);
                str = "";
                count = 0;
            }
        }
        str = "";
        count = 0;
        for(int i = 100; i < 1001; i++){
            if(i % 4 == 0 && i % 3 == 0){
                str += i + " ";
                count++;
            }
        }
        System.out.println(str);
        System.out.println("There are " + count + " numbers that qualify for this.");
    }
}
