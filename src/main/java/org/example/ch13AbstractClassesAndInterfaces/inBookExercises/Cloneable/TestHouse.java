package org.example.ch13AbstractClassesAndInterfaces.inBookExercises.Cloneable;

public class TestHouse {
    public static void main(String[] args) throws CloneNotSupportedException {

        //A class can implement multiple interfaces, but can only extend one superclass
        House house1 = new House(1, 400);
        House house2 = (House)house1.clone();
        System.out.println(house1.equals(house2));
        System.out.println(house1 == house2);
        System.out.println(house1.getWhenBuilt());
        System.out.println(house2.getWhenBuilt());
        //NullPointerException
    }
}
