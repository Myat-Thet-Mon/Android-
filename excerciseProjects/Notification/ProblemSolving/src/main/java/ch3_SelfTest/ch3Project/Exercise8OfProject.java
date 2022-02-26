package ch3_SelfTest.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise8OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a String");
        String word = input.nextLine();
        word = word.toLowerCase();
        if (word.contains("cat") || word.contains("dog") || word.contains("llama")) {
            System.out.println("It is profane");
        } else {
            System.out.println("It is not profane");
        }
    }
}
