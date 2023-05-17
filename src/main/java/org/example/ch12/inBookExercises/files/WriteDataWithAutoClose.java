package org.example.ch12.inBookExercises.files;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores2.txt");
        if (file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        try (
                java.io.PrintWriter output = new java.io.PrintWriter(file);
        ){
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
//        catch (Exception ex){
//            System.out.println(ex);
//        }
    }
}
