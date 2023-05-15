package org.example.ch10.inBookExercises;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1 : " + course1.getNumberOfStudents() + ".");
        String[] students = course1.getStudents();
        String studentsInClass = "";
        for(int i = 0; i < students.length; i++){

//            if(students[i] == null){
//
//                break;
//            }
            studentsInClass += students[i];
            if(students[i + 1] == null){
                studentsInClass += ".";
                break;
            }
            studentsInClass += ", ";
        }

        System.out.println(studentsInClass);


        String studentsInClass2 = "";
        System.out.println("\nNumber of students in course2 : " + course2.getNumberOfStudents() + ".");
        String[] students2 = course2.getStudents();
        for(int i = 0; i < students2.length; i++){

//            if(students2[i] == null){
//                break;
//            }
            studentsInClass2 += students2[i];
            if(students2[i + 1] == null){
                studentsInClass2 += ".";
                break;
            }
            else {
                studentsInClass2 += ", ";
            }

        }
        System.out.println(studentsInClass2);

    }
}
