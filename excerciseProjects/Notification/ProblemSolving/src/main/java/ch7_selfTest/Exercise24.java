package ch7_selfTest;

import java.util.Scanner;

public class Exercise24 {
    public void selectionSort(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int tem = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = tem;
                }
            }
        }
        for (int value : myArray) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Exercise24 obj = new Exercise24();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter number");
            myArray[i] = input.nextInt();
        }
        obj.selectionSort(myArray);
    }
}
