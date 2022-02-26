package ArrayExercise;

public class Exercise27 {
    public static void main(String[] args) {
        int[] one = {9, 3, 2, 5, 1, 7};
        int max = one[0];
        int min = one[0];
        if(one.length>=1) {
            for (int i = 1; i < one.length; i++) {
                if (one[i] > max) {
                    max = one[i];
                } else if (one[i] < min) {
                    min = one[i];
                }
            }
        }
        System.out.println("Largest " + max);
        System.out.println("Smallest " + min);
        int ans=max-min;
        System.out.println("The difference between largest and smallest "+ans);
    }
}
