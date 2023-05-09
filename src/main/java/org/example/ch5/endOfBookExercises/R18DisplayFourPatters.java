package org.example.ch5.endOfBookExercises;

public class R18DisplayFourPatters {
    public static void main(String[] args) {
//        String str1 = "";
//        for(int i = 0; i < 6; i++){
//            str1 += "*";
//            System.out.println(str1);
//        }
//
//        String str2 = "*******";
//        StringBuilder sb = new StringBuilder(str2);
//        for(int i = 0; i <= 6; i++){
////            for(int j = 6; j > 0; i--){
////            }
//            sb.deleteCharAt(0);
//            System.out.println(sb);
////            str2 += "*";
////            System.out.println(str2);
//        }
        //System.out.println(str2);

        String str4 = "      ";
        StringBuilder sb4 = new StringBuilder(str4);
        for(int i = 0; i < 6; i++){
            sb4.replace(str4.length() - i - 1, str4.length() - i, "*");
            System.out.println(sb4);
            //sb4.replace(sb4.lastIndexOf(" ")), i, "*");
        }


//        Solution Four :
//        String str3 = "*******";
//        StringBuilder secondSB = new StringBuilder(str3);
//        System.out.println(secondSB);
//        for(int i = 0; i < 6; i++){
//            secondSB.replace(i, i+1, " ");
//            System.out.println(secondSB);
//        }
    }
}
