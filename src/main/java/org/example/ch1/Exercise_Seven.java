package org.example.ch1;

public class Exercise_Seven {

    public static void main(String[] args){
        //all incorrect, must use double, because the remainders of the whole numbers are truncated.
//        double fakePi = 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11));
//        System.out.println(fakePi);
//        double secondFakePi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);
//        System.out.println(secondFakePi);
//        double test = 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13));
//        System.out.println(test);
        System.out.println(4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
        System.out.println(4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
    }
}
