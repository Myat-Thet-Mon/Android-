package ch7Project;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string");
        String inputString = input.nextLine();
        inputString = inputString.toLowerCase();
        inputString = inputString.replaceAll("\\s", "");
        int[] character = new int[26];

        for (int i = 0; i < inputString.length(); i++) {
            char inputChar = inputString.charAt(i);
            int index = inputChar - 'a';
            character[index]++;
        }

        char output = 'a';
        for (int i = 0; i < character.length; i++) {
            System.out.println("char " + output + ":" + character[i]);
            output++;
        }

//        for (char i = 'a'; i <= 'z'; i++) {
//            int count = 0;
//            for (int j = 0; j < inputString.length(); j++) {
//                if (inputString.charAt(j) == i) {
//                    count++;
//                }
//            }
//            System.out.println("char " + i + ":" + count);
//        }
    }
}