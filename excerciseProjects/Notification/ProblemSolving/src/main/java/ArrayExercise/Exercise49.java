package ArrayExercise;

import java.util.Arrays;

public class Exercise49 {
    public static void main(String[] args) {
        int[]num={-1,4,5,-1,-2,6,7};
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>=0){
                num[count]=num[i];
                count++;
            }
        }
        int index=count;
        System.out.println("C "+count);
        for(int j=0;j<num.length;j++){
            if(num[j]<0){
                num[index]=num[j];
                index++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
