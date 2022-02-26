package ch6Project;

import ch6_SelfTest.DollarFormat;

import java.util.Scanner;

class DoubleOut {

    public static void scienceWrite(double amount) {
        if (amount >= 0) {
            writePositive(amount);
        }
    }

    private static void writePositive(double amount) {
        int index = (int) amount;
        String newAmount = String.valueOf(index);
        int division = 1;
        for (int i = 1; i < newAmount.length(); i++) {
            division *= 10;
        }
        amount = amount / division;
        System.out.print(amount + "e-" + newAmount.length());
    }

    public static void scienceWriteln(double amount) {
        scienceWrite(amount);
        System.out.println();
    }
}


public class Exercise1 {
    public static void main(String[] args) {
        double amount;
        String response;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(
                "Testing DoubleOut.write:");
        do {
            System.out.println("Enter a value of type double:");
            amount = keyboard.nextDouble();
            DoubleOut.scienceWrite(amount);
            System.out.println();
            System.out.println("Test again?");
            response = keyboard.next();
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("End of test.");
    }
}

