package ch2Exercise;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("y");
        System.out.println("Enter a string.");
        String a = keyboard.next();
        String b = keyboard.nextLine();
        System.out.println("a is" + a);
        System.out.println("b is" + b);
    }
}
