package ch6_SelfTest;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your speed");
        double speed=input.nextDouble();
        long speedLong=Math.round(speed);
        System.out.println(speedLong);
    }
}
