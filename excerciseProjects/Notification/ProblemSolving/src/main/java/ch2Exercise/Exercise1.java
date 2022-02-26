package ch2Exercise;

import java.util.Scanner;

/*

 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X");
        double x = input.nextDouble();
        double y = 1.0 / x;
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
        x = x - 1;
        y = y - 1;
        System.out.println("After subtract " + x);
        System.out.println("After subtract " + y);
    }
}
