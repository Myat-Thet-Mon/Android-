package ch2Exercise;

import java.util.Scanner;

/*

 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter x");
        double x=input.nextDouble();
        int y=(int)x;
        System.out.println("X "+x);
        System.out.println("Y "+y);
        byte z=(byte) x;
        System.out.println("before type casting x "+x);
        System.out.println("After type casting z "+z);
    }
}
