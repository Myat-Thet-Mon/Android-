package ch3Exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount = input.nextInt();
        int charge = 0;
        if (amount < 10) {
            charge = 1;
            System.out.println("Charge :" + charge);
        } else if (amount >= 10 && amount <= 100) {
            charge = amount * 10 / 100;
            System.out.println("Charge :"+charge);
        } else if (amount >= 100 && amount <= 1000) {
            charge = amount * 5 / 100 + 5;
            System.out.println("Charge :"+charge);
        } else if (amount > 1000) {
            charge = 40 + amount * 1 / 100;
            System.out.println("Charge :"+charge);
        }
    }
}
