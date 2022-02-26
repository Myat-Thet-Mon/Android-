package ArrayExercise;

import java.util.Arrays;

public class Exercise52 {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5,6,7};
        int[]newNum=new int[num.length];
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                newNum[count]=num[i];
                count++;
            }
        }
        for(int i=0;i<num.length;i++){
            if(num[i]%2!=0){
                newNum[count]=num[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(newNum));
    }
}
