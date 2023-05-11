package org.example.ch9.inBookExercises;

import java.util.Date;

//For a class to be immutable, ALL DATA FIELDS MUST BE PRIVATE
//THERE CAN BE NO MUTATOR/GETTER METHODS FOR DATA FIELDS
//NO ACCESSOR METHODS CAN RETURN A REFERENCE TO A DATA FIELD THAT IS MUTABLE
public class StudentNotImmutable {
    private int id;
    private String name;
    private Date dateCreated;

    public StudentNotImmutable(int ssn, String newName){
        id = ssn;
        name = newName;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static void main(String[] args) {
        StudentNotImmutable student = new StudentNotImmutable(111223333, "Earl");
        Date dateCreated = student.getDateCreated();
        System.out.println(student.getDateCreated().getTime());

        dateCreated.setTime(200000);
        System.out.println(student.getDateCreated().getTime());
    }
}
