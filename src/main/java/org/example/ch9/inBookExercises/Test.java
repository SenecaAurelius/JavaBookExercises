package org.example.ch9.inBookExercises;

public class Test {

    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("Area of circle with radius : " + myCircle.getRadius() + " is " + myCircle.getArea() );

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The new area with radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        //Doesn't work outside of the class, since numberOfObjects is not set to private :
        // System.out.println("The num of objects created is : " + CircleWithPrivateDataFields.numberOfObjects);
        System.out.println("The num of objects created is : " + CircleWithPrivateDataFields.getNumberOfObjects());


    }
}
