package org.example.ch5.endOfBookExercises;

public class E5CtoFandFtoC {
    public static void main(String[] args) {
        int count = 0;
        double celsius = 0;
        double fahrenheit = celsius * 9/5 + 32;
        double fahrenheitTwo = 20;
        double celsiusTwo = (fahrenheitTwo - 32) * 5 / 9;
        System.out.println("Celsius  Fahrenheit  |  Fahrenheit  celsius");
        while(count < 51){
            System.out.println(celsius + "    " + fahrenheit + "  |  " + fahrenheitTwo + "    " + celsiusTwo);
            celsius += 2;
            fahrenheit = celsius * 9/5 + 32;
            fahrenheitTwo += 5;
            celsiusTwo = (fahrenheitTwo - 32) * 5 / 9;
            count++;
        }
    }
}
