package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise3OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        double num = input.nextDouble();
        String result = null;
        String ans = null;
        do {
            System.out.println("Enter Fahrenheit F or Celsius C ");
            result = input.next();
            if (result.equalsIgnoreCase("F")) {
                double c = 5 * (num - 32) / 9;
                System.out.println("Celsius " + c);
            } else if (result.equalsIgnoreCase("C")) {
                double f = 9 * (num / 5) + 32;
                System.out.println("Fahrenheit " + f);
            } else {
                System.out.println("Enter valid temperature Fahrenheit or Celsius");
                result = input.next();
                if (result.equalsIgnoreCase("F")) {
                    double c = 5 * (num - 32) / 9;
                    System.out.println("Celsius " + c);
                } else if (result.equalsIgnoreCase("C")) {
                    double f = 9 * (num / 5) + 32;
                    System.out.println("Fahrenheit " + f);
                }
            }
            System.out.println("type Q or q to quit or to press any other key to repeat the loop");
            ans=input.next();
        } while (!ans.equalsIgnoreCase("Q"));

    }
}
