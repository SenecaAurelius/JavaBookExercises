package org.example.ch13AbstractClassesAndInterfaces.inBookExercises.Cloneable;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt = new java.util.Date();

    public House(int id, double area){
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId(){
        return id;
    }

    public double getArea() {
        return area;
    }

    public java.util.Date getWhenBuilt(){
        return whenBuilt;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        try {
            House houseClone = (House)super.clone();
            houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
            return houseClone;
        }
        catch(CloneNotSupportedException ex){
            return null;
        }
    }
    //keyword native indicates that a method was not written in java, but is implements in the JVM for the native platform


    @Override
    public int compareTo(House o){
        if (area > o.area){
            return 1;
        } else if (area < o.area){
            return -1;
        } else {
            return 0;
        }
    }


}
