package org.example.ch9.inBookExercises;

public class Circle {
    double radius;

    static int numberOfObjects = 0;

    Circle(){
        radius = 1;
        numberOfObjects++;
    }

    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
