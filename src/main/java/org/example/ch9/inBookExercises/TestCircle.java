package org.example.ch9.inBookExercises;

public class TestCircle {
    public static void main(String[] args){
        //Create circle object number 1
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + Circle.numberOfObjects);

        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        System.out.println("\n After creating c1");
        //Create circle object number 2
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea() +  "    " +
                circle1.getNumberOfObjects());

        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
        //Modify circle object 2 by changing its radius.
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        System.out.println(Circle.getNumberOfObjects() + " is how many circles we now have at the end of our program. ");
        System.out.println(circle1.getNumberOfObjects() + " is how many circles we now have at the end of our program. ");
    }
}
