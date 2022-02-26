package ch3Exercise;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character choice");
        String choice = input.next();
        switch (choice) {
            case ("a"):
                System.out.println("Your choice is " + choice);
                break;
            case ("b"):
                System.out.println("Your choice is " + choice);
                break;
            case ("c"):
                System.out.println("Your choice is " + choice);
                break;
            case ("d"):
                System.out.println("Your choice is " + choice);
                break;
            case ("e"):
                System.out.println("Your choice is " + choice);
                break;
            default:
                System.out.println("Error");
        }
    }
}
