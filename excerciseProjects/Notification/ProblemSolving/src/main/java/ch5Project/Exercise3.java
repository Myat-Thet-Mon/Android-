package ch5Project;

import java.util.Scanner;

class Student {
    private double firstQuizScore;
    private double secondQuizScore;
    private double mildTermExamScore;
    private double finalExamScore;
    private char grade;
    private double totalGradeScore;


    public void readInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter first quiz score");
            this.firstQuizScore = input.nextDouble();
            System.out.println("enter second quiz score");
            this.secondQuizScore = input.nextDouble();
            System.out.println("enter Mild term score");
            this.mildTermExamScore = input.nextDouble();
            System.out.println("enter final exam score");
            this.finalExamScore = input.nextDouble();
            if (firstQuizScore <= 10 && firstQuizScore >= 0 && secondQuizScore <= 10 && secondQuizScore >= 0 && mildTermExamScore <= 100 && mildTermExamScore >= 0 && finalExamScore <= 100 && finalExamScore >= 0) {
                break;
            } else {
                System.out.println("Error !Please enter correct score");
            }
        }
    }

    public void writeOutput() {
        System.out.println("First quiz score :" + firstQuizScore);
        System.out.println("Second quiz score :" + secondQuizScore);
        System.out.println("MidTerm score :" + mildTermExamScore);
        System.out.println("FinalExam score :" + finalExamScore);
        System.out.println("Grade Score :" + totalGradeScore);
        System.out.println("Grade :" + grade);
    }

    public void calculateGrade() {

        double quizGradeScore = 25 * ((this.firstQuizScore + this.secondQuizScore) / 20);
        double midTermGradeScore = 25 * (this.mildTermExamScore / 100);
        double finalExamGradeScore = 50 * (this.finalExamScore / 100);
        this.totalGradeScore = quizGradeScore + midTermGradeScore + finalExamGradeScore;
        if (totalGradeScore >= 90) {
            this.grade = 'A';
        } else if (totalGradeScore <= 89 && totalGradeScore >= 80) {
            this.grade = 'B';
        } else if (totalGradeScore <= 79 && totalGradeScore >= 70) {
            this.grade = 'C';
        } else if (totalGradeScore <= 69 && totalGradeScore >= 60) {
            this.grade = 'D';
        } else if (totalGradeScore < 60) {
            this.grade = 'F';
        }
    }

}

public class Exercise3 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.readInput();
        obj.calculateGrade();
        obj.writeOutput();
    }
}

