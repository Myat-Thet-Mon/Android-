package ArrayExercise;

import java.util.Arrays;

public class Exercise16 {
    public static void main(String[] args) {
        int[] num = {2, 6, 8, 8, 2, 7};
        int[] newNum = new int[num.length];
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j <= i; j++) {
                if (num[i] == newNum[j]) {
                    duplicate = true;
                    break;

                }
            }
            if (duplicate == false) {
                newNum[i] = num[i];
                count++;
            }
        }

        int[] newNum2 = new int[count];
        int index = 0;
        System.out.println(newNum2.length);
        for (int i = 0; i < newNum.length; i++) {
            if (newNum[i] != 0) {
                newNum2[index] = newNum[i];
                index++;

            }
        }
        System.out.println(Arrays.toString(newNum));
        System.out.println(Arrays.toString(newNum2));
    }
}
