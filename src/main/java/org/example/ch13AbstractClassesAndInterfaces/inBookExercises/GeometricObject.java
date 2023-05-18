package org.example.ch13AbstractClassesAndInterfaces.inBookExercises;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
     public String getColor(){
        return color;
     }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\nColor : " + color + " and filled : " + filled;
    }
    //pg 526...
    public abstract double getArea();

    public abstract double getPerimeter();
}
