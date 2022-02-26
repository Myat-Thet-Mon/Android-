package ch7_selfTest;

public class Exercise23 {
    public static void main(String[] args) {
        int[] num = {7, 5, 1, 3, 6};
        for (int i = 0; i < num.length ; i++) {
            for (int j = i+1; j < num.length ; j++) {
                if (num[i] > num[j]) {
                    int tem = num[i];
                    num[i] = num[j];
                    num[j] = tem;
                }
            }
        }
        for (int value : num) {
            System.out.println(value);
        }
    }
}
