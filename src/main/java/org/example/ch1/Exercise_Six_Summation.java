package org.example.ch1;

public class Exercise_Six_Summation {
    public static void main(String[] args){
        String summation = "";
        for(int i = 1; i < 11; i++){
            if (i == 10) {
                summation += i;
                break;
            }
            summation += i + " + ";
        }
        System.out.println(summation);
    }
}
