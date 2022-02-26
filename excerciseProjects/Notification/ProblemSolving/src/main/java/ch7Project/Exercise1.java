package ch7Project;

import java.util.Scanner;

public class Exercise1 {
    public int returnSumMethod(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter the value of number");
            num[i] = input.nextInt();
        }
        System.out.println("Sum :" + obj.returnSumMethod(num));
        for (int i = 0; i < num.length; i++) {
            double average=(double)100*(num[i])/ obj.returnSumMethod(num);
            System.out.println("Percentage of " +num[i] +" is "+average);
        }
    }
}
