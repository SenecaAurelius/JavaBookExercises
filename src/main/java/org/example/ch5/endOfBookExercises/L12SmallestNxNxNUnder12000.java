package org.example.ch5.endOfBookExercises;

public class L12SmallestNxNxNUnder12000 {
    public static void main(String[] args) {
        int n = 1;
        int answer = 0;
        while(answer < 12000){
            answer = n * n * n;
            if(answer > 12000){
                n = n - 1;
                answer = n*n*n;
                System.out.println(answer);
                System.out.println(n);
                break;
            }
            n++;
        }

    }
}
