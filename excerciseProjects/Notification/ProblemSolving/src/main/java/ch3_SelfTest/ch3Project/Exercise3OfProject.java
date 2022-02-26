package ch3_SelfTest.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise3OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String one = input.next();
        System.out.println("Enter second string");
        String two = input.next();
        System.out.println("Enter third string");
        String three = input.next();
        int result = one.compareTo(two);//One to two
        if (result > 0) {
            int ans = one.compareTo(three);
            if (ans > 0) {
                int a = two.compareTo(three);
                if (a >= 0) {
                    System.out.println(two);
                } else if (a < 0) {
                    System.out.println(three);
                }

            } else if (ans <= 0) {
                System.out.println(one);
            }

        } else if (result == 0) {
            System.out.println(one);

        } else if (result < 0) {
            int b = one.compareTo(three);
            if (b > 0) {
                System.out.println(one);
            } else if (b == 0) {
                System.out.println(one);//two
            } else if (b < 0) {
                int c = two.compareTo(three);
                if (c >= 0) {
                    System.out.println(three);
                } else if (c < 0) {
                    System.out.println(two);
                }
            }
        }
    }
}
