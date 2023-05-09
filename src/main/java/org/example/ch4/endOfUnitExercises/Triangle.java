package org.example.ch4.endOfUnitExercises;

public class Triangle {

    double side1;
    double side2;
    double side3;
    double area;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void computeArea() {
        double s = side1 + side3 + side2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
