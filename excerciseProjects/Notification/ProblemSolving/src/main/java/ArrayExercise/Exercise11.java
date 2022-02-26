package ArrayExercise;

import java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args) {
        int[]num={3,5,7,8,9};
       // double index=(double) num.length/2;
        for(int i=0;i<num.length/2.;i++){
            int tem=num[i];
            num[i]=num[num.length-1-i];
            num[num.length-1-i]=tem;
        }
        System.out.println(Arrays.toString(num));
    }
}
