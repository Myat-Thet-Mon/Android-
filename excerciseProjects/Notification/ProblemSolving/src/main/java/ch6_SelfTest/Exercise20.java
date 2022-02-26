package ch6_SelfTest;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n1");
        int n1=input.nextInt();
        System.out.println("Enter n2");
        long n2=input.nextLong();
        System.out.println(Math.min(n1, -3));
        //return min number type
    }
}
