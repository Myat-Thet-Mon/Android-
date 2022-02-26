package ArrayExercise;

public class Exercise43 {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 5, 6, 12, 5, 9};
        int target = 21;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int r = j + 1; r < num.length; r++) {
                    for (int c = r + 1; c < num.length; c++) {
                      if(num[i]+num[j]+num[r]+num[c]==target){
                          System.out.println(" four elements of a given array whose sum is equal to a given value "+
                                  num[i]+" "+num[j]+" "+num[r]+" "+num[c]);
                      }
                    }
                }


            }
        }
    }
}
