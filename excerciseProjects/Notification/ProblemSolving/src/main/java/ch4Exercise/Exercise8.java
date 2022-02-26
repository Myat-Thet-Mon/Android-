package ch4Exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String inputString = input.nextLine();
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char assign = inputString.charAt(i);
            if (assign == ' ') {
                count++;
            }
        }
        System.out.println("Count :" + count);
    }
}
