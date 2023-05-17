package org.example.hackerRankProblems.easyProblems;

public class BuildStaircase {
    public static void main(String[] args) {
        int n = 8;
        buildStaircase(n);
    }

    public static void buildStaircase(int n){
        String str = "";
        for(int i = 1; i <= n; i++){

            for(int b = n; b > i; b--){
                str += " ";
            }

            for(int j = 0; j < i; j++){
                str += "#";
            }

            System.out.println(str);
            str = "";

//            str += " ";
        }

    }
}
