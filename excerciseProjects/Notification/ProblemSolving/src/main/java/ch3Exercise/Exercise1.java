package ch3Exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score");
        int score = input.nextInt();
        if (score >= 0 && score <= 100) {
            System.out.println("Valid score");
        } else {
            System.out.println("Invalid score");
        }
    }
}
