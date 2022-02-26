package ch3Exercise;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character choice");
        String choice = input.next();
        if (choice.equals("a")) {
            System.out.println("Your choice is " + choice);
        } else if (choice.equals("b")) {
            System.out.println("Your choice is " + choice);
        } else if (choice.equals("c")) {
            System.out.println("Your choice is " + choice);
        } else if (choice.equals("d")) {
            System.out.println("Your choice is " + choice);
        } else if (choice.equals("e")) {
            System.out.println("Your choice is " + choice);
        } else {
            System.out.println("Error");
        }
    }
}
