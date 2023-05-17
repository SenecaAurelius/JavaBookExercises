package org.example.ch12.inBookExercises.files;

import java.io.File;

public class WriteData {
    public static void main(String[] args) throws java.io.IOException {
        File file = new File("scores.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        //Close the file
        output.close();
    }
}
