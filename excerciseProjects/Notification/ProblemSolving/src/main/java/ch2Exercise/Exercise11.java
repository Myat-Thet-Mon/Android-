package ch2Exercise;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string.");
        int n = keyboard.nextInt();
        String s = keyboard.next();
        System.out.println("n is" + n);
        System.out.println("s is" + s);
    }
}
