package org.example.ch7.inBookExercises;

public class Calculator {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("You must enter operand1 operator and operand2. ");
            System.exit(1);
        }
        int result = 0;

        switch(args[1].charAt(0)){
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
            case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;

        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
