package org.example.ch5.endOfBookExercises;

public class ConversionCelciusFahrenheitTable {
    public static void main(String[] args) {
        System.out.println("Celsius    Fahrenheit");
        int count = 0;
        double celsius = 0;
        double fahrenheit = celsius * 9 / 5 + 32;
        while(count < 51){
            fahrenheit = celsius * 9 / 5 + 32;
            System.out.println(celsius + "        " + fahrenheit);
            celsius += 2;
            count++;
        }
    }
}
