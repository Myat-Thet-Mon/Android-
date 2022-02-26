package ch2Project;
/*

 */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string ");
        String one=input.nextLine();
        System.out.println(one + " -> " +one.length());
        System.out.println("Enter a second string ");
        String two=input.nextLine();
        System.out.println(two+two.length());
        String three=one+" "+two;
        System.out.println(three);
        System.out.println(three.length());

    }
}
