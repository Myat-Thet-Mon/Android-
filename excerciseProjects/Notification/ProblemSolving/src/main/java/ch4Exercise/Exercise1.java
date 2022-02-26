package ch4Exercise;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean test = true;
        boolean result = false;
        while (test == true) {
            System.out.println("Enter a word");
            String word = input.next();
            if (word.equalsIgnoreCase("done")) {
                break;
            } else {
                if (word.charAt(0) == word.charAt(word.length() - 1)) {
                    result = true;
                    System.out.println(result);
                } else {
                    result = false;
                    System.out.println(result);
                }
            }
        }
    }
}
