package org.example.ch5.inBookExercises;

import java.util.ArrayList;

public class StringChecker {
    public static void main(String[] args) {

        String str1 = "]asdf";
        String str2 = "[";
        String str3 = "([]";
        String str4 = "[[])";
        String str5 = "[[]()]";
        String str6 = "[[asdf]]]";
        String str7 = "{";
        String str8 = "{}()[]";
        String str9 = "[({)}]";

        ArrayList<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        list.add(str6);

        for(int i = 0; i < list.size(); i++){
            System.out.println((i + 1) + " " + checkStr(list.get(i)));
        }

    }

    public static String checkStr(String str){
        if(checkStringBrackets(str)){
            return "Balanced Brackets.";
        } else {
            return "This shit ain't balanced.";
        }
    }

    public static boolean checkStringBrackets(String str){
        char[] charArr = str.toCharArray();
        int countBrackets = 0;
        int countCurly = 0;
        int countParen = 0;
        String collectionStr = "";
        for(int i = 0; i < str.length(); i++){
            boolean openBracket = false;
            boolean openParen = false;
            boolean openCurly = false;
            if(countBrackets < 0 || countCurly < 0 || countParen < 0){
                break;
            }

            if(charArr[i] == '['){
                countBrackets++;
                collectionStr += '[';
            } else if(charArr[i] == ']'){
                countBrackets--;

            }
            if(charArr[i] == '{'){
                countCurly++;
                openCurly = true;
            } else if(charArr[i] == '}'){
                countCurly--;
            }
            if(charArr[i] == '('){
                countParen++;
                openParen = true;
            } else if(charArr[i] == ')'){
                countParen--;
            }
        }
        if(countBrackets < 0 || countCurly < 0 || countParen < 0){
            return false;
        } else if(countBrackets % 2 == 0 && countParen % 2 == 0 && countCurly % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

//    public static boolean checkStringCurly(String str){
//        char[] charArr = str.toCharArray();
//        int count = 0;
//        for(int i = 0; i < str.length(); i++){
//            if(count < 0){
//                break;
//            }
//            if(charArr[i] == '{'){
//                count++;
//            } else if(charArr[i] == '}'){
//                count--;
//            }
//
//        }
//        if(count < 0){
//            return false;
//        } else if(count % 2 == 0){
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public static boolean checkStringParen(String str){
//        char[] charArr = str.toCharArray();
//        int count = 0;
//        for(int i = 0; i < str.length(); i++){
//            if(count < 0){
//                break;
//            }
//            if(charArr[i] == '('){
//                count++;
//            } else if(charArr[i] == ')'){
//                count--;
//            }
//
//        }
//        if(count < 0){
//            return false;
//        } else if(count % 2 == 0){
//            return true;
//        } else {
//            return false;
//        }
//    }
}
