package org.example.ch2.endOfChapterExercises;

import java.lang.invoke.LambdaMetafactory;
import java.util.Scanner;

public class ThirteenCompoundInterest {
//    (Financial application: compound value) Suppose you save $100 each month in a
//savings account with annual interest rate 3.75%. Thus, the monthly interest rate is
//0.0375/12 = 0.003125. After the first month, the value in the account becomes
// 100 * (1 + 0.003125) = 100.3125
// After the second month, the value in the account becomes
// (100 + 100.3125) * (1 + 0.003125) = 200.938
// After the third month, the value in the account becomes
// (100 + 200.938) * (1 + 0.003125) = 301.878
// and so on
//Enter the monthly saving amount: 100
//After the first month, the account value is 100.3125
//After the second month, the account value is 200.9384765625
//After the third month, the account value is 301.8789093017578
//After the sixth month, the account value is 606.5967866995037
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount you would like to save each month : ");
        double monthlySavings = input.nextDouble();
        double monthlyInterestRate = 0.003125;
        double amountAccrued = 0;
        double incrementingInterestAndValue = 0;
        //monthlySavings = monthlySavings * (1 + monthlyInterestRate);
        for(int i = 0; i < 6; i++){
            amountAccrued = (monthlySavings + incrementingInterestAndValue) * (1 + monthlyInterestRate);
            incrementingInterestAndValue = amountAccrued;
            System.out.println(amountAccrued);
        }
        //double amountSavedOverOneMonth = monthlySavings * (1 + monthlyInteresRate);
        System.out.println(amountAccrued);
    }
}
