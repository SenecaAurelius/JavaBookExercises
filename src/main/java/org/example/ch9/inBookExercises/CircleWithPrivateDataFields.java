package org.example.ch9.inBookExercises;

public class CircleWithPrivateDataFields {

    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("Area of circle with radius : " + myCircle.getRadius() + " is " + myCircle.getArea() );

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The new area with radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The num of objects created is : " + CircleWithPrivateDataFields.numberOfObjects);
        System.out.println("The num of objects created is : " + CircleWithPrivateDataFields.getNumberOfObjects());


    }
    private double radius = 1;

    private static int numberOfObjects = 0;

    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    public CircleWithPrivateDataFields(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

}
