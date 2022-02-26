package ArrayExercise;

public class Exercise35 {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 5, 6};
        int target = 6;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                       System.out.println("The sum of " + num[i] + " And " + num[j] + " is equal with target number");

                }



            }
        }
    }
}
