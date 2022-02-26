package ch2Project;

import java.util.Scanner;

/*
Write a program that read three numbers and display the average of numbers.
 */
public class Exercise1 {
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Enter first number");
              int num1=input.nextInt();
              System.out.println("Enter second number");
              int num2=input.nextInt();
              System.out.println("Enter third number");
              int num3=input.nextInt();
              int average=(num1+num2+num3)/3;
              System.out.println("Average is "+average);

       }
}
