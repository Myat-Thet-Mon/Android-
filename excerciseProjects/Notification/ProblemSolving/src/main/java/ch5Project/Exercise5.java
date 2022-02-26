package ch5Project;

import java.util.Scanner;

class GradeDistribution {
    private int numberOfA;
    private int numberOfB;
    private int numberOfC;
    private int numberOfD;
    private int numberOfF;

    public void setNumberOfGrade(int numberA, int numberB, int numberC, int numberD, int numberF) {
        this.numberOfA = numberA;
        this.numberOfB = numberB;
        this.numberOfC = numberC;
        this.numberOfD = numberD;
        this.numberOfF = numberF;
    }

    public void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of A");
        this.numberOfA = input.nextInt();
        System.out.println("Enter number of B");
        this.numberOfB = input.nextInt();
        System.out.println("Enter number of C");
        this.numberOfC = input.nextInt();
        System.out.println("Enter number of D");
        this.numberOfD = input.nextInt();
        System.out.println("Enter number of F");
        this.numberOfF = input.nextInt();
    }

    public int getTotalNumberOfGrade() {
        return numberOfA + numberOfB + numberOfC + numberOfD + numberOfF;
    }

    public double calculatePercentageOfGrade(char grade) {
        double number = 0;
        switch (grade) {
            case 'A':
                number = numberOfA;
                break;
            case 'B':
                number = numberOfB;
                break;
            case 'C':
                number = numberOfC;
                break;
            case 'D':
                number = numberOfD;
                break;
            case 'F':
                number = numberOfF;
                break;
        }
        return 100 * (number / getTotalNumberOfGrade());
    }

    public void drawBarChart() {
        for (int i = 0; i < 11; i++) {
            int num=0;
            System.out.print(num);
            num +=10;

            for (int j = 1; j < 10; j++) {
                System.out.print(" ");
            }
        }
        System.out.println( );

        for (int i = 0; i <= 100; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < calculatePercentageOfGrade('A'); i++) {
            System.out.print("*");
        }
        System.out.println("  A" + "(" + calculatePercentageOfGrade('A') + "%)");

        for (int i = 0; i < calculatePercentageOfGrade('B'); i++) {
            System.out.print("*");
        }
        System.out.println("  B" + "(" + calculatePercentageOfGrade('B') + "%)");

        for (int i = 0; i < calculatePercentageOfGrade('C'); i++) {
            System.out.print("*");
        }
        System.out.println("  C" + "(" + calculatePercentageOfGrade('C') + "%)");

        for (int i = 0; i < calculatePercentageOfGrade('D'); i++) {
            System.out.print("*");
        }
        System.out.println("  D" + "(" + calculatePercentageOfGrade('D') + "%)");

        for (int i = 0; i < calculatePercentageOfGrade('F'); i++) {
            System.out.print("*");
        }
        System.out.println("  F" + "(" + calculatePercentageOfGrade('F') + "%)");
    }
}


public class Exercise5 {
    public static void main(String[] args) {
        GradeDistribution obj = new GradeDistribution();
        //obj.setNumberOfGrade();
        obj.readInput();
        System.out.println("Total number of grade " + obj.getTotalNumberOfGrade());
        obj.drawBarChart();

    }
}
