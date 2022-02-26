package ch4Project;

import java.util.Scanner;

/*
smallest
 */
public class Exercise7OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score = 0;
        double totalScore = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double f = 0;
        double highest = 0;
        double lowest = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Enter score");
            score = input.nextInt();
            if(score<0){
                break;
            }
            totalScore += score;
            if(score<=100 && score>=0) {
                if (score >= 90 && score <= 100) {
                    a++;
                } else if (score >= 80 && score <= 89) {
                    b++;
                } else if (score >= 70 && score <= 79) {
                    c++;
                } else if (score >= 60 && score <= 69) {
                    d++;
                } else if (score >= 0 && score <= 59) {
                    f++;
                }
                if (score > highest) {
                    highest = score;
                }
                if (score < lowest) {
                    lowest = score;
                }
            }
        }
        System.out.println("Total number of scores " + totalScore);
        double totalGrade = a + b + c + d + f;
        System.out.println("Total number of each letter grade " + totalGrade);
        System.out.println("Percentage of total for A letter grade " + (100 * (a / totalGrade)));
        System.out.println("Percentage of total for B letter grade " + 100 * (b / totalGrade));
        System.out.println("Percentage of total for C letter grade " + 100 * (c / totalGrade));
        System.out.println("Percentage of total for D letter grade " + 100 * (d / totalGrade));
        System.out.println("Percentage of total for F letter grade " + 100 * (f / totalGrade));
        System.out.println("Range of scores: highest " + highest);
        System.out.println("Range of scores: lowest "+lowest);
        double average = totalScore / totalGrade;
        System.out.println("Average " + average);
    }
}
