package ch4Exercise;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double scoreOfA = 0;
        double totalScoreOfA = 0;
        double scoreOfB = 0;
        double totalScoreOfB = 0;
        for (int i = 1; i <= 9; i++) {
            System.out.println("The number of run scores by Team A");
            scoreOfA = input.nextDouble();
            totalScoreOfA += scoreOfA;
            System.out.println("The number of run scores by Team B");
            scoreOfB = input.nextDouble();
            totalScoreOfB += scoreOfB;

        }
        System.out.println("Total scores of Team A " + totalScoreOfA);
        System.out.println("Total scores of Team B " + totalScoreOfB);

    }
}
