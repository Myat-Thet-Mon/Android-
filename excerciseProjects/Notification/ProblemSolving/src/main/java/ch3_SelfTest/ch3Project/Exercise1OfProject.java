package ch3_SelfTest.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise1OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number and second number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1%num2 == 0) {
            System.out.println("First number is divisible by second number");
        }else{
            System.out.println("first number is not divisible by second number");
        }
    }
}
