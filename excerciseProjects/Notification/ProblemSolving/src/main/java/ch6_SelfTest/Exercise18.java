package ch6_SelfTest;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your speed");
        double speed=input.nextDouble();
         int approxSpeed=(int)Math.round(speed);
        System.out.println(approxSpeed);
    }
}
