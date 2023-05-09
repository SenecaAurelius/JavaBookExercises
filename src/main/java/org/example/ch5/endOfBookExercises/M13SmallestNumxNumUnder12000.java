package org.example.ch5.endOfBookExercises;

public class M13SmallestNumxNumUnder12000 {
    public static void main(String[] args) {
        int n = 1;
        int answer = 0;
        while(answer < 12000){
            answer = n * n;
            if(answer > 12000){
                n = n - 1;
                System.out.println(n);
                System.out.println(answer);
                break;
            }
            n++;
        }
    }
}
