package org.example.ch11.inBookExercises;

public class DynamicBindingDemo {

    public static void main(String[] args) {
        //java: non-static variable this cannot be referenced from a static context Pfffff
//        GraduateStudent grad = new GraduateStudent();
//        Student student = new Student();
//        Person person = new Person();

//        m(grad);
//        m(student);
//        m(person);
        m(new Object());
    }

    class Person extends Object {
        @Override
        public String toString(){
            return "Person";
        }
    }

        class Student extends Person {
            @Override
            public String toString(){
                return "Student";
            }
        }

    class GraduateStudent extends Student {

    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}
