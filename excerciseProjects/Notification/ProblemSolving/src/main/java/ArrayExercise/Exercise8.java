package ArrayExercise;

import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {
        int[]num={3,5,7,8,9};
        int[]newNum=new int[num.length];
        for(int i=0;i<num.length;i++){
            newNum[i]=num[i];
        }
        System.out.println("New array is "+Arrays.toString(newNum));
    }
}
