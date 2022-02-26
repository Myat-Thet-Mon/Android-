package ch7Project;

import java.util.Scanner;

class ArraySorter {

    public static void selectionSort(int[] anArray) {
        for (int index = 0; index < anArray.length - 1; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
            interchange(index, indexOfNextSmallest, anArray);
        }
    }

    private static int getIndexOfSmallest(int startIndex, int[] a) {
        int min = a[startIndex];
        int indexOfMin = startIndex;
        for (int index = startIndex + 1; index < a.length; index++) {
            if (a[index] < min) {
                min = a[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    private static void interchange(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp; //original value of a[i]
    }

    public void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    interchange(i, j, numbers);

                }
            }
        }
        for (int value : numbers) {
            System.out.println(value);
        }
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number");
            numbers[i] = input.nextInt();
        }
        ArraySorter obj = new ArraySorter();
        obj.bubbleSort(numbers);


    }
}
