package ch3Exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yes or no");
        String variableResponse = input.next();
        boolean accept = false;
        if (variableResponse.equalsIgnoreCase("yes") || variableResponse.equalsIgnoreCase("y")) {
            accept = true;
            System.out.println(accept);
        } else if (variableResponse.equalsIgnoreCase("no")) {
            System.out.println(accept);
        }
    }
}
