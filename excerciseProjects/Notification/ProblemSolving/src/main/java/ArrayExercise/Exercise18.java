package ArrayExercise;

public class Exercise18 {
    public static void main(String[] args) {
        int[] num = {3, 6, 8, 8, 2, 1, 7};
        int min1 = Integer.MAX_VALUE;
        int min2 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min1) {
                min2 = min1;
                min1 = num[i];
            }
            if (num[i] > min1) {
                if (num[i] < min2) {
                    min2 = num[i];
                }
            }
        }
        System.out.println(min2);



//        for (int i = 1; i < num.length; i++) {
//            for (int j = 0; j < num.length - i; j++) {
//                if (num[j] > num[j + 1]) {
//                    int tem = num[j];
//                    num[j] = num[j + 1];
//                    num[j + 1] = tem;
//                }
//            }
//        }
//
//        for (int i = 1; i < num.length ; i++) {
//            if (num[0] < num[i]) {
//                System.out.println("second smallest is " + num[ i]);
//                break;
//            }
//        }
    }
}