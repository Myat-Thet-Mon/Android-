package ArrayExercise;

import java.util.Arrays;

public class Exercise51 {
    public static void main(String[] args) {
        int[]num={0,1,1,0,1,1,0};
        int []newNum=new int[num.length];
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==0){
                newNum[count]=num[i];
                count++;
            }
        }
        for(int i=0;i<num.length;i++){
            if(num[i]==1){
                newNum[count]=num[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(newNum));
    }
}
