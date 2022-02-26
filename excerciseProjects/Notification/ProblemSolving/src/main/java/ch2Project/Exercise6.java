package ch2Project;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
convert Fahrenheit to cersius
DegreesC = 5(DegreesF −32)/9
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit");
        double fahrenheit = input.nextInt();
        double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.println(celsius);
        celsius = BigDecimal.valueOf(celsius)
                .setScale(1, RoundingMode.HALF_UP)
                .doubleValue();
        System.out.println("celsius " + celsius);
    }
}
