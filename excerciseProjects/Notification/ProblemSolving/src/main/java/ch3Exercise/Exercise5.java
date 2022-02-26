package ch3Exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x value");
        int x = input.nextInt();
        if (x > 5) {
            System.out.println("A");
            if (x < 10)
                System.out.println("B");
        } else
            System.out.println("C");
    }
}
