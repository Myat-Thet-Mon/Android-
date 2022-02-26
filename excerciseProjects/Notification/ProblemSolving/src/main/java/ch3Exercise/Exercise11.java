package ch3Exercise;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character");
        String character = input.next();
        double gradeValue = 0;
        switch (character) {
            case ("A"):
                gradeValue = 4.0;
                System.out.println("Grade Value " + gradeValue);
                break;
            case ("B"):
                gradeValue = 3.0;
               System.out.println("Grade Value " + gradeValue);
                break;
            case ("C"):
                gradeValue = 2.0;
                System.out.println("Grade Value " + gradeValue);
                break;
            case ("D"):
                gradeValue = 1.0;
                System.out.println("Grade Value " + gradeValue);
                break;
            case ("F"):
                gradeValue = 0.0;
                System.out.println("Grade Value " + gradeValue);
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}
