package ch4Project;

import java.util.Scanner;

/*
Write a program that implements your algorithm from Exercise 2.
 */
public class Exercise2OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal");
        double principal = input.nextDouble();
        System.out.println("Enter interest rate");
        double rate = input.nextDouble() / 12;
        boolean condition = true;
        while (condition == true) {
            double interest = principal * (rate / 100);
            principal = principal + interest;
            System.out.println("Principal " + principal);
            System.out.println("Enter add or substract and enter amount");
            String addOrSub = input.next();
            double amount = input.nextDouble();
            if (addOrSub.equalsIgnoreCase("add")) {
                principal = principal + amount;
                System.out.println("Final Amount " + principal);

            } else if(addOrSub.equalsIgnoreCase("substract")) {
                principal = principal - amount;
                System.out.println("Final Amount " + principal);

            }

        }
    }
}
