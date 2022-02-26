package ch6_SelfTest;

import java.util.Scanner;
/*
Yes, you could use the names print and println ,
 */
class OutputFormat1 {

    public static void print(double value, int digit) {
        int decimalPoint=1;
        for (int i=1;i<=digit;i++){
            decimalPoint=decimalPoint*10;
        }

        int allCents = (int)(Math.round(value * decimalPoint));
        int dollars = allCents / decimalPoint;
        int cents = allCents % decimalPoint;

        System.out.print(dollars);
        System.out.print('.');

        int test=1;
        for (int i=1;i<digit;i++){
            test=test*10;
        }
        for (int i=1;i<digit;i++){
            if (cents<test){
                System.out.print(0);
                test=test/10;
            }
        }

        System.out.println(cents);
    }

    public static void println(double value, int digit) {
        print(value,digit);
        System.out.println();
    }

}
public class Exercise31 {
    public static void main(String[] args) {
        OutputFormat1 outputFormat1=new OutputFormat1();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value and digit");
        double value = input.nextDouble();
        int digit = input.nextInt();
        OutputFormat1.print(value, digit);
        OutputFormat1.println(value, digit);
    }
}
