package ch7_selfTest;

import java.util.Scanner;

/*

 */
public class Exercise17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[]array=new double[5];
        for (int i=0;i<array.length;i++){
            System.out.println("Enter number");
            array[i]=input.nextDouble();
            System.out.println(array[i]);
        }

    }
}
