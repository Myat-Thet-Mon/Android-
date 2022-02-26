package ch4Exercise;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String inputString = input.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            char reverse = inputString.charAt(inputString.length() - 1 - i);
            System.out.print(reverse);
        }
    }
}
