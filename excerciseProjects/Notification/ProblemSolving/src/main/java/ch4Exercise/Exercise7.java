package ch4Exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count time");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+"*"+i);
            sum += i * i;
            if (i == n) {
                break;
            }
            System.out.print(",");
        }
        System.out.println();
        System.out.println("Sum :" + sum);
    }
}
