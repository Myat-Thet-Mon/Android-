package ch7_selfTest;

import java.util.Scanner;

public class Exercise11 {
    public static double[] getArrayOfHalves(double[] inputArray) {
        double[] outputArray = new double[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i] / 2;
        }
        return outputArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] inputArray = new double[5];
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Enter  number");
            inputArray[i] = input.nextDouble();
        }
        double[] outputArray = Exercise11.getArrayOfHalves(inputArray);
        for (int i = 0; i < outputArray.length; i++) {
            System.out.println("New number is " + outputArray[i]);
        }
    }
}
