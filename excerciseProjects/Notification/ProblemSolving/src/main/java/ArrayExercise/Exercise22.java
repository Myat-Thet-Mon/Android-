package ArrayExercise;

import java.util.HashMap;
import java.util.Map;

public class Exercise22 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 2};
        int testNum = 4;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int data : array) {
            int num2 = testNum - data;
            if (map.getOrDefault(num2, false)) {
                System.out.println("The sum of " + data + " and " + num2 + " are equal with test number");
                return;
            } else {
                map.put(data, true);
            }
        }
        System.out.println("Two numbers are not equal with test number");
    }
}

