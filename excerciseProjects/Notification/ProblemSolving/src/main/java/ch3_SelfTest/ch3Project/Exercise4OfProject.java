package ch3_SelfTest.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise4OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String line = input.nextLine();
        if (line.charAt(line.length() - 1) == '?') {
            if (line.length() % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else if (line.charAt(line.length() - 1) == '!') {
            System.out.println("Wow");
        } else {
               System.out.println("You always say followed by\""+ line + "\"");
        }
    }
}
