package ch6_SelfTest;

import java.util.Scanner;

class DollarFormat1 {
    /**
     Displays amount in dollars and cents notation.
     Rounds after two decimal places.
     Does not advance to the next line after output.
     */
    public static void write(double amount)
    {
        if (amount >= 0)
        {
            System.out.print('$');
            writePositive(amount);
        }
        else
        {
            double positiveAmount = amount;
            // The case for negative
            System.out.print('$');
            //  amounts of money
            System.out.print('-');
            writePositive(positiveAmount);
        }
    }
    //Precondition: amount >= 0;
//Displays amount in dollars and cents notation. Rounds
//after two decimal places. Omits the dollar sign.
    private static void writePositive(double amount)
    {
        int allCents = (int)(Math.round(amount * 100));
        int dollars = allCents / 100;
        int cents = allCents % 100;
        System.out.print(dollars);
        System.out.print('.');
        if (cents < 10)
            System.out.print('0');
        System.out.print(cents);
    }
    /**
     Displays amount in dollars and cents notation.
     Rounds after two decimal places.
     Advances to the next line after output.
     */
    public static void writeln(double amount){
        write(amount);
        System.out.println();
    }
}
public class Exercise27 {
    public static void main(String[] args)
    {
        double amount;
        String response;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(
                "Testing DollarTry.write:");
        do
        {
            System.out.println("Enter a value of type double:");
            amount = keyboard.nextDouble();
            DollarFormat2.writeln(7.0);
            //System.out.println();
            System.out.println("Test again?");
            response = keyboard.next();
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("End of test.");
    }
}
