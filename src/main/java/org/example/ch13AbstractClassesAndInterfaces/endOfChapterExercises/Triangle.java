package org.example.ch13AbstractClassesAndInterfaces.endOfChapterExercises;

import org.example.ch13AbstractClassesAndInterfaces.inBookExercises.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        super();
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean isFilled){
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public double getArea(){
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt((p) * (p - side1) * (p - side2) * (p - side3));
        return area;
    }

    @Override
    public String toString(){
        return "Side 1 : " + side1 + ", Side 2 : " + side2 + ", Side 3 : " + side3 + ", Color : " + super.getColor() + ", Is Filled : " + super.isFilled() +
                ", Area : " + getArea() + ", Perimeter : " + getPerimeter() ;
    }
}
