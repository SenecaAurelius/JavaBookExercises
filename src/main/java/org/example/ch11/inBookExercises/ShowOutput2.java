package org.example.ch11.inBookExercises;

public class ShowOutput2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.printPerson();
        Student student = new Student();
        student.printPerson();
    }
}

class Student extends Person {
    @Override
    public String getInfo() {
        return "Student";
    }
}

class Person {
    public String getInfo(){
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}
