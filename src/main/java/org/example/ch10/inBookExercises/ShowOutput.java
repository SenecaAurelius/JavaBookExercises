package org.example.ch10.inBookExercises;

public class ShowOutput {
    public static void main(String[] args) {
        System.out.println("H1, ABC, good".matches("ABC "));
        System.out.println("H1, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",;", "#"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));

        String[] tokens = "A,B;C".split("[,;]");
        for(int i = 0; i < tokens.length; i++){
            System.out.print(tokens[i] + " ");
        }
    }
}
