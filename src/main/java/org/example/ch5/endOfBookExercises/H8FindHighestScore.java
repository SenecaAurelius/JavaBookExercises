package org.example.ch5.endOfBookExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class H8FindHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students would you like to enter into the system? ");
        int numStudents = input.nextInt();
        ArrayList<Student> list = new ArrayList();
        int count = 0;
        while(count < numStudents){
            System.out.println("Please enter the student's name : ");
            String name = input.next();
            System.out.println("Please enter that student's score : ");
            double grade = input.nextDouble();
            Student student1 = new Student(name, grade);
            count++;
            list.add(student1);
        }
        Student studentWithHighestGrade = list.get(0);
        Student studentWithLowestGrade = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(i == list.size()){
                break;
            }
            if(studentWithHighestGrade.grade <= list.get(i).grade){
                studentWithHighestGrade = list.get(i);
            }
//            else if(list.get(i).grade < list.get(i+1).grade) {
//                studentWithHighestGrade = list.get(i+1);
//            }
            if(studentWithLowestGrade.grade > list.get(i).grade){
                studentWithLowestGrade = list.get(i);
            }
//            else if(list.get(i).grade > list.get(i+1).grade) {
//                studentWithLowestGrade = list.get(i+1);
//            }
        }
        System.out.println("Out of " + list.size() + " students, " + studentWithHighestGrade.name + " had the highest grade with " +
                studentWithHighestGrade.grade + ". ");
        System.out.println("Out of " + list.size() + " students, " + studentWithLowestGrade.name + " had the lowest grade with " +
                studentWithLowestGrade.grade + ". ");

    }
}
class Student{
    String name;
    double grade;
    Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
}
