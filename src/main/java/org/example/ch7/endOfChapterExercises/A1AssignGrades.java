package org.example.ch7.endOfChapterExercises;

import java.util.Arrays;
import java.util.Scanner;

public class A1AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students : ");
        int studentNum = input.nextInt();
        double[] studentGrades = new double[studentNum];
        System.out.println("Please enter the grades separated by a space : ");
        for(int i = 0; i < studentNum; i++){
            double grade = input.nextDouble();
            studentGrades[i] = grade;
        }

        System.out.println(Arrays.toString(studentGrades));
        double max = findMax(studentGrades);
        System.out.println(max);
        assignLetterGrade(studentGrades);
    }

    public static double findMax(double[] list){
        double max = list[0];
        for(int i = 1; i < list.length; i++){
            if(max < list[i]){
                max = list[i];
            }
        }
        return max;
    }

    public static void assignLetterGrade(double[] list){
        double max = findMax(list);
        for(int i = 0; i < list.length; i++){
            if(list[i] >= max - 5){
                System.out.println("Student " + i + "'s score is " + list[i] + " and their grade is an A.");
            } else if(list[i] >= max - 10){
                System.out.println("Student " + i + "'s score is " + list[i] + " and their grade is a B.");
            } else if(list[i] >= max - 15){
                System.out.println("Student " + i + "'s score is " + list[i] + " and their grade is a C.");
            } else if(list[i] >= max - 20){
                System.out.println("Student " + i + "'s score is " + list[i] + " and their grade is a D.");
            } else {
                System.out.println("Student " + i + "'s score is " + list[i] + " and their grade is an F.");
            }
        }
    }
}
