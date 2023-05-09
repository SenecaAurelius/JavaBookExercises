package org.example.ch4.endOfUnitExercises;

import java.util.Scanner;

public class V23CalculatingPayroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the employee's name : ");
        String name = input.nextLine();

        System.out.println("Please enter the number of hours worked in a week : ");
        int hoursWorked = input.nextInt();

        System.out.println("Please enter the hourly pay rate : ");
        double hourlyPayRate = input.nextDouble();

        System.out.println("Please enter the federal tax withholding rate : ");
        double fedTax = input.nextDouble();

        System.out.println("Please enter the state tax withholding rate : ");
        double stateTax = input.nextDouble();
//        double stateWitholdings = stateTax *

        System.out.println(name);
        System.out.println(hoursWorked);
        System.out.println(hourlyPayRate);
        System.out.println("Gross pay : " + hourlyPayRate * hoursWorked);
        System.out.println("Deductions : ");
        System.out.println("Federal Withholding : (" + fedTax + ") : " + fedTax * hourlyPayRate * hoursWorked);
        System.out.println("State Withholding : (" + stateTax + ") : " + stateTax * hourlyPayRate * hoursWorked);
        System.out.println("Total Deduction : "
                + ((fedTax * hourlyPayRate * hoursWorked)
                + (stateTax * hourlyPayRate * hoursWorked)));
        System.out.println("Net Pay : " + ((hourlyPayRate * hoursWorked) - ((fedTax * hourlyPayRate * hoursWorked)
                + (stateTax * hourlyPayRate * hoursWorked))));
    }
}
