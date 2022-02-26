package ch4Project;

import java.util.Scanner;

/*
Repeat Programming Project 4 of Chapter 3, but use a loop that reads and
processes sentences until the user says to end the program.
 */
public class Exercise1OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean test=false;
        String ans=null;
        do {
            System.out.println("Enter line");
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
            System.out.println("Do you want to continue?");
            ans=input.next();
        }while(ans.equalsIgnoreCase("yes"));
    }
}
