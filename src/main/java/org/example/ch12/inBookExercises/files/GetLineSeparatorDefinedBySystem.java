package org.example.ch12.inBookExercises.files;

public class GetLineSeparatorDefinedBySystem {
    public static void main(String[] args) {
        String lineSeparator = System.getProperty("line.separator");
        for(int i = 0; i < lineSeparator.length(); i++){
            System.out.print(lineSeparator.charAt(i));
        }
        //System.out.println(lineSeparator);
    }
}
