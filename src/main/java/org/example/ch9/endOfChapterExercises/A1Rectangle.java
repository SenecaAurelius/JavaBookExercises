package org.example.ch9.endOfChapterExercises;

public class A1Rectangle {
    public static void main(String[] args) {
        A1Rectangle rect1 = new A1Rectangle(4, 40);
        A1Rectangle rect2 = new A1Rectangle(3.5, 35.9);
        A1Rectangle[] rectArr = {rect1, rect2};

        for(int i = 0; i < rectArr.length; i++){
            rectArr[i].getDetailsWidthHeightAreaPerimeter();
        }
    }
    private double width = 1;
    private double height = 1;

    public A1Rectangle(){

    }

    public A1Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void getDetailsWidthHeightAreaPerimeter(){
        System.out.println("Width : " + this.getWidth());
        System.out.println("Height : " + this.getHeight());
        System.out.println("Area : " + this.getArea());
        System.out.println("Perimeter : " + this.getPerimeter());
    }

    public double getArea(){
        double area = this.width * this.height;
        return area;
    }

    public double getPerimeter(){
        double peri = width + width + height + height;
        return peri;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }
}
