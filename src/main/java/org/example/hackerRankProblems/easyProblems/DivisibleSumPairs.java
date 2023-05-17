package org.example.hackerRankProblems.easyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println(divisibleSumPairs(ar.size(), 5, ar));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar){
        int count = 0;
        for(int i = 0; i < ar.size() - 1; i++){

            for(int b = i + 1; b < ar.size() - 1; b++){
                if(ar.get(i) + ar.get(b) % k == 0){
                    count++;
                }
            }
//            if(i + 1 > ar.size()){
//                return count;
//            }
//            else if(ar.get(i) + ar.get(i+1) % k == 0){
//                count++;
//            }
        }
        return count;
    }
}
