package org.example.ch5.endOfBookExercises;

public class O15DisplayASCIICharacterTable {
    public static void main(String[] args) {
        int count = 0;
        String str = "";
        for(int i = 0; i < 257; i++){
            str += (char) i + " ";
            count++;
            if(count >= 9){
                System.out.println(str);
                str = "";
                count = 0;
            }
        }
    }
}
