package ch4Exercise;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of person");
        int person = input.nextInt();
        int handShake = 0;
        int total = 0;
        for (int i = 1; i <= person; i++) {
            handShake = person;
            total = handShake * i;
        }
        System.out.println("Total handshakes :" + total);
    }
}
