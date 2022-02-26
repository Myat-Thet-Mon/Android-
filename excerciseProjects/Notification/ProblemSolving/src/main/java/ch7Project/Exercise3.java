package ch7Project;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String inputString = input.nextLine();
        inputString= inputString.replaceAll("\\s", "");
        inputString=inputString.toLowerCase();
        System.out.println(inputString);

        char[] charArray = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            charArray[i] = inputString.charAt(inputString.length() - (i + 1));
        }

        boolean result = false;
        for (int i = 0; i < inputString.length(); i++) {
            if (charArray[i] == inputString.charAt(i)) {
                result = true;
            } else {
                System.out.println("Input text is not palindrome");
                break;
            }
        }
        if (result == true) {
            System.out.println("Input text is palindrome");
        }

    }
}
