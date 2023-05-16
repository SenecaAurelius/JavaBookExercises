package org.example.ch11.inBookExercises;

public class DynamicBindingDemo {

    public static void main(String[] args) {
        //java: non-static variable this cannot be referenced from a static context Pfffff
        GraduateStudent grad = new GraduateStudent();
        Student1 student = new Student1();
        Person1 person = new Person1();

        m(grad);
        m(student);
        m(person);
        m(new Object());
    }


    public static void m(Object x){
        System.out.println(x.toString());
    }
}

class Person1 extends Object {
    @Override
    public String toString(){
        return "Person";
    }
}

class Student1 extends Person {
    @Override
    public String toString(){
        return "Student";
    }
}

class GraduateStudent extends Student {

}
