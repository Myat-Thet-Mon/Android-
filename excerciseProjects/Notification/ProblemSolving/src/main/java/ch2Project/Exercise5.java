package ch2Project;

import java.util.Scanner;

/*
read int to string
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four digit string");
        String digit = input.next();
        int num = Integer.parseInt(digit);
        int a = num / 1000;
        System.out.println(a);
        num = num % 1000;
        int b = num / 100;
        System.out.println(b);
        num = num % 100;
        int c = num / 10;
        System.out.println(c);
        int d = num % 10;
        System.out.println(d);
    }
}
