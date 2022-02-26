package ch7_selfTest;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        double[] a = new double[input.nextInt()];
        int numberUsed = 0;
        int index=0;
        String ans=null;
        do{
            if(numberUsed==a.length){
                System.out.println("Array is full now");
                break;
            }else{
                System.out.println("Enter data");
                a[index] = input.nextDouble();
                index++;
                numberUsed++;
                System.out.println("Do you want to continue yes or no");
                ans=input.next();
            }

        }while(ans.equals("yes"));
    }
}
