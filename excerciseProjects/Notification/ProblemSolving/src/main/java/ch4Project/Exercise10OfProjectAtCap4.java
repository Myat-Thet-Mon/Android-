package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise10OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double annually = 0;
        double monthly = 0;
        double daily = 0;
        double annuallyInterest = 0;
        double monthlyInterest = 0;
        double dailyInterest = 0;
        double totalAnnual = 0;
        double totalMonthly = 0;
        double totalDaily = 0;
        String ans = null;

        do {
            System.out.println("Enter balance");
            double oriBalance = input.nextDouble();
            System.out.println("Enter interest rate");
            double rate = input.nextDouble();

            for (int i = 0; i < 10; i++) {
                annuallyInterest = oriBalance * (rate / 100);
                annually = oriBalance + annuallyInterest;
                oriBalance = annually;
                totalAnnual = oriBalance;
            }
            for (int i = 0; i < 120; i++) {
                monthlyInterest = oriBalance * ((rate / 12) / 100);
                monthly = oriBalance + monthlyInterest;
                oriBalance = monthly;
                totalMonthly = oriBalance;
            }
            for (int i = 0; i < 3650; i++) {
                dailyInterest = oriBalance * ((rate / 365) / 100);
                daily = oriBalance + dailyInterest;
                oriBalance = daily;
                totalDaily = oriBalance;
            }

            System.out.println("annually total balances " + totalAnnual);
            System.out.println("monthly total balances " + totalMonthly);
            System.out.println("daily total balances " + totalDaily);

            System.out.println("Do you want to quit");
            ans = input.next();
        } while (!ans.equalsIgnoreCase("quit"));
    }
}
