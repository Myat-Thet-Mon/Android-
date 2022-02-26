package ch4Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal");
        double principal = input.nextDouble();
        System.out.println("Enter interest rate");
        double rate = input.nextDouble();
        double monthlyRate = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Your principal is :" + principal);
            monthlyRate = principal * ((rate / 12) / 100);
            principal = principal + monthlyRate;

            System.out.println("Enter month by month balance");
            double balance = input.nextDouble();
            System.out.println("deposit or withdraw");
            String decision = input.next();

            if (decision.equalsIgnoreCase("deposit")) {
                principal = principal + balance;
                System.out.println("After deposit :" + principal);
            } else if (decision.equalsIgnoreCase("withdraw")) {
                principal = principal - balance;
                System.out.println("After deposit :" + principal);
            }
        }
    }
}
