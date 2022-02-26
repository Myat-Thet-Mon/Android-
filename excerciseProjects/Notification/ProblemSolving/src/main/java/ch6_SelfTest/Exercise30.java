package ch6_SelfTest;

import java.util.Scanner;

class OutputFormat {

    public static void write(double value, int digit) {
        int decimalPoint=1;
        for (int i=1;i<=digit;i++){
            decimalPoint=decimalPoint*10;
        }

        int allCents = (int)(Math.round(value * decimalPoint));
        int dollars = allCents / decimalPoint;
        int cents = allCents % decimalPoint;
        //int cents =8;
        System.out.print(dollars);
        System.out.print('.');
        if (cents < 10)
            System.out.print('0');
        System.out.print(cents);
    }

    public static void writeln(double value, int digit) {
        double decimal = 0;
        for (int i = 1; i <= digit; i++) {
            decimal *= 10;
        }
        double ans = (double) (Math.round(value*decimal) / decimal);
        System.out.println("Result :" + ans);


    }

}

public class Exercise30 {
    public static void main(String[] args) {
        OutputFormat outputFormat = new OutputFormat();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value and digit");
        double value = input.nextDouble();
        int digit = input.nextInt();
        OutputFormat.write(value, digit);
        OutputFormat.writeln(value, digit);
    }
}
