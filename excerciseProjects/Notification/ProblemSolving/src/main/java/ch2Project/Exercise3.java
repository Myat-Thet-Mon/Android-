package ch2Project;

import java.util.Scanner;

/*
pricipal
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount of monthly payment");
        double payment = input.nextDouble();
        System.out.println("Enter principal balance");
        double principal = input.nextDouble();
        double interest = 7.49 / 12;
        interest = principal* interest / 100;
        double goToOriginal = payment - interest;
        interest=payment-goToOriginal;
        System.out.println("the payment that goes to interest "+interest);
        System.out.println("the payment that goes to original "+goToOriginal);
    }

}

