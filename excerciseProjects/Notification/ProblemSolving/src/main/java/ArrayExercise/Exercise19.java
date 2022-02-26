package ArrayExercise;

import java.util.Arrays;

public class Exercise19 {
    public static void main(String[] args) {
        int[][]one={{1,5,7},{1,2,3}};
        int[][]two={{2,4,6},{6,8,0}};
        int[][]three=new int[one.length][one[0].length];
        for(int i=0;i<one.length;i++){
          for(int j=0;j<one[0].length;j++){
              three[i][j]=one[i][j]+two[i][j];
          }
        }
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                System.out.println(three[i][j]);
            }
        }
    }
}
