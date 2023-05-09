package org.example.ch3.EndOfChapterExercises;

public class DFourRandomMonth {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            int month = (int) (1 + Math.random() * 12);
            switch (month) {
                case 1: System.out.println(month + " Jan"); break;
                case 2: System.out.println(month + " Feb"); break;
                case 3: System.out.println(month + " Mar"); break;
                case 4: System.out.println(month + " Apr"); break;
                case 5: System.out.println(month + " May"); break;
                case 6: System.out.println(month + " Jun"); break;
                case 7: System.out.println(month + " Jul"); break;
                case 8: System.out.println(month + " Aug"); break;
                case 9: System.out.println(month + " Sep"); break;
                case 10: System.out.println(month + " Oct"); break;
                case 11: System.out.println(month + " Nov"); break;
                case 12: System.out.println(month + " Dec"); break;
            }
        }

    }
}
