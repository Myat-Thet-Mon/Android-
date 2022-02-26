package ch7_selfTest;

import java.util.Scanner;

class OneWayNoRepeatList {

    public String[] getEntryArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = input.nextInt();
        String[] entryArray = new String[size];
        for (int i = 0; i < entryArray.length; i++) {
            System.out.println("Enter string");
            String inputString=input.nextLine();
            entryArray[i] = inputString;
        }
        return entryArray;
    }
}

public class Exercise22 {
    public static void main(String[] args) {
        OneWayNoRepeatList oneWayNoRepeatList = new OneWayNoRepeatList();
        for (int i = 0; i < oneWayNoRepeatList.getEntryArray().length; i++) {
            System.out.println("Your data is " + oneWayNoRepeatList.getEntryArray()[i]);
        }
    }
}
