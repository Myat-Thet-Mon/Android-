package ch4Exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value");
        int n = input.nextInt();
        int num = 1;
        int sum=0;
        System.out.print(num);
        for (int i = 0; i < n-1; i++) {
            sum+=num;
            num = num + 2;
            System.out.print(" + " + num);

        }
        System.out.println("The sum is "+sum);
    }
}
