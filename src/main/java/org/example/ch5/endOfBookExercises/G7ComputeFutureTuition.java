package org.example.ch5.endOfBookExercises;

public class G7ComputeFutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double sum = 0;
        for(int i = 1; i < 15; i++){
            tuition = tuition * 1.06;
            System.out.println("The tuition in " + i + " year will be " + tuition + ".");
            if(i >= 10 && i <= 13){
                sum += tuition;
            }
        }
        System.out.println(sum + " is the cost of tuition after ten years have passed, over 4 years");
    }
}
