package ch2Project;

import java.util.Scanner;

/*
the word "I love U to change I hate U
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter line");
        String word = input.nextLine();
        String newWord = word.replaceFirst("hate", "love");
        System.out.println(newWord);
    }
}
