package org.example.ch2.endOfChapterExercises;

public class PointObject {
    private double ax;
    private double ay;
    private double bx;
    private double by;
    private double midX;
    private double midY;
    public PointObject(double ax, double ay, double bx, double by){
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.midX = (ax + bx) / 2;
        this.midY = (ay + by) / 2;
    }

    public String printPointsAndMidPoint(){
        String str = this.getAx() + ", " + this.getAy() + " : " + this.getBx() + ", " + this.getBy() + " : " + this.getMidX() + ", " + this.getMidY();

        return str;
    }

    public double getMidX() {
        return this.midX;
    }

    private double getMidY(){
        return this.midY;
    }
    //ctrl + r gets you find an replace;


    public double getAx() {
        return ax;
    }

    public double getAy() {
        return ay;
    }

    public double getBx() {
        return bx;
    }

    public double getBy() {
        return by;
    }
}
