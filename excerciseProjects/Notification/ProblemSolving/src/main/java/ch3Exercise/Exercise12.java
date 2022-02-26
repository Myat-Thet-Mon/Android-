package ch3Exercise;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter letter grade");
        String grade = input.next();
        System.out.println("Enter + or - or cancel");
        String addOrSubtract = input.next();

        double gradeValue = 0;
        if (grade.equals("A")) {
            gradeValue = 4.0;
            if (addOrSubtract.equals("+")) {
                gradeValue = gradeValue + 0.25;
                System.out.println(gradeValue);
            } else if (addOrSubtract.equals("-")) {
                gradeValue = gradeValue - 0.25;
                System.out.println(gradeValue);
            } else {
                System.out.println(gradeValue);
            }
        } else if (grade.equals("B")) {
            gradeValue = 3.0;
            if (addOrSubtract.equals("+")) {
                gradeValue = gradeValue + 0.25;
                System.out.println("Value of grade :" + gradeValue);
            } else if (addOrSubtract.equals("-")) {
                gradeValue = gradeValue - 0.25;
                System.out.println("Value of grade :" + gradeValue);
            } else {
                System.out.println("Value of grade :" + gradeValue);
            }
        } else if (grade.equals("C")) {
            gradeValue = 2.0;
            if (addOrSubtract.equals("+")) {
                gradeValue = gradeValue + 0.25;
                System.out.println("Value of grade :" + gradeValue);
            } else if (addOrSubtract.equals("-")) {
                gradeValue = gradeValue - 0.25;
                System.out.println("Value of grade :" + gradeValue);
            } else {
                System.out.println("Value of grade :" + gradeValue);
            }
        } else if (grade.equals("D")) {
            gradeValue = 1.0;
            if (addOrSubtract.equals("+")) {
                gradeValue = gradeValue + 0.25;
                System.out.println("Value of grade :" + gradeValue);
            } else if (addOrSubtract.equals("-")) {
                gradeValue = gradeValue - 0.25;
                System.out.println("Value of grade :" + gradeValue);
            } else {
                System.out.println("Value of grade :" + gradeValue);
            }
        } else {
            gradeValue = 0.0;
            if (addOrSubtract.equals("+")) {
                gradeValue = gradeValue + 0.25;
                System.out.println("Value of grade :" + gradeValue);
            } else if (addOrSubtract.equals("-")) {
                gradeValue = gradeValue - 0.25;
                System.out.println("Value of grade :" + gradeValue);
            } else {
                System.out.println("Value of grade :" + gradeValue);
            }
        }
    }
}