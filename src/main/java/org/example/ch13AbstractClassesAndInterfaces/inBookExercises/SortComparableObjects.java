package org.example.ch13AbstractClassesAndInterfaces.inBookExercises;

import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for(String city : cities){
            System.out.println(city + " ");
        }
        System.out.println();
        BigInteger[] hugeNumbers = {new BigInteger("234234234234234234"), new BigInteger("8787878787878"), new BigInteger("53535353535353535")};
        java.util.Arrays.sort(hugeNumbers);
        for(BigInteger number : hugeNumbers){
            System.out.println(number + " --- ");
        }
    }
}
