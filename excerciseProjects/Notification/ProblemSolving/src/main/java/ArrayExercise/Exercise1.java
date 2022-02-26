package ArrayExercise;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = {7, 2, 8, 1, 2};
        String[] inputString = {"Hate", "Apple", "Orange", "candy"};
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tem = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tem;
                }
            }
        }

            System.out.println(Arrays.toString(array));



        for (int i = 1; i < inputString.length; i++) {
            for (int j = 0; j < inputString.length - i; j++) {
                // System.out.println(inputString[j].toLowerCase().charAt(0));
                //  System.out.println(inputString[0].toLowerCase().charAt(0));
                if (inputString[j].toLowerCase().charAt(0) > inputString[j + 1].toLowerCase().charAt(0)) {
                    String tem = inputString[j];
                    //  System.out.println("A "+tem);
                    inputString[j] = inputString[j + 1];
                    inputString[j + 1] = tem;
                }
            }
        }
        for (String value : inputString) {
            System.out.println(value);
        }
    }
}
