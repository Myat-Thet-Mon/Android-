package ch4Project;

import javax.swing.*;
import java.util.Scanner;

/*

 */
public class Exercise12OfProjectAtCap4 {
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
        while (score >= 0) {
            score = Double.parseDouble(JOptionPane.showInputDialog("Enter score"));
            if (score < 0) {
                break;
            }
            totalScore += score;

            if (score <= 100 && score >= 0) {
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
        JOptionPane.showMessageDialog(null, "Total number of scores " + totalScore);
        double totalGrade = a + b + c + d + f;
        JOptionPane.showMessageDialog(null, "Total number of each letter grade " + totalGrade);
        JOptionPane.showMessageDialog(null, "Percentage of total for A letter grade " + 100 * (a / totalGrade));
        JOptionPane.showMessageDialog(null, "Percentage of total for B letter grade " + 100 * (b / totalGrade));
        JOptionPane.showMessageDialog(null, "Percentage of total for C letter grade " + 100 * (c / totalGrade));
        JOptionPane.showMessageDialog(null, "Percentage of total for D letter grade " + 100 * (d / totalGrade));
        JOptionPane.showMessageDialog(null, "Percentage of total for F letter grade " + 100 * (f / totalGrade));
        JOptionPane.showMessageDialog(null, "Range of scores: highest " + highest);
        JOptionPane.showMessageDialog(null, "Range of scores: lowest " + lowest);
        double average = totalScore / totalGrade;
        JOptionPane.showMessageDialog(null, "Average " + average);
    }
}
