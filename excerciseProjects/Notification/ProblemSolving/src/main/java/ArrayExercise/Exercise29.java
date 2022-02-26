package ArrayExercise;

import java.util.Arrays;

public class Exercise29 {
    public static void main(String[] args) {
        int[] one = {9, 3, 2, 5, 1, 7};
        int max = one[0];
        int min = one[0];
        for (int i = 1; i < one.length; i++) {
            if (one[i] > max) {
                max = one[i];
            } else if (one[i] < min) {
                min = one[i];
            }
        }
        System.out.println("Largest " + max);
        System.out.println("Smallest " + min);
        double average = 0;
        int sum = 0;
        for (int i = 0; i < one.length; i++) {
            if (one[i] != max && one[i] != min) {
                sum = one[i] + sum;
            }
        }
        average =(double) sum / (one.length - 2);
        System.out.println("Average " + average);
    }
}
