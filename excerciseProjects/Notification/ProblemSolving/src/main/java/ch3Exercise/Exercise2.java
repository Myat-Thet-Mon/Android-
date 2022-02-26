package ch3Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x value");
        int x = input.nextInt();
        if (x % 2 == 0) {
            x = x / 2;
            System.out.println("X is " + x);
        } else {
            x = (x * 3) - 1;
            System.out.println("X is " + x);
        }
    }
}
