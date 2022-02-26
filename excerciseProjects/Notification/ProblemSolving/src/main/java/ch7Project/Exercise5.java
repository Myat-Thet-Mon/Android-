package ch7Project;

import ch7_selfTest.Exercise24;

import java.util.Scanner;

public class Exercise5 {
    public void insertionSort(int[] myArray) {
        int[]newArray=new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int tem = myArray[i];
                    myArray[i] = myArray[j];
                    newArray[i]=myArray[i];
                    myArray[j] = tem;
                    newArray[j]=myArray[j];
                }else {
                    newArray[i]=myArray[i];
                }
            }
        }
        for (int value : newArray) {
            System.out.println(value);
        }

    }

    public static void main(String[] args) {
        Exercise5 obj = new Exercise5();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter number");
            myArray[i] = input.nextInt();
        }
        obj.insertionSort(myArray);
    }
}
