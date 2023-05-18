package org.example.ch13AbstractClassesAndInterfaces.inBookExercises;

public class ShowOutput4 {
    public static void main(String[] args) {
        Integer n1 = new Integer(3);
        Object n2 = new Integer(4);
        System.out.println(n1.compareTo((Integer)n2));

        Person[] people = {new Person(3), new Person(4), new Person(1)};
        java.util.Arrays.sort(people);
        for(Person person : people){
            System.out.println(person.toString());
        }

    }
}

class Person implements Comparable<Person>{
    private int id;

    Person(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public int compareTo(Person person){
        if(this.getId() < person.getId()){
            return -1;
        } else if (this.getId() > person.getId()){
            return 1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Id : " + this.getId();
    }
}
