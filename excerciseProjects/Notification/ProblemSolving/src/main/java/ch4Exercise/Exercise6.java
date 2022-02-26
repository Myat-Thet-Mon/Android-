package ch4Exercise;

import java.util.Scanner;

/*
compute the sum 1 + 2 2 + 3 2 + 4 2 + 5 2 + ... + n 2
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count time");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+"*"+i);
            sum += i * i;
            if(i==n){
                break;
            }
            System.out.print("+");
        }
        System.out.println();
        System.out.print("Sum :" + sum);
    }
}
