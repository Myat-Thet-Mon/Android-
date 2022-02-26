package ch7_selfTest;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        double[] a = new double[input.nextInt()];
        int numberUsed = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter data");
            a[i] = input.nextDouble();
            numberUsed++;
            System.out.println("Do you want to continue yes or no");
            String ans = input.next();
            if (ans.equals("no")) {
                break;
            }
        }
        a[numberUsed]=42;
        int updateNumberUsed=numberUsed+1;
        for (int i=0;i<a.length;i++){
            if (a[i]==0){
                continue;
            }
            System.out.println("Your data is "+a[i]);
        }
        System.out.println("Number used is "+updateNumberUsed);
    }
}
