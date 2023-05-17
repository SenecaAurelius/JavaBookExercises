package org.example.hackerRankProblems.easyProblems;

public class SecondDivisibleSumPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 5;
        System.out.println(secondDivisibleSumPairs(k, arr));

    }
    public static int secondDivisibleSumPairs(int k, int[] arr){
        int count = 0;

        for(int i = 0; i < arr.length; i++){

            for(int b = i + 1; b < arr.length; b++){
                if((arr[i] + arr[b]) % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
