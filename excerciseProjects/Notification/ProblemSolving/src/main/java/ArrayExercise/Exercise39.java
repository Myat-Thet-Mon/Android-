package ArrayExercise;

public class Exercise39 {
    public static void main(String[] args) {
        int[] num = {2, 5, 1, 9, 6, 4};
        boolean result = false;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    result = true;
                } else {
                    result = false;
                    continue;
                }
            }
            System.out.println("R " + result);
//        if(result==true){
//            System.out.println("LEADER in the array "+num[i]);
//        }
        }
    }
}
