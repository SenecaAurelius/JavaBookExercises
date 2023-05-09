package org.example.ch4.endOfUnitExercises;
import java.util.Scanner;
public class RStudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char major = '!';
        char yearStatus = '!';
        while(!(major == 'c' || major == 'i' || major == 'a') || !(yearStatus == '1' || yearStatus == '2' || yearStatus == '3' || yearStatus == '4')){
            System.out.println("Please enter two characters, the first either I, C, or A, for Information Management, Computer Science, or Accounting respectively, \nand being 1, 2, 3, or 4, for freshman, sophomore, junior, or senior respectively : ");
            String str = input.nextLine();
            major = str.toLowerCase().charAt(0);
            yearStatus = str.toLowerCase().charAt(1);
            System.out.println(major);
            System.out.println(yearStatus);
            String strMajor = "";
            String strYearStatus = "";
            if(major == 'c'){
                strMajor = "Computer Science";
            } else if (major == 'i'){
                strMajor = "Information Management";
            } else if (major == 'a'){
                strMajor = "Accounting";
            }

            if(yearStatus == '1'){
                strYearStatus = "Freshman";
            } else if (yearStatus == '2'){
                strYearStatus = "Sophomore";
            } else if (yearStatus == '3'){
                strYearStatus = "Junior";
            }else if (yearStatus == '4'){
                strYearStatus = "Senior";
            }
            System.out.println(strMajor + " " + strYearStatus);
            if(!(major == 'c' || major == 'i' || major == 'a') || !(yearStatus == '1' || yearStatus == '2' || yearStatus == '3' || yearStatus == '4')){
                System.out.println("You have to enter two characters, not separated by a space, denoting the major and year level of a student. ");
            }
        }
    }
}
