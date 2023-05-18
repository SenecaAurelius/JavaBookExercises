package org.example.hackerRankProblems.easyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SockMerchant {

    public static void main(String[] args) {

        //PASSED ALL TESTS

        List<Integer> sockDrawer = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        sockMerchant(sockDrawer.size(), sockDrawer);
    }

    public static int sockMerchant(int n, List<Integer> ar){
        int pairsCount = 0;
        Collections.sort(ar);
        for(int i = 0; i < n - 1; i++){
            if(i + 1 >= n){
                break;
            }
            if(ar.get(i) == ar.get(i + 1)){
                pairsCount++;
                i += 1;
                //System.out.println(i);
                //ar.remove(ar.get(i));
                System.out.println(ar);
                //ar.remove(ar.get(i));

            }
        }
        System.out.println(ar);
        System.out.println(pairsCount);
        return pairsCount;
    }
}
